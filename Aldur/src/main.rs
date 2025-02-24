use std::io;

fn main() {
    let mut buff: String = String::new();
    read_line(&mut buff);
    let friends :u32 = buff.trim().parse().unwrap();
    let mut ages:Vec<u32> = Vec::with_capacity(friends as usize);
    for _i in 0..friends {
        read_line(&mut buff);
        ages.push(buff.trim().parse().unwrap());
    }
    let min = ages.iter().min().unwrap();
    println!("{}", min);
}

fn read_line(buff: &mut String) -> () {
    buff.clear();
    let _ = io::stdin().read_line(buff);
}
