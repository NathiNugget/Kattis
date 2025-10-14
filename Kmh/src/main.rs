use std::io;
use std::io::Read;

fn main() {
    let mut buf = String::new();
    io::stdin().read_to_string(&mut buf).unwrap();
    let mut ls = buf.lines().skip(1);
    let mut max = 0;


    let mut local_max = 0;
    for line in ls {
        let _ = match line {
            "/" => {
                    if local_max == max {max = calc_max(max);}


                println!("{}", max)

            },
            _ => {
                let num = line.parse::<i32>().unwrap();
                if num > max {
                    max = num;
                } if local_max < num {local_max = num}
                println!("{}", num);
            }
        };
    }
}

fn calc_max(p0: i32) -> i32 {
    let num = ((p0 / 10) + 1) * 10;
    // println!("{}, new max = {}", p0, num);
    num
}
