use std::io;

fn main() {
    let mut buf = String::new();
    io::stdin().read_line(&mut buf).unwrap();
    let num = buf.trim_end().parse::<i32>().unwrap();
    if 0 <= num {
        if num == 1 {println!("2 -1")} else {println!("{} {}", num-1, 1)}
    };
    if 0 > num {
        if num == -1 {println!("-2 1")} else {println!("{} {}", num+1, -1)};
    }
}