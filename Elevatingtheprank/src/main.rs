use std::collections::HashSet;
use std::io::Read;

fn main() {

    let mut buf = String::new();
    std::io::stdin().read_to_string(&mut buf).unwrap();
    let mut lines = buf.lines();
    let mut line = lines.next().unwrap().split_whitespace();
    let source = line.next().unwrap().parse::<i32>().unwrap();
    let dest = line.next().unwrap().parse::<i32>().unwrap();
    let res = lines.into_iter().map(|x| x.parse::<i32>().unwrap()).filter(|x| *x <= dest && *x >= source).collect::<Vec<_>>();
    let dest_idx = res.iter().position(|&x| x == dest).unwrap();
    let time_waited = dest_idx*(10+4)
    // TODO: Not yet solved



}
