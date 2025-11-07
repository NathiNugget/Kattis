fn main() {
    let mut buf = String::new();
    std::io::stdin().read_line(&mut buf).unwrap();
    buf = buf.trim().parse().unwrap();
    let sub_str = &buf[buf.len() - 3..];
    println!("{}", if sub_str == "eh?" {"Canadian!"} else {"Imposter!"});


}
