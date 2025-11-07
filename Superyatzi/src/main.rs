use std::collections::HashMap;
use std::io::Read;

fn main() {
    let mut buf = String::new();
    std::io::stdin().read_to_string(&mut buf).unwrap();
    let mut lines = buf.lines();
    let mut line = lines.next().unwrap().split_whitespace();
    let dice: i32 = line.next().unwrap().parse::<i32>().unwrap();
    let cheat: i32 = line.next().unwrap().parse::<i32>().unwrap();



    println!("{}", match dice - lines.into_iter().fold(HashMap::<i32, i32>::new(), |mut acc, x| {
        let num = x.parse::<i32>().unwrap();
        acc.entry(num).and_modify(|x| *x += 1).or_insert(1);
        acc

    }).values().max().unwrap() > cheat {
        true => "Nej",
        false => "Ja"
    });

}
