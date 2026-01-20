use std::io;

fn main() {
    let mut input = String::new();
    io::stdin().read_line(&mut input).unwrap();
    input.clear();
    io::stdin().read_line(&mut input).unwrap();
    let mut nums = input.split_whitespace().map(|x| x.parse::<i32>().unwrap()).collect::<Vec<i32>>();
    nums.sort();
    println!("{}", nums[nums.len()-2]);
    
}
