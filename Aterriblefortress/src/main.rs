use std::io::Read;

fn main() {
    let mut input = String::new();
    std::io::stdin().read_to_string(&mut input);
    let numbers :Vec<i32> = input.lines().skip(1).map(|line| line.parse().unwrap()).collect();
    let sum = numbers.iter().fold(0, |acc, num| acc + num);
    println!("{}", sum);



}
