use std::io;

fn main() {
    let mut T = 0;
    let mut H = 0;

    let mut buf = String::new();
    io::stdin().read_line(&mut buf);
    buf = buf.trim().to_string();
    let chars = buf.chars().collect::<Vec<char>>();
    for i in 0..buf.len() {
        if T >= 11 || H >= 11{
            if T - H >= 2 || H - T >= 2 {
                H = 0;
                T = 0;
            }
        }


        if chars[i] == 'T' {
            T += 1;
        } else if chars[i] == 'H' {
            H += 1;
        }


    }

    if T >= 11 || H >= 11{
        if T - H >= 2 || H - T >= 2 {
            H = 0;
            T = 0;
        }
    }

    println!("{}-{}", T, H);

}
