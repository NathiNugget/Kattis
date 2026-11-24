use std::io;

fn main() {
    let mut buf = String::new();
    io::stdin().read_line(&mut buf).unwrap();
    let num : u16 = buf.trim().parse().unwrap();
    (1..=num).rev().for_each(|num| println!("{}", num));

}
