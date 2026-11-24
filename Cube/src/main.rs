use std::io;

fn main() {
    let mut buf = String::new();
    io::stdin().read_line(&mut buf).unwrap();
    let mut num : i32 = buf.trim().parse().unwrap();
    println!("{}", num.pow(3))
}
