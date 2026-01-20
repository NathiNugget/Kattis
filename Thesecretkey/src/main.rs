use std::{io, u128};
use std::io::Read;

fn main() {
    let mut input = String::new();
    io::stdin().read_to_string(&mut input).unwrap();
    let mut lines = input.lines();
    let len:usize = lines.next().unwrap().parse().unwrap();

    let mut vals :Vec<u128> = vec![];

    for line in lines {
        let line_val= line.trim();

        let val = u128::from_str_radix(&line_val, 2).unwrap();
        vals.push(val);

    }

    let mut unique = vals[0] ^ 1;
    for num in vals.iter().skip(1) {
        unique = unique ^ num;

    }

    println!("{:0len$b}", unique, len = len);

}
