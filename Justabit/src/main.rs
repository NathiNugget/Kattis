use std::io;

fn main() {
    let mut buf = String::new();
    io::stdin().read_line(&mut buf).unwrap();
    let mut zeroes = 0usize;
    let mut ones = 0usize;
    buf.chars().for_each(|c| {
        if c == '0' { zeroes += 1; }
        else if c == '1' { ones += 1; }
    });
    println!("{} {}", zeroes, ones);
}
