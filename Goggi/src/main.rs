use std::cmp::Ordering;
use std::io;

fn main() {
    let mut input = String::new();
    io::stdin().read_line(&mut input);
    let numbers :Vec<i32> = input.trim().split(" ? ").map(|s| s.parse::<i32>().unwrap()).collect();
    match numbers[0].cmp(&numbers[1]) {
        Ordering::Less => {println!("<")}
        Ordering::Equal => {println!("Goggi svangur!")}
        Ordering::Greater => {println!(">")}
    }
}
