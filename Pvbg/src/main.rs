use std::io::Read;

fn main() {
    let mut buf = String::new();
    std::io::stdin().read_to_string(&mut buf).unwrap();
    let mut lines = buf.lines().skip(1);
    let line = lines.next().unwrap();
    let min = line.split_ascii_whitespace().map(|x| x.parse::<i32>().unwrap()).min().unwrap();
    println!("{}", min+1);
}
