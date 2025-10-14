use std::io;

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

fn main() {
    let mut buf = String::new();
    io::stdin().read_line(&mut buf).unwrap();
    let circles = buf.trim().parse::<u64>().unwrap();
    buf.clear();
    io::stdin().read_line(&mut buf).unwrap();
    let sizes = buf.trim().split(' ').collect::<Vec<&str>>();
    let r = sizes[0].parse::<u64>().unwrap();
    let mut size : u64;
    let mut divisor : u64;
    let mut div_r : u64 = 0;
    let mut div_size : u64 = 0;

    for i in 1..sizes.len() {
        size = sizes[i].parse::<u64>().unwrap();
        divisor = gcd(size, r);
        div_r = r/divisor;
        div_size = size/divisor;
        println!("{}/{}", div_r, div_size);
    }


}
