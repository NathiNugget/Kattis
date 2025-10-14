use std::io;
use std::io::BufRead;

fn main() {
    let stdin = io::stdin();
    let mut lines = stdin.lock().lines();

    println!("{}", lines.next().unwrap().unwrap().trim().parse::<i32>().unwrap() * lines.next().unwrap().unwrap().trim().parse::<i32>().unwrap());
}
