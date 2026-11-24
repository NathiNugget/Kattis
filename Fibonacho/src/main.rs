use std::io;

fn main() {
    let mut buf = String::new();
    io::stdin().read_line(&mut buf).unwrap();
    let mut tks = buf.split_whitespace();
    let a3 = tks.next().unwrap().parse::<i32>().unwrap();
    let a4 = tks.next().unwrap().parse::<i32>().unwrap();
    let a5 = tks.next().unwrap().parse::<i32>().unwrap();
    let a2 = a5-a4;
    let a1 = a4-a3;
    let a0 = a3-a2;
    println!("{} {} {}", a0, a1, a2);
}
