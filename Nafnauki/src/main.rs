use std::io;

fn main() {
    let mut input = String::new();
    io::stdin().read_line(&mut input);

    let tokens = input.split(".").collect::<Vec<&str>>();
    println!("{}", String::from(".".to_owned() + tokens.last().unwrap()) );
}
