use std::io;
use std::io::Read;

fn main() {
    let mut buf = String::new();
    io::stdin().read_line(&mut buf).unwrap();
    buf.clear();
    io::stdin().read_to_string(&mut buf).unwrap();
    buf = buf.trim().to_string();

    let mut current :u32 = 0;
    let mut max :u32 = 0;

    let lines = buf.lines();
    for line in lines {
        let nums = line.split(" ").map(|x| x.parse::<u32>().unwrap()).collect::<Vec<_>>();
        current -= nums[0];
        current += nums[1];
        if current >= max { max = current; }
    }
    println!("{}", max);
}
