use std::io::Read;

fn main() {
    let mut buf = String::new();
    std::io::stdin().read_to_string(&mut buf).unwrap();
    let mut lines = buf.lines();
    let mut line = lines.next().unwrap().split_whitespace();
    line.next().unwrap();
    let acceleration = line.next().unwrap().parse::<i32>().unwrap();
    let nums = lines.next().unwrap().split_whitespace().map(|x| x.parse::<i32>().unwrap())
        .collect::<Vec<i32>>()
        .windows(2)
        .any(|x| x[1] - x[0] > acceleration);
    println!("{}", match nums {
        true => {"BUG REPORT"}
        _ => {"POSSIBLE"} });

}
