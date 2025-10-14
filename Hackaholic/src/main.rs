use std::io;
use std::io::{BufRead, Read};

fn main() {
    let mut line = String::new();
    io::stdin().read_line(&mut line);
    let num1 : i32 = line.trim().parse().unwrap();
    line.clear();
    io::stdin().read_line(&mut line);

    let num2 : i32 = line.trim().parse().unwrap();
    line.clear();
    io::stdin().read_line(&mut line);
    let num3 : i32 = line.trim().parse().unwrap();


    println!("{}", num1*num3);

}
