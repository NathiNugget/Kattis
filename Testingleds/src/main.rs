use std::io;
use std::io::Read;

fn main() {
    let mut buf = String::new();
    io::stdin().read_to_string(&mut buf).unwrap();
    let mut lines = buf.lines();
    let num = lines.next().unwrap().parse::<i32>().unwrap();
    let mut times: Vec<(i32, i32)> = Vec::with_capacity(num as usize);
    for line in lines {
        let nums = line.split_whitespace().map(|x| x.parse::<i32>().unwrap()).collect::<Vec<i32>>();
        times.push((nums[0], nums[1]));
    }
    times.sort_by(|a, b| a.0.cmp(&b.0));
    println!("{}", match   times.iter().find(|&&x|x.1 == 0).unwrap_or(&(-1,-1)) {
        &x => {
            x.0
        }
    });

}
