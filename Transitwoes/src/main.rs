fn main() {
    let mut input = String::new();
    let _ = std::io::stdin().read_line(&mut input).unwrap();
    let mut time_taken = 0;
    let mut iterator = input.split_whitespace();
    let end_time = iterator.nth(1).unwrap().parse::<i32>().unwrap();
    let busses = iterator.nth(0).unwrap().parse::<i32>().unwrap();
    input.clear();
    let _ = std::io::stdin().read_line(&mut input);
    let walking_times = input.split_whitespace().map(|x| x.parse::<i32>().unwrap()).collect::<Vec<i32>>();
    input.clear();
    let _ = std::io::stdin().read_line(&mut input);
    let riding_times = input.split_whitespace().map(|x| x.parse::<i32>().unwrap()).collect::<Vec<i32>>();
    input.clear();
    let _ = std::io::stdin().read_line(&mut input);
    let intervals = input.split_whitespace().map(|x| x.parse::<i32>().unwrap()).collect::<Vec<i32>>();


    for i in 0..busses {
        time_taken += walking_times[i as usize];
        //println!("Time taken after walk at beginning of iteration: {}", time_taken);
        let waiting_time = if time_taken % intervals[i as usize] == 0 {0} else {(time_taken % intervals[i as usize] - intervals[i as usize]).abs()};
        if waiting_time != 0 {
            time_taken += waiting_time;
        }
        //println!("Waiting time: {}", waiting_time);
        time_taken += riding_times[i as usize];
        //println!("Time taken at the end of iteration {}: {}", i,time_taken);
    }
    time_taken += walking_times.last().unwrap();
    println!("{}", if time_taken > end_time { "no" } else { "yes" });


}
