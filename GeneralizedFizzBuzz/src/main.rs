use std::io;

fn main() {
    let mut input = String::new();
    let _ = io::stdin().read_line(&mut input);
    let input :Vec<i32> = input.trim().split(' ').map(|x| x.parse().unwrap()).collect();


    let mut fizz = 0;
    let mut buzz = 0;
    let mut fizz_buzz = 0;

    for i in 1..= *input.get(0).unwrap() {
        match (i % input.get(1).unwrap() == 0, i % input.get(2).unwrap() == 0){
            (true, true) => {
                fizz_buzz += 1;
            }
            (true, false) => {
                fizz += 1;
            }
            (false, true) => {
                buzz += 1;
            }

            _ => {continue;}
        }
    }

    println!("{} {} {}", fizz, buzz, fizz_buzz);


}
