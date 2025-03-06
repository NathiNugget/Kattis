
fn main() {
    let mut input = String::new();
    let _ = std::io::stdin().read_line(&mut input).unwrap();
    input.clear();
    let _ = std::io::stdin().read_line(&mut input).unwrap();
    let junk_per_day: Vec<i32> = input
        .trim()
        .split(" ")
        .map(|d| d.parse::<i32>().unwrap())
        .collect();

    let mut lowest = i32::MAX;
    for i in 0..junk_per_day.len() {

        if lowest > junk_per_day[i] {
            lowest = junk_per_day[i];
        }
    }
    let idx = junk_per_day.iter().position(|x| *x == lowest).unwrap();
    println!("{}", idx);
}
