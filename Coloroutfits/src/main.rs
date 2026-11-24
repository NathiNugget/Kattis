use std::io;

fn main() {
    let mut buf = String::new();
    io::stdin().read_line(&mut buf).unwrap();
    let mut people = buf.trim().parse::<i32>().unwrap();
    let mut colors = 2;
    println!("{}", match people % colors == 0 {
        true => {2}
        false => {3}
    });
}
