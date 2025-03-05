use std;

fn main() {
    let mut input = String::new();
    let _ = std::io::stdin().read_line(&mut input).unwrap();
    let num = input.trim().parse::<i32>().unwrap();
    if num == 0 || num == 7 {
        println!("{}", num);
    }
    else {println!("{}", num+1); }
}
