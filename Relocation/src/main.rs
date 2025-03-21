use std::io::Read;
use std::str::SplitWhitespace;

fn main() {
    let mut input = String::new();
    let _ = std::io::stdin().read_line(&mut input).unwrap();


    let q:i32 = input.split_whitespace().nth(1).unwrap().parse().unwrap();

    input.clear();
    let _ = std::io::stdin().read_line(&mut input).unwrap();
    let mut orig_locations: Vec<i32> = input
        .trim()
        .split_whitespace()
        .map(|x| x.parse::<i32>().unwrap())
        .collect::<Vec<i32>>();
    input.clear();
    let _ = std::io::stdin().read_to_string(&mut input).unwrap();
    let mut lines = input.lines();
    let mut input_iterator :SplitWhitespace;
    for _i in 0..q {
        input_iterator = lines.next().unwrap().split_whitespace();
        let command:u32 = input_iterator.next().unwrap().parse().unwrap();
        let param_a :u32 = input_iterator.next().unwrap().parse().unwrap();
        let param_b:u32 = input_iterator.next().unwrap().parse().unwrap();
        match command {
            1 => {
                let idx  = param_a as usize -1;
                let new_location = param_b;
                orig_locations[idx] = new_location as i32;
            }
            2 => {
                let idx_a = param_a-1;
                let idx_b = param_b-1;
                let a = orig_locations[idx_a as usize];
                let b = orig_locations[idx_b as usize];

                println!("{}", (a-b).abs())
            }

            _ => {}
        }
    }
}
