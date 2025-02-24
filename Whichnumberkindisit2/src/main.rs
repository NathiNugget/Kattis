

fn main() {
    let mut buf = String::new();
    let _ = std::io::stdin().read_line(&mut buf);
    let cases :u32 = buf.trim().parse().unwrap();
    let mut num :u32;
    for _case in 0..cases {
        buf.clear();
        let _ = std::io::stdin().read_line(&mut buf);
        num = buf.trim().parse().unwrap();
        let output :&str = match (is_odd(num), is_square(num)) {
            (true, true) => {
                "OS"
            }
            (false, true) => {
                "S"
            }
            (true, false) => {
                "O"
            }
            _ => {
                "EMPTY"
            }
        };
        println!("{}", output);

    }
}

fn is_odd(n: u32) -> bool {
    n % 2 == 1
}

fn is_square(n: u32) -> bool {
    f64::sqrt(n as f64) % 1.0 == 0f64
}
