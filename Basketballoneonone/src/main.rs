

fn main() {
    let mut input = String::new();
    let _ = std::io::stdin().read_line(&mut input).unwrap();
    let line = input.trim();
    let mut a = 0;
    let mut b = 0;
    let line :Vec<&str> = line.as_bytes()
        .chunks(2)
        .map(|chunk| std::str::from_utf8(chunk).unwrap())
        .collect();
    for i in line {
        if i.contains("A"){
            a += i[1..=1].parse::<i32>().unwrap()
        }
        if i.contains("B"){
            b += i[1..=1].parse::<i32>().unwrap()
        }
    }
    match a > b {
        true => println!("A"),
        false => println!("B"),
    }
}
