use std::io::Read;

fn main() {
    let mut input = String::new();
    let _ = std::io::stdin().read_line(&mut input).unwrap();
    let measurements = input.trim().parse::<i32>().unwrap();
    let mut max = 0;
    input.clear();
    let _ = std::io::stdin().read_to_string(&mut input);
    let mut iterator = input.lines();
    let mut content = iterator.nth(0);
    let mut prev_distance = 0;
    let mut prev_time = 0;
    for i in 0..measurements {
        let time = content.unwrap().trim().split(' ').nth(0).unwrap().parse::<i32>().unwrap();
        let distance = content.unwrap().trim().split(' ').nth(1).unwrap().parse::<i32>().unwrap();
        if (i != 0){
            let current_speed = (distance -prev_distance)/(time-prev_time);
            if current_speed > max {
                max = current_speed;
            }
        }
        prev_distance = distance;
        prev_time = time;
        content = iterator.nth(0);
    }
    println!("{}", max);


}
