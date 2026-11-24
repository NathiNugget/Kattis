use std::f32::consts::PI;
use std::io;
use std::io::Read;

fn main() {
    let mut buf = String::new();
    io::stdin().read_to_string(&mut buf).unwrap();
    let mut lines = buf.lines();
    let mut x = lines.next().unwrap().parse::<f64>().unwrap();
    let mut y = lines.next().unwrap().parse::<f64>().unwrap();
    let mut z = lines.next().unwrap().parse::<f64>().unwrap();
    x = x.powf(2f64) * PI as f64;
    y = y.powf(2f64) * PI as f64 * z;
    println!("{}", match x <= y { true => "Jebb", false => "Neibb" } );

}
