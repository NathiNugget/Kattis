use std::cmp::Ordering;
use std::io;

fn main() {
    let mut buf = String::new();
    io::stdin().read_line(&mut buf).unwrap();
    buf.clear();
    io::stdin().read_line(&mut buf).unwrap();
    let num1 :i32 = buf.trim().split_whitespace().map(|x| x.to_string().parse::<i32>().unwrap()).sum();
    buf.clear();
    io::stdin().read_line(&mut buf).unwrap();
    let num2 :i32 = buf.trim().split_whitespace().map(|x| x.to_string().parse::<i32>().unwrap()).sum();





    println!("{}", match &num1.cmp(&num2) {
        Ordering::Less => {
            "left"
        }
        Ordering::Equal => {"either"}
        Ordering::Greater => {"right"}
    });

}
