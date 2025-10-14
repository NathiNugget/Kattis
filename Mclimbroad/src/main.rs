use std::io;

fn main() {
    let mut buf = String::new();
    let _ = io::stdin().read_line(&mut buf).unwrap();
    let feet = buf.trim_end().parse::<f64>().unwrap() * 5280.0;
    buf.clear();
    let _ = io::stdin().read_line(&mut buf).unwrap();
    let interval = buf.trim_end().parse::<f64>().unwrap();
    let times_squirted = (feet / interval) as u32;
    println!("{}", times_squirted);

}
