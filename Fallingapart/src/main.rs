fn main() {
    let mut input = String::new();
    std::io::stdin().read_line(&mut input).unwrap();
    input.clear();
    std::io::stdin().read_line(&mut input).unwrap();
    let mut numbers :Vec<u32> = input.trim().split_whitespace().map(|x| x.parse().unwrap()).collect();
    numbers.sort();
    let mut a = 0;
    let mut b = 0;
    let mut i = 0;
    while let Some(n) = numbers.pop() {
        match i % 2 == 0 {
            true => {
                a += n;
            }
            false => {
                b += n;
            }

        }
        i += 1;
    }
    println!("{} {}", a, b);
}
