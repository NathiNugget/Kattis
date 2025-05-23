fn main() {
    let mut input = String::new();
    let _ = std::io::stdin().read_line(&mut input).unwrap();
    let thresholds :Vec<i32> = input.trim().split_whitespace().map(|x| x.parse::<i32>().unwrap()).collect();
    input.clear();
    let _ = std::io::stdin().read_line(&mut input).unwrap();
    let score = input.trim().parse::<i32>().unwrap();
    let a = *thresholds.get(0).unwrap();
    let b = *thresholds.get(1).unwrap();
    let c = *thresholds.get(2).unwrap();
    let d = *thresholds.get(3).unwrap();
    let e = *thresholds.get(4).unwrap();


    let grade = match score {
        score if score >= a => 'A',
        score if score >= b && score < a => 'B',
        score if score >= c && score < b => 'C',
        score if score >= d && score < c => 'D',
        score if score >= e && score < d => 'E',
        _ => 'F'
    };

    println!("{}", grade);



}
