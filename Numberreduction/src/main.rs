fn main() {
    let mut buf = String::new();
    std::io::stdin().read_line(&mut buf).unwrap();
    let mut num = buf.trim().parse::<i32>().unwrap();
    let mut steps = 0;
    while num > 1 {
        steps += 1;
        if num % 2 == 0 {
            num /= 2;
        } else {
            num += (num * 2 + 1)
        }
    }
    println!("{}", steps);
}
