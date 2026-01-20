use std::io;
use std::io::Read;

fn main() -> Result<(), io::Error> {
    let mut buf = String::new();
    io::stdin().read_line(&mut buf).unwrap();
    buf.clear();
    io::stdin().read_line(&mut buf).unwrap();
    let mut candidates = buf.split_whitespace().map(|x| x.parse::<i32>().unwrap()).collect::<Vec<i32>>();
    candidates.sort();

    let mut cand_idx = candidates.len()-2;
    let mut second_can = candidates[cand_idx];
    let total_votes = candidates.iter().sum();
    for i in 0..candidates.len()-2 {
        second_can += candidates[i];
        if second_can * 2 > total_votes {
            println!("{}", i+1);
            return Ok(());
        }


    }
    println!("IMPOSSIBLE TO WIN");
    Ok(())



}
