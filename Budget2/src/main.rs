use std::io;
use std::io::Read;

fn main() {
    let mut buf = String::new();
    io::stdin().read_to_string(&mut buf).unwrap();
    let mut lines = buf.lines();
    let mut budget = lines.next().unwrap().parse::<i32>().unwrap();
    budget = lines.fold(budget, |acc, x| acc - x.parse::<i32>().unwrap());
    match budget >= 0 {
        true => {
            println!("Budget is sufficient.");
        }
        false => {
            println!("Budget is insufficient.");

        }
    }


}
