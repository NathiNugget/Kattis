use std::collections::HashSet;
use std::io::Read;

fn main() {
    let mut buf = String::new();
    std::io::stdin().read_to_string(&mut buf).unwrap();
    let ls = buf.lines().skip(1);
    ls.for_each(|l| {
       let mut set = HashSet::<char>::new();
        for c in 'a'..='z' {
            set.insert(c);
        }
        l.chars().for_each(|c| {
            set.remove(&c.to_lowercase().next().unwrap());
        });
        if set.is_empty() {println!("pangram");} else {
            let mut cs: Vec<char> = set.into_iter().collect();
            cs.sort();
            println!("missing {}", cs.iter().collect::<String>());
        }
    });

}
