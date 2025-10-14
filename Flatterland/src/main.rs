use std::io;
use std::io::Read;

fn main() {
    let mut input = String::new();
    io::stdin().read_to_string(&mut input).unwrap();
    let mut lines = input.lines().take_while(|l| l.len() > 0).map(|l| l.parse::<i32>().unwrap()).collect::<Vec<i32>>();
    let mut iter = lines.iter();
    let num1 = iter.next().unwrap();
    let num2 = iter.next().unwrap();
    println!("{}", (num1-1) * num2);

}
