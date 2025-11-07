use std::io;

fn main() {
    let mut buf = String::new();
    let _ = io::stdin().read_line(&mut buf).unwrap();
    let mut output : Vec<char> = Vec::new();
    buf = buf.trim().into();
    buf.chars().for_each(|c| match c {
        '<' => {output.pop();}

        _ => {output.push(c)}
    });
    println!("{}", output.iter().collect::<String>());
}
