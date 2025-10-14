fn main() {
    let mut input = String::new();
    std::io::stdin().read_line(&mut input).unwrap();
    let numbers :Vec<f64> = input.trim().split(' ').map(|x| x.parse::<f64>().unwrap()).collect();
    let square = numbers[0];
    let radius = numbers[1];
    if radius * 2_f64.sqrt() >= square {
        println!("fits");
    } else {
        println!("nope");
    }
}
