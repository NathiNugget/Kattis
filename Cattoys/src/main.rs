use std::io;
use std::io::{BufRead, Read};

fn main() {
    let mut buf = String::new();
    io::stdin().read_to_string(&mut buf).unwrap();
    let nums = buf.split_whitespace().map(|X|X.parse::<f32>().unwrap()).collect::<Vec<f32>>();

    let num1 = nums[0];
    let num2 = nums[1];

    println!("{}", (num1/num2).ceil() as i32);


}
