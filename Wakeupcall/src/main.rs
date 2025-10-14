use std::cmp::Ordering;
use std::io::Read;

fn main() {
    let mut input = String::new();
    std::io::stdin().read_to_string(&mut input).unwrap();
    let mut input_lines = input.lines();
    let numbers_1 = input_lines.nth(1).unwrap().split_whitespace().map(|x| x.parse::<i32>().unwrap()).sum::<i32>();
    let numbers_2 = input_lines.nth(0).unwrap().split(' ').map(|x| x.parse::<i32>().unwrap()).sum::<i32>();
    println!("{}", match numbers_1.cmp(&numbers_2) {
        Ordering::Less => {"Button 2"}
        Ordering::Equal => {"Oh no"}
        Ordering::Greater => {"Button 1"}
    });
}
