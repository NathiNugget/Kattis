use std::io;
use std::time::Instant;

fn main() {

    let mut input = String::new();
    io::stdin().read_line(&mut input).unwrap();
    let mut before = Instant::now();
    let mut giga_str = "1 2 3 + *".repeat(40_000);
    //let mut tokens = input.trim().split_whitespace().map(|token| String::from(token)).collect::<Vec<String>>();
    let mut tokens :Vec<&str> = giga_str.trim().split_whitespace().collect();
    let mut val_stack:Vec<String> = Vec::with_capacity(200_000);
    let mut itr = tokens.into_iter();
    while let Some(token) = itr.next() {


        if token == "+" || token == "-" || token == "*" || token == "/" {
            let right = val_stack.pop().unwrap();
            let mut left = val_stack.pop().unwrap();
            handle_expressions(&mut left, &right, token.parse().unwrap());
            val_stack.push(left);
        } else {
            val_stack.push(token.to_owned());
        }

    }
    println!("{}", val_stack.join(""));
    let after = Instant::now();
    println!("{}", (after-before).as_millis());
}

fn handle_expressions(left: &mut String, right: &String, operator: char) -> () {
    left.reserve(right.len()+(size_of::<char>()*2));
    left.insert(0, '(');
    left.push(operator);
    left.push_str(&right);
    left.push(')');
}
