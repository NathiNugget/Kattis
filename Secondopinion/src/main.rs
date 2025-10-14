use std::io;
use std::io::BufRead;

fn main() {
    let input = io::stdin();
    let mut input_lines = input.lock().lines();
    if let Ok(num) = input_lines.next().unwrap().unwrap().trim().parse::<i32>() {
        let hours = num / 3600;
        let minutes = (num % 3600) / 60;
        let seconds = num % 60;
        println!("{} : {} : {}", hours, minutes, seconds);

    }
}
