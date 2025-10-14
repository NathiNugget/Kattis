use std::io;

fn main() {
    let mut buf = String::new();
    io::stdin().read_line(&mut buf).unwrap();
    let num1 = buf.trim().parse::<i32>().unwrap();
    buf.clear();
    io::stdin().read_line(&mut buf).unwrap();
    let num2 = buf.trim().parse::<i32>().unwrap();
    println!("{}", num1 * num2);
}
