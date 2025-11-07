use std::cmp::Ordering;
use std::io;
use std::io::Read;

fn main() {
    let mut buf = String::new();
    io::stdin().read_to_string(&mut buf).unwrap();
    let lines = buf.lines();
    for line in lines {
        if line == "0 0" {
            continue;
        }
        let jars :Vec<i32> = line.split_whitespace().map(|x| x.parse::<i32>().unwrap()).collect();
        let sweet = jars[0];
        let sour :i32 = jars[1];
        if sweet + sour == 13 {println!("Never speak again."); continue;}
        println!("{}", match sweet.cmp(&sour) {
            Ordering::Less => {"Left beehind."}
            Ordering::Equal => {"Undecided."}
            Ordering::Greater => {"To the convention."}
        });


    }
}
