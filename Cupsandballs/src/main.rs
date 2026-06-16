use std::io;
use std::io::Read;
use std::mem::{replace, swap};

#[derive(Debug)]
struct cup {
    has_ball: bool,
}

fn main() {
    let mut arr : [cup; 3] = [cup{has_ball: false}, cup{has_ball: true}, cup{has_ball: false}];
    let mut input = String::new();
    io::stdin().read_to_string(&mut input).unwrap();
    let mut lines = input.lines();
    let guess = lines.next().unwrap().trim().parse::<i32>().unwrap();
    for line in lines.skip(1) {
        let mut tokens_in_line = line.split_whitespace();
        let left = tokens_in_line.next().unwrap().parse::<i32>().unwrap();
        let right = tokens_in_line.next().unwrap().parse::<i32>().unwrap();
        arr.swap(left as usize-1, right as usize-1);

    }

    let idx_of_ball = arr.iter().position(|x| x.has_ball).unwrap();

    if arr[guess as usize-1].has_ball {
        match guess {
            1 => {
                println!("2 3");
            },
            2 => {
                println!("1 3");
            },
            _ => {
                println!("1 2");
            }
        }
    } else {

        println!("{} {}", idx_of_ball+1, guess);
    }


}
