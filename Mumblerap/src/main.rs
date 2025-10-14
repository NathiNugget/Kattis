use std::num::ParseIntError;

fn main() {
    let mut buf = String::new();

    std::io::stdin().read_line(&mut buf).unwrap();
    buf.clear();
    std::io::stdin().read_line(&mut buf).unwrap();
    buf = buf.trim_end().to_string();
    let mut c : char;
    let chars = buf.chars().collect::<Vec<char>>();
    let mut currentMax = 0;
    let mut str_buffer: String = String::new();
    let mut current_val = 0;
    for i in 0..buf.chars().count(){
        c = chars[i];
        if c.is_digit(10){
            str_buffer.push(c);
        }
        else if str_buffer.chars().count() > 0 {
            match str_buffer.parse::<i32>() {
                Ok(n) => {
                    current_val = n;
                    if current_val > currentMax{
                        currentMax = current_val
                    }
                },
                Err(_) => {}
            }
            str_buffer.clear();


        }
    }
    match str_buffer.parse::<i32>() {
        Ok(n) => {
            current_val = n;
            if current_val > currentMax{
                currentMax = current_val
            }
        },
        Err(_) => {}
    }

    println!("{}", currentMax);


}
