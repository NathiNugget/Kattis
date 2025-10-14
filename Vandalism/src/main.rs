use std::io;
use std::io::BufRead;

fn main() {
let mut orig :Vec<char> = vec!('U', 'A', 'P', 'C');
    let input_line = io::stdin().lock().lines().next().unwrap().unwrap();
    input_line.chars().for_each(|c| {
        orig.remove(orig.iter().position(|q| c.eq(q) ).unwrap());
    });
        
    println!("{}", String::from(orig.iter().collect::<String>())    );

} 
