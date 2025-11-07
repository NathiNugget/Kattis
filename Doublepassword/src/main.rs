use std::io;

fn main() {
    let mut buf = String::new();
    io::stdin().read_line(&mut buf).unwrap();
    let code1 = buf.trim().to_string();
    buf.clear();
    io::stdin().read_line(&mut buf).unwrap();
    let code2 = buf.trim().to_string();

    let mut combinations = 1;
    let chars_1 = code1.chars().collect::<Vec<char>>();
    let chars_2 = code2.chars().collect::<Vec<char>>();

    for i in 0..4 {
        match chars_1[i] == chars_2[i] {
            true => {
                continue;
            }
            false => {
                combinations *= 2;
            }
        }
    }

    println!("{}", combinations);
}
