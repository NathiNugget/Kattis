use std::io::Read;

fn main() {
    let mut buf = String::new();
    std::io::stdin().read_to_string(&mut buf).unwrap();
    let mut lines = buf.lines();
    let f_name = lines.next().unwrap();
    let v_name = lines.next().unwrap();
    let mut output = v_name.chars().collect::<Vec<char>>();
    let mut check = false;

    'death: for ch in f_name.chars() {
        let idx = match output.iter().position(|&r| r == ch) {
            None => {-1isize}
            Some(x) => {x as isize}
        };
        if idx == -1isize {

            check = true;
            break 'death;
        }
        let _ = output.drain(0..(idx + 1)as usize);


    }
    println!("{}", match !check{
        true => {"Ja"}
        false => {"Nej"}
    })




}
