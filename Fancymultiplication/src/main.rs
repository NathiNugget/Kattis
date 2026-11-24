use std::io;

fn main() {
    let mut buf = String::new();
    io::stdin().read_line(&mut buf).unwrap();
    let num1 = buf.trim().parse::<i64>().unwrap();
    buf.clear();
    io::stdin().read_line(&mut buf).unwrap();
    let num2 = buf.trim().parse::<i64>().unwrap();
    let mut sum = 0;
    for _ in 0i64..(num1.max(num2)) {
        sum += num1.min(num2);

    }
    println!("{}", sum);

}
