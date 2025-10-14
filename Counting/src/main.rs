use std::io;

fn main() {
    let mut buf = String::new();
    io::stdin().read_line(&mut buf).unwrap();
    let mut num = buf.trim_end().parse::<i32>().unwrap();
    for i in (num ..= num*12).step_by(num as usize) {
        println!("{}", i);
    }
}
