use std::io::{stdin, BufRead};

fn main() {


    let mut input = String::new();
    stdin().read_line(&mut input).unwrap();
    input = input.trim().to_string();

    let zoom :i32 = input.len() as i32;
    let mut x : i32 = 0;
    let mut y : i32 = 0;

    for i in 0..zoom {
        let current :i32 = input[i as usize..(i+1) as usize].parse().unwrap();
        if current == 1 || current == 3 {
            x += 2_i32.pow((zoom - i - 1) as u32);
        }
        if current == 2 || current == 3 {
            y += 2_i32.pow((zoom - i - 1) as u32);
        }
    }

    let mut sub_strs: Vec<String> = vec![];
    sub_strs.push(zoom.to_string());
    sub_strs.push(x.to_string());
    sub_strs.push(y.to_string());

    println!("{}", sub_strs.join(" "));


}
