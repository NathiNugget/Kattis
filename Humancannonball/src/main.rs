use std::f32::consts::PI;
use std::io;
use std::io::Read;

fn main() {
    let mut buf = String::new();
    io::stdin().read_to_string(&mut buf).unwrap();
    let ls = buf.lines().skip(1);
    let mut v :f64;
    let mut angle :f64;
    let mut x :f64;
    let mut hl :f64;
    let mut hi :f64;
    for line in ls {
        let nums = line.split_whitespace().map(|x| x.parse::<f64>().unwrap()).collect::<Vec<f64>>();
        v = nums[0];
        angle = nums[1];
        x = nums[2];
        hl = nums[3];
        hi = nums[4];

        let t = x/(v*(angle*(PI as f64/180.0)).cos());
        let y = (v*t*(angle*PI as f64/180.0).sin())-0.5*9.81*t.powf(2.0);
        println!("{}", if y >= hl+1.0 && y <= hi-1.0 {"Safe"} else {"Not safe"})



    }
}

