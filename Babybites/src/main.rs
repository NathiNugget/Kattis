use std::io;
use std::io::{stdin, Read};

fn main() {
    let mut buf = String::new();
    stdin().read_to_string(&mut buf).unwrap();
    let mut ls = buf.lines();
    let num = ls.next().unwrap().parse::<i32>().unwrap();
    let input = ls.next().unwrap().split_whitespace().collect::<Vec<&str>>();

    let mut counter = 0;

    for word in input.clone() {
        if word == "mumble" || word.parse::<i32>().unwrap() == counter+1 {
            counter += 1;
        }
    }
    println!("{}", match counter == input.iter().count() as i32 {
        true => {"makes sense"}
        false => {"something is fishy"}
    })


}
