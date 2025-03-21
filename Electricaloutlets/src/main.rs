use std::io::Read;

fn main() {
    let mut input = String::new();
    let _ = std::io::stdin().read_to_string(&mut input).unwrap();
    let mut iterator = input.lines();
    iterator.next();
    let mut line = iterator.nth(0);
    let mut sum :i32;
    let mut elements :i32;
    while line.is_some(){
        let content = line.unwrap();
        elements = content.split_whitespace().count() as i32 - 2;
        sum = content.split_whitespace().skip(1).take(500).map(|x| x.parse::<i32>().unwrap()).sum::<i32>();
        println!("{}", sum - elements);
        line = iterator.nth(0);
    }




}
