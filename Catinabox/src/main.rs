use std::cmp::Ordering;
use std::io;
use std::io::Read;

fn main() {
    let mut buf = String::new();
    io::stdin().read_to_string(&mut buf);
    let numbers = buf.lines()
        .nth(0)
        .unwrap()
        .split_whitespace()
        .map(|x| x.parse::<i32>().unwrap()).collect::<Vec<i32>>();

    let v = numbers[0]*numbers[1]*numbers[2];
    println!("{}", match v.cmp(&numbers[3]) {
        Ordering::Less => {"TOO TIGHT"}
        Ordering::Equal => {"COZY"}
        Ordering::Greater => {"SO MUCH SPACE"}
    });




}
