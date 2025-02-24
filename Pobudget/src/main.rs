use std::io;

fn main() {
    let mut buff :String = String::new();
    let _ = io::stdin().read_line(&mut buff);
    let transactions :i32 = buff.trim().parse().unwrap();
    buff.clear();
    let mut budget:i32 = 0;
    for _i in 0..transactions {
        let _ = io::stdin().read_line(&mut buff);
        buff.clear();
        let _input = io::stdin().read_line(&mut buff);
        let money :i32 = buff.trim().parse().unwrap();
        budget += money;
        buff.clear();
    }
    println!("{}", match budget {
        1.. => {"Usch, vinst"},
        i32::MIN..=-1 => {"Nekad"}
        _ => {"Lagom"}
    });


}
