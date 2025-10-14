use std::io::Read;

fn main() {
    let mut buf = String::new();
    std::io::stdin().read_to_string(&mut buf).unwrap();
    for line in buf.lines() {
        match line {
            "0 0" => {}
            &_ => {
                println!("{}", handle_line(line));
            }
        }
    }
}

fn handle_line(line: &str) -> String {
    let nums : Vec<i32> = line.split_whitespace().map(|num| num.parse().unwrap()).collect();
    let first = nums[0]/nums[1];
    let second = nums[0]%nums[1];
    format!("{} {} / {}", first, second, nums[1]).to_string()

}
