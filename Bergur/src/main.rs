use std::collections::LinkedList;
use std::io;
use std::ops::Index;

fn main() {
    let mut input = String::new();
    io::stdin().read_line(&mut input).unwrap();
    input.clear();
    io::stdin().read_line(&mut input).unwrap();
    let mut nums: LinkedList<i32> = LinkedList::new();
    nums = input
        .trim()
        .split_whitespace()
        .map(|num| num.parse().unwrap())
        .collect();
    let mut max_time = 0;
    let mut min_val = nums.iter().min().unwrap().to_owned();
    let mut min_idx = nums.iter().position(|&x| x == min_val).unwrap();
    let mut iteration = 0;
    while !nums.is_empty() {
        if iteration > min_idx {
            iteration = 0;
            min_val = nums.iter().min().unwrap().to_owned();
            min_idx = nums.iter().position(|&x| x == min_val).unwrap();
        }
        max_time += min_val;
        iteration += 1;
        nums.pop_front();
    }
    println!("{}", max_time);
}
