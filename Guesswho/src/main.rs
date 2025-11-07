use std::collections::HashMap;
use std::io;
use std::io::Read;

fn main() {
    let mut buf = String::new();
    io::stdin().read_to_string(&mut buf).unwrap();
    let mut lines = buf.lines();
    let nums = lines.next().unwrap().split_whitespace().collect::<Vec<_>>();
    let N = nums[0].parse::<i32>().unwrap();
    let M = nums[1].parse::<i32>().unwrap();
    let Q = nums[2].parse::<i32>().unwrap();
    let mut answers:HashMap<i32, Vec<char>> = HashMap::new();

    for i in 1..=N {
        let line = lines.next().unwrap();
        answers.insert(i, line.chars().collect::<Vec<_>>());

    }

    for i in 1..=Q {
        let line = lines.next().unwrap().split_whitespace().collect::<Vec<_>>();
        let num = line[0].parse::<i32>().unwrap()-1;
        let char = line[1].chars().next().unwrap();
        answers = answers.iter()
            .filter(|(k, v)| v.get(num as usize).unwrap().eq(&char))
            .map(|(k,v)|(*k, v.clone())).collect();


    }



    match answers.iter().count() == 1 {
        true => {
            println!("unique");
            println!("{}", answers.iter().next().unwrap().0);
        }
        false => {
            println!("ambiguous");
            println!("{}", answers.iter().count());
        }
    }

}
