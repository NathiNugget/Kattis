use std::collections::HashMap;
use std::io::Read;
use std::ops::Add;

fn main() {
    let mut buf = String::new();
    std::io::stdin().read_to_string(&mut buf).unwrap();
    let mut counter = 1;
    let mut lookup:HashMap<char, i32> = HashMap::new();
    let mut lines = buf.lines().skip(1);
    for i in 'A'..='Z'{


        counter += 1;
        lookup.insert(i, counter);
    }
    let mut val = 0;
    let mut chars = lines.next().unwrap().chars();
    let mut ch1 = chars.next().unwrap();
    let mut ch2 = chars.next().unwrap();
    let mut current_warehouse = String::new();
    current_warehouse.push(ch1);
    current_warehouse.push(ch2);
    let mut total_dist = 0;

    while let Some(line) = lines.next() {

        chars = line.chars();
        ch1 = chars.next().unwrap();
        ch2 = chars.next().unwrap();
        let mut current_chars = current_warehouse.chars();
        let current_first_val = lookup.get(&current_chars.next().unwrap()).unwrap();
        let current_second_val = lookup.get(&current_chars.next().unwrap()).unwrap();

        let first_val = lookup.get(&ch1).unwrap().clone();
        let second_val = lookup.get(&ch2).unwrap().clone();
        let to_add = (current_first_val - first_val).abs() + (current_second_val - second_val).abs();

        total_dist += to_add;
        current_warehouse.clear();
        current_warehouse.push(ch1);
        current_warehouse.push(ch2);


    }
    println!("{}", total_dist);
}
