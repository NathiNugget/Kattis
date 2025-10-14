fn main() {
    let mut buf = String::new();
    std::io::stdin().read_line(&mut buf).unwrap();
    let num1 = buf.trim_end().parse::<i32>().unwrap();
    buf.clear();
    std::io::stdin().read_line(&mut buf).unwrap();
    buf.clear();
    std::io::stdin().read_line(&mut buf).unwrap();
    let num2 = buf.trim_end().parse::<i32>().unwrap();
    println!("{}", num1 * num2);

}
