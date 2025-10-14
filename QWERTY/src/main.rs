use std::collections::HashMap;
use std::thread;
use std::time::Duration;

fn main() {
    let mut buf = String::new();
    std::io::stdin().read_line(&mut buf).unwrap();
    buf.clear();
    std::io::stdin().read_line(&mut buf).unwrap();
    buf = buf.trim().parse().unwrap();

    let mut letters_map:HashMap<char, char> = HashMap::new();
    letters_map.insert('a', 'q');
    letters_map.insert('b', 'w');
    letters_map.insert('c', 'e');
    letters_map.insert('d', 'r');
    letters_map.insert('e', 't');
    letters_map.insert('f', 'y');
    letters_map.insert('g', 'u');
    letters_map.insert('h', 'i');
    letters_map.insert('i', 'o');
    letters_map.insert('j', 'p');
    letters_map.insert('k', 'a');
    letters_map.insert('l', 's');
    letters_map.insert('m', 'd');
    letters_map.insert('n', 'f');
    letters_map.insert('o', 'g');
    letters_map.insert('p', 'h');
    letters_map.insert('q', 'j');
    letters_map.insert('r', 'k');
    letters_map.insert('s', 'l');
    letters_map.insert('t', 'z');
    letters_map.insert('u', 'x');
    letters_map.insert('v', 'c');
    letters_map.insert('w', 'v');
    letters_map.insert('x', 'b');
    letters_map.insert('y', 'n');
    letters_map.insert('z', 'm');
    letters_map.insert(' ', ' ');

    let mut acutal_line = String::new();
    buf.chars().for_each(|c| {
        acutal_line.push(letters_map.get(&c).unwrap().clone());

    });
    println!("{}", acutal_line);










}
