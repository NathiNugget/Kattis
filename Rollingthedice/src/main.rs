fn main() {
    let mut buf = String::new();
    std::io::stdin().read_line(&mut buf).unwrap();
    let chars = buf.trim_end().split('+').collect::<Vec<_>>();
    let second_part = chars[0].split('d').collect::<Vec<_>>();
    let dices = second_part[0].parse::<f64>().unwrap();
    let amount = second_part[1].parse::<f64>().unwrap();
    let plus = chars[1].parse::<f64>().unwrap();
    println!("{}", (1.0*dices+amount*dices)/2.0+plus);
}
