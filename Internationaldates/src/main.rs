use std::io;

fn main() {
    let mut buf = String::new();
    io::stdin().read_line(&mut buf).unwrap();
    buf = buf.trim().to_string();
    let vals = buf.split("/").collect::<Vec<_>>();
    let first = vals[0].parse::<i32>().unwrap();
    let second = vals[1].parse::<i32>().unwrap();
    println!("{}", match (first > 12, second > 12) {

        (true, false) => {"EU"}
        (false, true) => {"US"}
        (false, false) => {"either"}
        _ => {"either"}
    });
}
