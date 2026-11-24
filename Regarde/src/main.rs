use std::io;
use std::io::Read;
use std::ops::Add;

fn main() {
    let mut buf = String::new();
    io::stdin().read_to_string(&mut buf).unwrap();
    let mut lines = buf.lines().skip(1);
    let s = "sh";
    for line in lines {
        let num_s = line.parse::<i32>().unwrap();
        let mut output = s.to_string().add(("h".repeat((num_s) as usize).as_str()));
        println!("{}", output);
    }
}