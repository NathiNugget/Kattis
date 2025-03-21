fn main() {
    let mut input = String::new();
    let _ = std::io::stdin().read_line(&mut input).unwrap();
    let mut iterator = input.split_whitespace();
    let width :i32 = iterator.nth(0).unwrap().parse().unwrap();
    let height :i32 = iterator.nth(0).unwrap().parse().unwrap();
    let sticker_width :i32 = iterator.nth(0).unwrap().parse().unwrap();
    let sticker_height :i32 = iterator.nth(0).unwrap().parse().unwrap();

    if width - sticker_width >= 2 && height - sticker_height >= 2 {
        println!("1");
    } else {println!("0")}





}
