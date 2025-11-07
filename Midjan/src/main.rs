use std::io::Read;

fn main() {
    let mut buf = String::new();
    std::io::stdin().read_to_string(&mut buf).unwrap();
    let mut lines = buf.lines().skip(1);
    let mut vec_1 = lines.next().unwrap().split_whitespace()
        .map(|s| s.parse::<i32>().unwrap())
        .collect::<Vec<_>>();
    let mut vec_2 = lines.next().unwrap().split_whitespace()
        .map(|x| x.parse::<i32>().unwrap())
        .collect::<Vec<_>>();
    let nums_not_in_2 = vec_1.iter().filter(|x| !vec_2.contains(x)).collect::<Vec<_>>();
    let nums_not_in_1 = vec_2.iter().filter(|x| !vec_1.contains(x)).collect::<Vec<_>>();
    println!("{}", nums_not_in_2.iter().map(|x| x.to_string()).collect::<Vec<_>>().join(" "));
    println!("{}", nums_not_in_1.iter().map(|x| x.to_string()).collect::<Vec<_>>().join(" "));


}
