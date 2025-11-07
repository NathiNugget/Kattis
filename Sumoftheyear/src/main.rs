use std::io;

fn main() {
    let mut buf = String::new();
    io::stdin().read_line(&mut buf).unwrap();
    buf = buf.trim().to_string();
    let mut outer_value = 1;
    let mut input = buf.parse::<i32>().unwrap();
    let mut counter = 0;
    while outer_value <= input {
        if mutate_value(outer_value) {counter += 1;}
        outer_value += 1;
    }

    println!("{}", counter);

}

fn mutate_value(upper_limit:i32) -> bool {


    let mut left_sum = 0;
    for i in 1..=(upper_limit) {
        left_sum += i;
    }
    left_sum = left_sum.pow(2);

    let mut right_sum = 0;
    for i in 1..=(upper_limit) {
        right_sum += i.pow(3);
    }

    left_sum == right_sum
}
