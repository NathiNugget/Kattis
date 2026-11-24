use std::io;

fn main() {
    let mut buf = String::new();
    io::stdin().read_line(&mut buf).unwrap();

    let name = buf.trim().to_string();
    let mut ch:char;
    let mut chars: Vec<char> = name.chars().collect();
    let len = chars.len();
    match len%2 == 0 {
        true => {
            for i in 0..len/2 {
                ch = chars[i];
                if ch != chars[len - i-1] {
                    println!("Nothing special about this string :(");
                    return;
                }
                if i == len / 2-1 {
                    println!("Palindrome!");
                    return;
                }
            }
        }
        false => {
            for i in 0..len/2+1 {
                if (i == len/2) {
                    println!("Palindrome!");
                    return;
                }
                ch = chars[i];

                if ch != chars[len - i-1] {
                    println!("Nothing special about this string :(");
                    return;
                }
            }
        }
    }

}
