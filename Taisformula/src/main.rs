fn main() {
    let mut input = String::new();
    let _ = std::io::stdin().read_line(&mut input).unwrap();
    let measurements :i32 = input.trim().parse().unwrap();
    input.clear();
    let mut res = 0.0;
    let mut times:Vec<i64> = Vec::with_capacity(measurements as usize);
    let mut mls:Vec<f64> = Vec::with_capacity(measurements as usize);
    for _ in 0..measurements {
        input.clear();
        let _ = std::io::stdin().read_line(&mut input).unwrap();
        let line = input.trim().split(" ").collect::<Vec<&str>>();
        times.push(line[0].parse::<i64>().unwrap());
        mls.push(line[1].parse::<f64>().unwrap());
    }

    for i in 1..mls.len() {
        res += ((mls.get(i-1).unwrap() + mls.get(i).unwrap())/2.0)*(times[i] as f64 - times[i-1] as f64);

    }
    println!("{}", res/1000.0);


}
