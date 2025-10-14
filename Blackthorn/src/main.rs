use std::io;

fn main() {
    let mut buf = String::new();
    io::stdin().read_line(&mut buf).unwrap();
    buf = buf.trim().to_owned();
    println!("{}", if buf.contains("kth") {"yes"} else {"no"});
}
