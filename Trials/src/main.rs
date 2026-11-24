use std::io;
use std::io::Read;

fn main() {
    let mut buf = String::new();
    io::stdin().read_to_string(&mut buf).unwrap();
    let mut lines = buf.lines();
    let mut nums = [0f64; 3];
    for i in 0..3 {
        let next = lines.next().unwrap().parse::<f64>().unwrap();
        nums[i] = next;

    }
    let s : f64 = (nums.iter().fold(0f64, |acc, x| acc + x) / 2f64) ;
    let A = ((s*(s-nums[0])*(s-nums[1])*(s-nums[2])) as f64).sqrt();
    println!("{}", A);



}