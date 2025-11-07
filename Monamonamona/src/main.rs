use std::io;

fn main() {
    let mut buf = String::new();
    io::stdin().read_line(&mut buf);
    let name :String = buf.trim().split_whitespace().next().unwrap().to_owned() + " ";
    println!("{}", name.repeat(3).trim());
}
