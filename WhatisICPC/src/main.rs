use std::io;

fn main() {
    let mut buf = String::new();
    io::stdin().read_line(&mut buf).unwrap();
    let mut words = buf.split_whitespace();
    let mut output = String::with_capacity(4);
    for word in words {
        let ch = word.chars().next().unwrap();
        output.push(ch.to_ascii_uppercase());

    }
    println!("{}", match output.as_str() == "ICPC" {
        true => {
            "1"
        }
        false => {"0"}
    });

}
