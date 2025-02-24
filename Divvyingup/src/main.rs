use std::io::stdin;


fn main() {
    let mut buf:String = String::new();
    let _ = stdin().read_line(&mut buf);
    let pers :u64 = 3;
    buf.clear();
    let _ = stdin().read_line(&mut buf);
    let sum :u64= buf.trim().split(' ').map(|x| x.parse::<u64>().unwrap()).sum();
    if sum % pers == 0 {println!("yes")} else {println!("no")}

}
