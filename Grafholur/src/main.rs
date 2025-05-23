use std::io::Read;

fn main() {
    let mut input = String::new();
    std::io::stdin().read_to_string(&mut input).unwrap();
    let numbers: Vec<f64> = input.lines().map(|line| line.parse().unwrap()).collect();
    let ans :f64 = (((numbers[0]/numbers[2])*numbers[1])*numbers[4])/numbers[3];
    println!("{}", ans);


}
