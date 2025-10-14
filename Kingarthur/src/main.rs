use std::f64::consts::PI;
use std::io::Read;

fn main() {
    let mut buf = String::new();
    std::io::stdin().read_to_string(&mut buf).unwrap();
    let lines : Vec<&str> = buf.split('\n').collect();

    println!("{}", match PI*lines[0].trim().parse::<f64>().unwrap() >= lines[2].trim().parse::<f64>().unwrap() * lines[1].trim().parse::<f64>().unwrap() {
        true => "YES",
        false => "NO"
    });


}
