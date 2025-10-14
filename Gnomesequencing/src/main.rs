use std::io::{self, Read};
use std::slice::Windows;

fn handle_input(input: &str) {
    let mut lns = input.lines();
    println!("Gnomes:");
    for line in lns.skip(1) {
        let nums: Vec<i32> = line
            .split_whitespace()
            .map(|x| x.parse().unwrap())
            .collect();
        let mut wind = nums.windows(2);
        let asc = wind.clone().all(|x| x[0] <= x[1]);
        let desc = wind.all(|x| x[0] >= x[1]);
        println!("{}", if asc || desc { "Ordered" } else { "Unordered" });
    }
}

fn main() {
    let mut buf = String::new();
    io::stdin().read_to_string(&mut buf).unwrap();

    handle_input(&*buf);
}
