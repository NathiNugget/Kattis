use std::io;
use std::io::Read;

fn main() {
    let mut buf = String::new();
    io::stdin().read_to_string(&mut buf).unwrap();
    let mut lines = buf.lines();
    let mut numbers = lines.map(|line| line.parse::<i64>().unwrap()).collect::<Vec<i64>>();
    let mut max = numbers[0];
    for n in numbers {
        if n > max {
            max = n;
        }
    }
    println!("{}", max);

}
