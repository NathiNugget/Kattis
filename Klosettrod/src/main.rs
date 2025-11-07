use std::io::{self, Read};

fn main() {
    let mut buf = String::new();
    io::stdin().read_to_string(&mut buf).unwrap();

    let mut lines = buf.lines();
    let _n: usize = lines.next().unwrap().trim().parse().unwrap();
    let urgencies: Vec<i32> = lines.next().unwrap()
        .split_whitespace()
        .map(|x| x.parse().unwrap())
        .collect();

    let mut vals: Vec<(usize, i32)> = urgencies
        .into_iter()
        .enumerate()
        .map(|(i, val)| (i + 1, val))
        .collect();


    vals.sort_by(|a, b| b.1.cmp(&a.1));


    let output: Vec<String> = vals.into_iter().map(|(i, _)| i.to_string()).collect();
    println!("{}", output.join(" "));
}
