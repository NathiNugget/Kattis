use std::io;
use std::io::Read;

fn main() {
    let mut buf = String::new();
    io::stdin().read_to_string(&mut buf).unwrap();
    let mut lines = buf.lines();
    let mut tokens = lines.next().unwrap().split(' ');
    let mut n :i32 = tokens.next().unwrap().parse().unwrap();
    let mut m : i32 = tokens.next().unwrap().parse().unwrap();
    let mut sum = 0;
    for line in lines {
        sum += line.parse::<i32>().unwrap();
    }
    println!("{}", match sum % n == 0 {
        true => {"1"}
        false => {"0"}
    })

}
