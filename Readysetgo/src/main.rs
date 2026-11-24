use std::io;

fn main() {
    let mut buf = String::new();
    io::stdin().read_line(&mut buf);
    let mut nums = buf.split_ascii_whitespace();
    let x = nums.next().unwrap().parse::<i32>().unwrap();
    let y = nums.next().unwrap().parse::<i32>().unwrap();
    println!("{}", x-y);
}
