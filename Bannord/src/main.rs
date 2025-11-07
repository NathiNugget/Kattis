use std::io::Read;

fn main() {

    let mut buf = String::new();
    std::io::stdin().read_to_string(&mut buf).unwrap();
    let mut lines = buf.lines();
    let line = lines.next().unwrap();
    let chars: Vec<char> = line.chars().collect();
    let mut words = lines.next().unwrap().split_whitespace().map(|w| w.to_string()).collect::<Vec<String>>();
    let mut output :Vec<String> = Vec::with_capacity(words.len());
    'swag: for (i, word) in words.iter().enumerate() {
        for ch in chars.iter() {
            if word.contains(*ch) {
                let len = word.len();

                output.push("*".repeat(len));
                continue 'swag;


            }

        }
        output.push(word.to_string());
    }

    println!("{}", output.join(" "));


}
