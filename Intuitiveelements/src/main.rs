use std::io::Read;


fn main() {
    let mut buf = String::new();
    std::io::stdin().read_to_string(&mut buf).unwrap();
    let mut lines = buf.lines();
    let num = lines.next().unwrap().parse::<i32>().unwrap();
    for _ in 0..num {
        let full = lines.next().unwrap();
        let shorthand = lines.next().unwrap();
        let chs = shorthand.chars().collect::<Vec<_>>();
        if chs.iter().all(|c| full.contains(*c)) {
            println!("{}", "YES");
        } else {
            println!("{}", "NO");
        }
    }
}
