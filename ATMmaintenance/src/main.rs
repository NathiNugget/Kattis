use std::io;
use std::io::Read;

fn main() {
    let mut buf = String::new();
    io::stdin().read_to_string(&mut buf).unwrap();
    let ls = buf.lines().collect::<Vec<_>>();
    let mut nums = ls[0]
        .trim()
        .split(' ')
        .map(|x| x.parse::<i32>().unwrap())
        .collect::<Vec<_>>();
    let people = nums[0];
    let mut money = nums[1];
    nums = ls[1]
        .split_whitespace()
        .map(|x| x.parse::<i32>().unwrap())
        .collect::<Vec<_>>();
    let mut output = String::new();
    for i in nums.iter() {

        if money >= *i {
            output += "1";
            money -= i;
        } else {
            output += "0"
        };

    }
    println!("{}", output);
}
