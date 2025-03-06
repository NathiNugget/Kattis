fn main() {
    let mut input = String::new();
    let mut angles:Vec<i32> = vec![];
    for _i in 0..3 {
        let _ = std::io::stdin().read_line(&mut input).unwrap();
        angles.push(input.trim().parse::<i32>().unwrap());
        input.clear();
    }

    let right_count = angles.iter().filter(|x| **x == 90).count();
    let obtuse_count = angles.iter().filter(|x| **x > 90).count();
    let acute_counte = angles.iter().filter(|x| **x < 90).count();
    match right_count{ 1 => {
        println!("Ratvinklig Triangel");
    },
        _ => {}
    }

    match obtuse_count {
        1..= 3 => println!("Trubbig Triangel"),
        _ => {}
    }

    match acute_counte {
        3 => println!("Spetsig Triangel"),
        _ => {}
    }
}
