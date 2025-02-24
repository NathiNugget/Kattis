use io::stdin;
use std::io;

fn main() {
    let mut buf = String::new();
    let _ = stdin().read_line(&mut buf).unwrap();
    let tuple :Vec<u32> = buf.trim().split(" ").map(|x| x.parse().unwrap()).collect();

    let _num_of_cards = *tuple.get(0).unwrap();
    let secret_prediction = *tuple.get(1).unwrap();
    let number_of_steps = *tuple.get(2).unwrap();
    let mut card_found :bool;
    for _i in 0..number_of_steps {
        buf.clear();
        let _ = stdin().read_line(&mut buf).unwrap();
        let mut cards  :Vec<u32> = buf.trim().split(" ").map(|x| x.parse().unwrap()).collect();
        cards = cards.drain(1..cards.len()).collect();

        card_found = cards.iter().any(|x| *x == secret_prediction);
        println!("{}", if card_found {"KEEP"} else {"REMOVE"});
    }

}
