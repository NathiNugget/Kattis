use std::io;
use std::io::BufRead;

fn main() {
    let in_stream = io::stdin();
    let mut input_lines = in_stream.lock().lines();
    let dist = input_lines.next().unwrap().unwrap();
    let mut tokens = dist.split_whitespace();
    let distance :i32 = tokens.next().unwrap().parse().unwrap();
    let potions = tokens.next().unwrap().parse::<i32>().unwrap();
    println!("{}", if distance <= potions * 360 {"YES"} else {"NO"});

}
