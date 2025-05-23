use std::io::Read;

fn main() {
    let mut input = String::new();
    std::io::stdin().read_to_string(&mut input).unwrap();

    let lines :Vec<String> = input.lines().map(|line| line.to_string()).collect();
    let s = lines.join("");
    println!("{}", s);
}
