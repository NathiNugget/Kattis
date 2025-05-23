

fn main() {
    let mut input = String::new();
    let _ = std::io::stdin().read_line(&mut input).unwrap();
    let num = input.trim().parse::<i32>().unwrap();


    let mut base = 1;
    let mut res;
    let mut how_many = 0;
    loop {
        res = (&base) * (&base + 1) * (&base + 2);
        match res {
            res if res >= num => {
                break;
            }
            _ => {
                how_many += 1;

                base += 1;
            }
        }
    }
    println!("{}", how_many);
}
