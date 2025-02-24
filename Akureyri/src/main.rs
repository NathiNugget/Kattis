use std::collections::HashMap;
use std::io;

fn main() {
    let mut buf: String = String::new();
    let _ = io::stdin().read_line(&mut buf);
    let problems: u32 = buf.trim().parse().unwrap();
    buf.clear();
    let _ = io::stdin().read_line(&mut buf);
    let teams :u32 = buf.trim().parse().unwrap();
    buf.clear();
    let _ = io::stdin().read_line(&mut buf);
    let names :Vec<String> = buf.

}

