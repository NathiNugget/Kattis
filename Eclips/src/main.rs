use std::io;
use std::io::stdin;

fn main() {
    let mut buf = String::new();
    stdin().read_line(&mut buf).unwrap();
    let mut words = buf.trim().split_whitespace().collect::<Vec<_>>();
    let words = words.iter().fold(Vec::<String>::new(), |mut acc, word| {
        if word.contains("e") {
            acc.push(word.to_string());
            acc
        } else {acc}
    });

    println!("{}", match words.clone().iter().count() == 0 {
        true => {
            String::from("oh noes")
        }
        false => {
            words.join(" ").to_string()
        }
    })
}

