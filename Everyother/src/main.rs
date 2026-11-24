use std::io;

fn main() {
    let mut buf = String::new();
    io::stdin().read_line(&mut buf).unwrap();
    let mut word = buf.trim().to_string();
    word = word
        .chars()
        .enumerate()
        .filter_map(|w| match w.0 % 2 == 0 {
            true => Some(w.1),
            false => None,
        })
        .collect();
    println!("{}", word);
}
