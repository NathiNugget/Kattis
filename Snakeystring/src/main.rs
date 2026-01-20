use std::io::Read;

fn main() {
    let mut buf = String::new();
    std::io::stdin().read_to_string(&mut buf).unwrap();
    let mut lines = buf.lines();
    let nums = lines
        .next()
        .unwrap()
        .split_whitespace()
        .map(|x| x.parse::<i32>().unwrap())
        .collect::<Vec<i32>>();
    let mut output: String = String::new();

    let vecs = lines.fold(Vec::<Vec<char>>::new(), |mut vecs, line| {
        vecs.push(line.chars().collect());
        vecs
    });

    for i in 0..nums[1] {
        output.push(vecs.iter().find(|x| x[i as usize] != '.').unwrap()[i as usize]);
    }

    println!("{}", output);
}
