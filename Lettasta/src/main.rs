use std::io;

fn main() {
    let mut buf: String = String::new();
    let _ = io::stdin().read_line(&mut buf);
    let problems: u32 = buf.trim().parse().unwrap();
    buf.clear();
    let _ = io::stdin().read_line(&mut buf);
    let teams :u32 = buf.trim().parse().unwrap();
    buf.clear();
    let _ = io::stdin().read_line(&mut buf);
    let names :Vec<String> = buf
        .trim()
        .split(' ')
        .map(|x| x.to_string())
        .collect();
    let mut scores :Vec<u32> = Vec::with_capacity(problems as usize);
    for i in 0..scores.capacity() {
        scores.push(0);
    }
    for _i in 0..teams {
        buf.clear();
        let _ = io::stdin().read_line(&mut buf);
        let values_as_str :Vec<&str> = buf.trim().split(' ').collect();
        let values :Vec<u32> = values_as_str.iter()
            .map(|x| x.parse().unwrap())
            .collect();

        for j in 0..names.len() {
            scores[j] += values[j];
        }
    }


    let mut max_idx:usize = 0;
    for i in 0..scores.len() {
        if scores[i] > scores[max_idx] {
            max_idx = i;
        }
    }
    println!("{}", names[max_idx]);

}

