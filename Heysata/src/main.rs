use std::io::stdin;

fn main() {
    let good = "Unnar fann hana!";
    let bad = "Unnar fann hana ekki!";
    let mut input = String::new();
    stdin().read_line(&mut input).unwrap();
    input.clear();
    stdin().read_line(&mut input).unwrap();

    let some_char :char = input.trim().chars().nth(0).unwrap();
    input.clear();
    stdin().read_line(&mut input).unwrap();
    let line = input.trim();
    if line.contains(some_char) {println!("{}", good);} else {println!("{}", bad);}


}

