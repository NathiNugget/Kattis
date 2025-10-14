use std::collections::BTreeSet;
use std::io;

fn main() {
    let mut set : BTreeSet<char> = BTreeSet::new();
    for i in 0..26 {
        set.insert((('a')as u8 + i) as char);
    }

    let mut buf = String::new();
    let _ = io::stdin().read_line(&mut buf).unwrap();
    buf = buf.trim().parse().unwrap();
    buf.chars().for_each(|x| {
        set.remove(&x);
    });
    let somestr :String = set.iter().collect();
    println!("{}", match somestr.as_str().len() {
        0 => {"Good job!"}
        _ => & somestr
    });
}
