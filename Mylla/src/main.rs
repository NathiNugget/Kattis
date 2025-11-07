use std::io;

fn main() {
    let mut buf = String::new();
    io::stdin().read_line(&mut buf).unwrap();
    let num = buf.trim_end().parse::<i32>().unwrap();
    buf.clear();
    io::stdin().read_line(&mut buf).unwrap();
    let line = buf.trim_end().to_owned();
    let mut arn = 0;
    let mut han = 0;
    let mut rounds_arn = 0;
    let mut rounds_han = 0;
    for char in line.chars() {
        match char {
            'A' => {
                arn += 1;
            }
            _ => {
                han += 1;
            }

        }
        if arn == 3 {rounds_arn += 1; arn = 0; han = 0; continue;}
        else if han == 3 {rounds_han +=1; han = 0; arn = 0; continue;}
    }

    println!("{}", match rounds_han > rounds_arn{
        true => {"Arnar"}
        false => {"Hannes"}
    }
    );
}


