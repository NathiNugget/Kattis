use std::io::Read;

fn main() {
    let mut input = String::new();
    let  _ = std::io::stdin().read_to_string(&mut input);
    let mut iterator = input.lines();
    iterator.nth(0);
    let mut previous = 'E';
    let mut correct = 0;
    for line in iterator {
        if line.contains(previous) {correct += 1;

        } else {previous = line.chars().nth(0).unwrap_or('\0');}
    }
    println!("{}", correct);

}
