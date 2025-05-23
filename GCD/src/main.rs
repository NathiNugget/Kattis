use std::cmp::max;


fn main() {
    let mut input = String::new();
    let _ = std::io::stdin().read_line(&mut input);
    let mut line = input.trim().split_whitespace();
    let a = line.nth(0).unwrap().parse::<u64>().unwrap();
    let b = line.nth(0).unwrap().parse::<u64>().unwrap();


    fn gcd(mut n: u64, mut m: u64) -> u64 {
        assert!(n != 0 && m != 0);
        while m != 0 {
            if m < n {
                std::mem::swap(&mut m, &mut n);
            }
            m %= n;
        }
        n
    }

    let output = gcd(a, b);
    println!("{}", output);
}
