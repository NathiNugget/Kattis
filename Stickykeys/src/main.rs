use std::collections::HashSet;
use std::io;

fn main() {
    let mut input = String::new();
    io::stdin().read_line(&mut input).unwrap();
    let mut words :Vec<String> = input.split_whitespace().map(|x| x.to_string()).collect();
    let mut final_words :Vec<String> = Vec::new();
    let mut prev_char :char = '-';
    words.iter().for_each(|s| {
        prev_char = '-';
        let chars :Vec<char> = s.chars().collect();
        let mut new_string = String::new();
        for ch in chars {


            if prev_char.ne(&ch) {
                prev_char = ch;
                new_string.push(ch);

            }
        }
        final_words.push(new_string);
    });


    println!("{}", final_words.join(" "));
}
