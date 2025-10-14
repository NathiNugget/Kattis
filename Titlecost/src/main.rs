fn main() {
    let mut input = String::new();
    std::io::stdin().read_line(&mut input).unwrap();
    let mut words = input.split_whitespace();
    let title = words.next().unwrap();
    let cap :f64 = words.next().unwrap().parse().unwrap();
    if title.len() as f64 > cap {
        println!("{}", cap);
    } else {println!("{}", title.len());}

}
