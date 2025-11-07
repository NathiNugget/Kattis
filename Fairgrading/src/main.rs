use std::io;

fn main() {
    let mut buf = String::new();
    io::stdin().read_line(&mut buf).unwrap();
    let nums = buf.split_whitespace().map(|x|x.parse::<f32>().unwrap()).collect::<Vec<f32>>();
    let num = 0.25*nums[0]+0.25*nums[1]+0.5*nums[2];
    match num {
        num if 90.0 <= num => {
            println!("A");
        }
        num if 80.0 <= num && num < 90.0 => {
            println!("B");
        }
        num if 70.0 <= num && num < 80.0 => {
            println!("C");
        }
        num if 60.0 <= num && num < 70.0 => {
            println!("D");
        }


        _ => {println!("F");}
    }
}
