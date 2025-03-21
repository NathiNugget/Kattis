use std::collections::HashSet;
use std::io::Read;

fn main() {
    let mut input = String::new();
    let _ = std::io::stdin().read_to_string(&mut input).unwrap();
    let iterator = input.lines().skip(1);
    let mut days:HashSet<u16> = HashSet::with_capacity(365);
    let mut spliterator;
    for line in iterator {
        spliterator = line.split_whitespace();
        let lower_bound :u16 = spliterator.next().unwrap().parse().unwrap();
        let upper_bound :u16 = spliterator.next().unwrap().parse().unwrap();
        for num in lower_bound..=upper_bound { days.insert(num); }
    }
    println!("{}", days.len());
}
