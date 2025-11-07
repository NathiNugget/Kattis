use std::collections::HashMap;
use std::io;
use std::io::Read;

fn main() {
    let mut buf = String::new();
    io::stdin().read_to_string(&mut buf).unwrap();
    let mut lines = buf.lines();
    let line = lines.next().unwrap();
    let nums = line
        .split_ascii_whitespace()
        .map(|x| x.parse::<i32>().unwrap())
        .collect::<Vec<i32>>();
    let mut drinks: Vec<&str> = vec![];

    for _ in 0 .. nums[0] {
        drinks.push(&lines.next().unwrap());
    }
    let mut map = HashMap::<&str, u32>::new();


    while let Some(line) = lines.next() {

        map.entry(line).and_modify(|x| *x += 1).or_insert(0);
        println!("{}", drinks.get(map[&line] as usize).unwrap());

    }

}
