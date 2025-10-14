use std::io;
use std::ops::Index;

fn main() {
    let mut buf = String::new();
    io::stdin().read_line(&mut buf).unwrap();
    buf = buf.trim().to_string();
    let idx:Option<usize> = buf.find("tree");
    println!("{}", match idx {
        Some(i) => idx.unwrap().to_string(),
        None => "no trees here".to_string(),
    })
}
