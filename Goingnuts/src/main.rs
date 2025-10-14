use std::io;

fn main() {
    let mut buf = String::new();
    io::stdin().read_line(&mut buf).unwrap();
    let nuts = buf.trim().parse::<u32>().unwrap();

    let squirrels = nuts.count_ones(); // Built-in method to count set bits
    println!("{}", squirrels);
}
