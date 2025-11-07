use std::cmp::Ordering;
use std::collections::HashMap;
use std::io;
use std::io::Read;

fn main() {
    let mut buf = String::new();
    io::stdin().read_to_string(&mut buf);
    let mut name_map : HashMap<String, String> = HashMap::new();
    let lines = buf.lines().skip(1);
    for line in lines {
        let parts = line.split_whitespace().collect::<Vec<_>>();
        let name = parts[0].to_string();
        let num = parts[1].parse::<i32>().unwrap();
        let date = parts[2].to_string();
        let val = format!("{} {}", name, num);
        if name_map.contains_key(&date) {
            let existing_num = name_map.get(&date).unwrap().split_whitespace().nth(1).unwrap().parse::<i32>().unwrap();
            match num.cmp(&existing_num){
                Ordering::Less => {continue}
                Ordering::Equal => {continue}
                Ordering::Greater => {name_map.entry(date).and_modify(|x| *x = val.clone());}
            }
        } else {
            name_map.insert(date, val);
        }


    }

    let mut res :Vec<String> = Vec::new();
    name_map.values().for_each(|x| res.push(x.split_whitespace().nth(0).unwrap().to_string()));
    res.sort();
    println!("{}", res.iter().count());
    res.iter().for_each(|x| println!("{}", x));
}
