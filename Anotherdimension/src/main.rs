use std::f64::consts::PI;
use std::io;

fn main() {
    let mut buf = String::new();
    io::stdin().read_line(&mut buf).unwrap();
    let r = buf.trim().parse::<f64>().unwrap()/2f64;
    let V : f64 = ((4f64/3f64)*(PI as f64)*(r.powf(3f64)))/2f64;
    println!("{}", V);


}
