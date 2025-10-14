use std::io;

fn main() {
    let mut buf = String::new();
    io::stdin().read_line(&mut buf).unwrap();
    let i = buf.trim().parse::<i32>().unwrap();
    println!("{}", match i > 12{
        true => {i+1}
        false => {i}
    });
}
