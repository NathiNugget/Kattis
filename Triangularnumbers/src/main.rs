use std::io;

fn main() {
    let mut buf = String::new();
    io::stdin().read_line(&mut buf).unwrap();
    let num = buf.trim().parse::<u64>().unwrap();
    let mut sum:u64 = 0;
    for x in 0..num {
        sum += x+1;
        println!("{}", sum);
    }
}
