use std::io;
use std::io::Read;

fn sum_up_digits(number_as_string: &str) -> i32 {
    number_as_string
        .to_string()
        .chars()
        .fold(0, |acc, x| acc + x.to_digit(10).unwrap() as i32)
}

fn main() {
    let mut input = String::new();
    io::stdin().read_to_string(&mut input).unwrap();
    let mut lines = input.lines();

    while let line = lines.next().unwrap() {
        if line == "0" {
            break;
        }
        let N: i32 = line.parse().unwrap();
        let N_digits_sum: i32 = sum_up_digits(&N.to_string());

        let mut test_num: i32 = 11;
        let mut sum = test_num * N;
        let mut sum_digits = sum_up_digits(&sum.to_string());
        while sum_digits != N_digits_sum {
            test_num += 1;
            sum = test_num * N;
            sum_digits = sum_up_digits(&sum.to_string());
        }
        println!("{}", test_num);
    }

}
