use std::io;
use std::io::Read;

fn main() {
    let mut buf = String::new();
    io::stdin().read_to_string(&mut buf).unwrap();
    let mut lines = buf.lines().skip(1);
    let mut factors : Vec<i32> = vec![];
    let mut wieghts : Vec<i32> = vec![];
    for line in lines {
        let mut weights = line.split_whitespace()
            .map(|x| x.parse::<i32>().unwrap())
            .collect::<Vec<i32>>();
        let factor = weights[0] * weights[1];
        let weight = weights[2];
        factors.push(factor);
        wieghts.push(weight);

    }

    factors.sort();
    wieghts.sort();
    let mut total_weight :i64 = 0;
    for i in 0..factors.len() {
        total_weight += (factors[i] * wieghts[i]) as i64;
    }

    println!("{}", total_weight);
}
