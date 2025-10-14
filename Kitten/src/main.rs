use std::collections::HashMap;
use std::io::{self, Read};

fn main() {
    let mut buf = String::new();
    io::stdin().read_to_string(&mut buf).unwrap();

    let mut lines = buf.lines();
    let stuck_branch = lines.next().unwrap().parse::<i32>().unwrap();

    let mut parent_map = HashMap::new();

    for line in lines {
        if line.trim() == "-1" {
            break;
        }

        let nums: Vec<i32> = line
            .split_whitespace()
            .map(|s| s.parse::<i32>().unwrap())
            .collect();

        let parent = nums[0];
        for &child in &nums[1..] {
            parent_map.insert(child, parent);
        }
    }


    let mut path = vec![stuck_branch];
    while let Some(&parent) = parent_map.get(path.last().unwrap()) {
        path.push(parent);
    }

    // Print the path
    let output = path.iter().map(|n| n.to_string()).collect::<Vec<_>>().join(" ");
    println!("{}", output);
}
