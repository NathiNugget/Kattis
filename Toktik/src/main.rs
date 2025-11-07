use std::collections::HashMap;
use std::io::{self, Read};

fn main() {
    let mut buf = String::new();
    io::stdin().read_to_string(&mut buf).unwrap();

    println!(
        "{}",
        buf.lines()
            .skip(1)
            .fold(HashMap::<&str, i32>::new(), |mut acc, line| {
                let mut vals = line.split(" ");
                let name = vals.next().unwrap();
                let value = vals.next().unwrap().parse::<i32>().unwrap();
                acc.entry(name).and_modify(| x| *x += value).or_insert(value);

                acc
            }).iter().max_by_key( |&(_, val)| val).unwrap().0
    );
}
