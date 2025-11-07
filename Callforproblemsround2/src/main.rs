use std::cmp::Ordering;
use std::collections::HashSet;
use std::io;
use std::io::Read;

fn main() {
    let mut buf = String::new();
    io::stdin().read_to_string(&mut buf).unwrap();
    let mut lines = buf.lines();
    let line = lines.next().unwrap();
    let nums = line.split_ascii_whitespace().map(|x| x.parse::<i32>().unwrap()).collect::<Vec<i32>>();
    let n = nums[0];
    let k = nums[1];
    let mut num_set: HashSet<i32> = HashSet::new();
    for line in lines {
        num_set.insert(line.parse::<i32>().unwrap());
    }
    println!("{}", match k.cmp(&(num_set.iter().count() as i32)) {
        Ordering::Less => {k}
        Ordering::Equal => {k}
        Ordering::Greater => { num_set.iter().count() as i32}
    });

}