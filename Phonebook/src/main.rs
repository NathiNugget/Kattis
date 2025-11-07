use std::io;
use std::io::Read;

fn main() {
    let mut buf = String::new();
    io::stdin().read_to_string(&mut buf).unwrap();
    let mut lines = buf.lines().skip(1);




    let found = lines
        .filter(|line| line.contains("+39") && (12..=13).contains(&line.chars().count()))
        .count();
    println!("{}", found);

}
