use std::io;

fn main() {
    let mut buf = String::new();
    io::stdin().read_line(&mut buf).unwrap();
    let fahren = buf.trim().parse::<f64>().unwrap();
    println!("{}", ((fahren-32.0)/1.8).round());
}
