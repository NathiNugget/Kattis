use std::io;

fn main() {

    let mut input = String::new();
    io::stdin().read_line(&mut input).unwrap();
    let mut tokens = input.trim().split_whitespace().map(|token| String::from(token)).collect::<Vec<String>>();
    let mut val_stack:Vec<String> = vec![];
    let mut itr = tokens.into_iter();
    while let Some(token) = itr.next() {


        if token == "+" || token == "-" || token == "*" || token == "/" {
            let right = val_stack.pop().unwrap();
            let mut left = val_stack.pop().unwrap();
            val_stack.push(handle_expressions(&mut left, &right, token.parse().unwrap()));
        } else {
            val_stack.push(token);
        }

    }
    println!("{}", val_stack.join(""));
}

fn handle_expressions(left: &mut String, right: &String, operator: char) -> String {
    left.insert(0, '(');
    left.push(operator);
    left.push_str(&right);
    left.push(')');

    left.clone()
}
