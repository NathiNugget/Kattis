use std::io::Read;

fn main() {
    let mut buf = String::new();
    std::io::stdin().read_to_string(&mut buf).unwrap();
    let mut lines = buf.lines().skip(1);
    println!("{}", match lines.find(|x| x.parse::<i32>().unwrap() < 48) {
        None => {
            "True"
        }
        Some(_) => {"False"}
    });
}
