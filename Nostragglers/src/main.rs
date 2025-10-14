use std::cmp::Ordering;
use std::io;
use std::io::Read;

fn main() {
    let mut buf = String::new();
    io::stdin().read_line(&mut buf).unwrap();

    let num = buf.trim_end().parse::<i32>().unwrap();
    buf.clear();
    io::stdin().read_to_string(&mut buf).unwrap();
    let lines = buf.trim_end().split('\n');
    let mut words : Vec<&str>;
    let mut num : u16 = 0;
    let mut total : u16 = 0;
    for line in lines {
        words = line.trim().split(' ').collect();
        match words[1].contains("IN") {
            true => {
                total += words[2].parse::<u16>().unwrap();
            }
            false => {
                total -= words[2].parse::<u16>().unwrap();
            }
        }

    }
    println!("{}", match 0.cmp(&total) {


        Ordering::Equal => "NO STRAGGLERS".to_string(),
        _ => { total.to_string()


        }
    });

}
