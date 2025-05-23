fn main() {
    let mut input = String::new();
    std::io::stdin().read_line(&mut input).unwrap();
    match input.trim().len() < 10 {
        true => {input = input.replace("\n", "d\n")}
        false => {input = input.replace(&input[0..1], " ")}
    }
    println!("{}", input);
}
