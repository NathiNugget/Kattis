fn main() {
    let mut input = String::new();
    std::io::stdin().read_line(&mut input).unwrap();
    let num = input.trim().parse::<i32>().unwrap();
    for i in 1..=num {
        println!("{}", i);
    }


}
