use std::io;

fn main() {
    let mut buf = String::new();
    io::stdin().read_line(&mut buf).unwrap();
    let w : usize = buf.trim().parse().unwrap();
    buf.clear();
    io::stdin().read_line(&mut buf).unwrap();
    let l : usize = buf.trim().parse().unwrap();
    println!("{}", l*w);
}
