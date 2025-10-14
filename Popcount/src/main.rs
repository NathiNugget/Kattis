use std::io;

fn main() {
    let mut buf = String::new();
    io::stdin().read_line(&mut buf).unwrap();
    let line = buf.trim();
    let count :i32 = line.chars().filter(|&c| c == '1').count() as i32;
    println!("{}", count);
}
