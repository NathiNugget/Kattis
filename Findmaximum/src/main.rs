use std::io;
use std::io::Read;

fn main() {
    let mut buffer = String::new();
    io::stdin().read_line(&mut buffer).unwrap();
    let num1 = buffer.trim().parse::<i32>().unwrap();
    buffer.clear();
    io::stdin().read_line(&mut buffer).unwrap();
    let num2 = buffer.trim().parse::<i32>().unwrap();
    buffer.clear();
    io::stdin().read_line(&mut buffer).unwrap();
    let num3 = buffer.trim().parse::<i32>().unwrap();
    println!("{}", num1.max(num2).max(num3));

}
