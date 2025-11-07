use std::collections::HashMap;
use std::io::Read;

fn main() {

    let mut my_map:HashMap<&str, bool> = HashMap::new();
    let mut buf = String::new();
    std::io::stdin().read_to_string(&mut buf);
    let mut lines = buf.lines().skip(1);
    for line in lines {
        let vals = line.split_ascii_whitespace().collect::<Vec<&str>>();
        match vals[0] {
            "INNTAK" => {my_map.insert(vals[1], INNTAK(vals[2]));},
            "EKKI" => {my_map.insert(vals[2], EKKI(*my_map.get(vals[1]).unwrap()));}
            "OG" => {my_map.insert(vals[3],OG(*my_map.get(vals[1]).unwrap(), *my_map.get(vals[2]).unwrap()));}
            "EDA" => {my_map.insert(vals[3],EDA(*my_map.get(vals[1]).unwrap(), *my_map.get(vals[2]).unwrap()));}
            "UTTAK" => {UTTAK(*my_map.get(vals[1]).unwrap(), vals[1]);}
            _ => {}
        }
    }

}

fn OG(first: bool, second: bool) -> bool {
    first && second
}

fn EDA(first: bool, second: bool) -> bool {
    first || second
}

fn EKKI(input: bool) -> bool {
    !input
}

fn INNTAK(input: &str) -> bool {
    input.eq("SATT")
}

fn UTTAK(input: bool, name: &str) -> () {
    println!("{} {}", name, match input{
        true => "SATT",
        false => "OSATT",
    })
}
