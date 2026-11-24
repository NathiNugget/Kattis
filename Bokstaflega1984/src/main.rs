use std::io;

fn main() {
    let mut buf = String::new();
    io::stdin().read_line(&mut buf).unwrap();

    println!("{}", match buf.trim() {


        "1984" => "Literally 1984",

    _ => "Not 1984... yet"});
}
