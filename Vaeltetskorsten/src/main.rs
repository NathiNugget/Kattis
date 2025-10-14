use std::io;

fn main() {
    let mut buf = String::new();
    io::stdin().read_line(&mut buf).unwrap();
    let num = buf.trim().parse::<i32>().unwrap();

    let mut max :i32 = 0;
    let mut current :i32 = 0;
    let mut toomuch : String;
    let mut line;
    for _ in 0..num {
        buf.clear();
        io::stdin().read_line(&mut buf).unwrap();
        line = buf.trim().split_whitespace();
        current  = line.next().unwrap().parse::<i32>().unwrap();
        toomuch = line.next().unwrap().to_string();
        if current > max && toomuch != String::from("ja") {
            max = current;
        }
    }

    println!("{}", max);

}
