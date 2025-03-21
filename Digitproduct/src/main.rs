fn main() {
    let mut input = String::new();
    let _ = std::io::stdin().read_line(&mut input).unwrap();
    let mut digits: Vec<i32>;
    let mut product: i32 = 0;

    println!("{:?}", input.chars());

    while input.len() != 1 {
        digits = input
            .chars()
            .filter(|f| f.is_digit(10) && *f != '0')
            .map(|d| d.to_string().parse::<i32>().unwrap())
            .collect::<Vec<i32>>();
        product = digits.iter().product();
        input = product.to_string();
    }
    println!("{}", product);
}
