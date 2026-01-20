use std::collections::HashMap;
use std::io::Read;

fn main() {
    let mut buf = String::new();
    std::io::stdin().read_to_string(&mut buf).unwrap();
    let mut lines = buf.lines().skip(1);
    let mut map = lines.into_iter().fold(HashMap::<char, i32>::new(), |mut m, x| {
        let mut vals = x.split_whitespace().collect::<Vec<&str>>();
        let char = vals[0].chars().next().unwrap();
        let val = vals[1].parse::<i32>().unwrap();
        m.entry(char).and_modify(|x| *x += val).or_insert(val);


        m
    });

    let mut boxes = 0;
    for (char, count) in map.clone() {
        if count != 0 {
            match char {
                'S' => {boxes += (count as f64/6.0).ceil() as i32 },
                'M' => {boxes += (count as f64/8.0).ceil() as i32 },

                _ => {
                    boxes += (count as f64/12.0).ceil() as i32
                }
            }
        }
    }

    println!("{}", boxes);
}
