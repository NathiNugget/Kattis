use std::io;
use std::io::Read;

struct Interval {
    begin: i32,
    end: i32,
}

fn main() {
    let mut input = String::new();
    io::stdin().read_to_string(&mut input).unwrap();
    let mut lines = input.lines();
    let mut line = lines.next().unwrap().split_whitespace();
    let _ = line.next().unwrap();
    let concurrent = line.next().unwrap().parse::<i32>().unwrap();

    let mut intervals :Vec<Interval> = Vec::new();

    for line in lines {

        let vals = line.split_whitespace().map(|x| x.parse::<i32>().unwrap()).collect::<Vec<i32>>();
        intervals.push(Interval {begin: vals[0], end: vals[1], });
    }

    let mut hours_where_enough_stream = 0;

    for i in 0..=24 {
        let mut counter = 0;
        intervals.iter().for_each(|itv| {
            if interval_contains_hour(itv, i) {counter += 1};
        });
        if counter >= concurrent {hours_where_enough_stream += 1};
    }
    println!("{}", hours_where_enough_stream);

}

fn interval_contains_hour(itv: &Interval, hour: i32) -> bool {
    hour > itv.begin && hour <= itv.end
}
