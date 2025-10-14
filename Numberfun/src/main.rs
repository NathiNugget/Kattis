use std::io::Read;

fn is_possible(a: i32, b: i32, target: i32) -> bool {
    let a = a as f32;
    let b = b as f32;
    let target = target as f32;
    a / b == target || b/a == target || b % b == target || a + b == target || b - a == target || a - b == target || a * b == target
}

fn main() {
    let mut buf = String::new();
    std::io::stdin().read_line(&mut buf).unwrap();
    let mut line = buf.trim_end();

    let times_to_calculate = line.parse::<i32>().unwrap();
    buf.clear();
    std::io::stdin().read_to_string(&mut buf).unwrap();
    let mut lines = buf.lines();
    let mut nums : Vec<i32>;
    for _ in 0..times_to_calculate {
        line = lines.next().unwrap().trim();
        nums = line.split_whitespace().map(|x| x.parse::<i32>().unwrap()).collect();
        println!("{}", match is_possible(nums[0], nums[1], nums[2]) {
            true => "Possible",
            false => "Impossible",
        });
    }




}
