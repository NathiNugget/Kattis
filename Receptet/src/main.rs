use std::io;
use std::io::Read;

fn main() {
    let mut buf = String::new();
    io::stdin().read_line(&mut buf).unwrap();
    let N : usize = buf.trim().parse().unwrap();

    buf.clear();
    let mut cost = 0;
    let _ = io::stdin().read_to_string(&mut buf).unwrap();
    let mut owned = 0usize;
    let mut needed = 0usize;
    let mut item_cost = 0usize;

    let cost = buf.lines().fold(0, |acc, x| {
        let items = x.split_whitespace().map(|y| y.parse::<usize>().unwrap()).collect::<Vec<usize>>();
        owned = items[0];
        needed = items[1];
        item_cost = items[2];


        acc + match (owned > needed) {
            true => {0}
            false => {
                (needed - owned) * item_cost
            }
        }
    }
    );
    println!("{}", cost);

}
