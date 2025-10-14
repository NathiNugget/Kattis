use std::io;
use std::io::Read;

fn main() {
    let mut input = String::new();
    io::stdin().read_to_string(&mut input).unwrap();
    let mut lines = input.lines();
    let mut tokens = lines.next().unwrap().split_whitespace().skip(1);
    let mut times_broken = 0;
    let mut current_record :i32 = tokens.next().unwrap().parse().unwrap();
    let mut previous_record :i32 = tokens.next().unwrap().parse().unwrap();
    let mut num = 0;
    loop {

        if num > previous_record + current_record {
            previous_record = current_record;
            current_record = num;
            times_broken += 1;


        }
        if let Some(next_line) = lines.next() {
            num = next_line.trim().parse().unwrap();
        } else {break;}

    }
    println!("{}", times_broken);


}
