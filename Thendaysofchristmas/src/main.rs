use std::io;
use std::io::BufRead;

fn main() {
    let input = io::stdin();
    let mut lines = input.lock().lines();
    let num = lines.next().unwrap().unwrap().parse::<i32>().unwrap();

    let mut local_sum = 0;

    let mut total_sum = 0;
    local_sum = num * (num + 1) / 2;
    total_sum = num * (num + 1) * (num + 2) / 6;
    println!("{}", local_sum);
    println!("{}", total_sum);
}
