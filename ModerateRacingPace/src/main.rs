use std::io::Read;

fn main() {
    let mut input = String::new();
    let _ = std::io::stdin().read_to_string(&mut input).unwrap();
    let mut iterator = input.lines();
    let days = iterator.next().unwrap().parse::<i32>().unwrap();
    let a_hours = iterator.next().unwrap().split(" ").map(|x| x.parse::<i32>().unwrap()).collect::<Vec<i32>>();
    let b_hours = iterator.next().unwrap().split(" ").map(|x| x.parse::<i32>().unwrap()).collect::<Vec<i32>>();
    let c_hours = iterator.next().unwrap().split(" ").map(|x| x.parse::<i32>().unwrap()).collect::<Vec<i32>>();

    let mut output = String::new();
    let mut today:Vec<i32> = vec![];

    for i in 0..days {
        today = vec![];
        today.push(a_hours[i as usize]);
        today.push(b_hours[i as usize]);
        today.push(c_hours[i as usize]);
        today.sort();
        output.push_str(&(today[1].to_string()+ " "));

    }
    let _ = output.trim();
    println!("{}", output);
}
