use std::io::Read;


    use std::io::{self, BufRead};

    fn main() {
        let mut buf = String::new();
        io::stdin().read_to_string(&mut buf).unwrap();
        let mut lines = buf.lines();
        let first_line = lines.next().unwrap();
        let mut parts = first_line.split_whitespace();
        let n: usize = parts.next().unwrap().parse::<u32>().unwrap() as usize;
        let m: usize = parts.next().unwrap().parse::<u32>().unwrap() as usize;


        let mut elem: Vec<usize> = (1..=n).collect();


        for _ in 0..m {
            let line = lines.next().unwrap();
            let rung: usize = line.trim().parse().unwrap();


            elem.swap(rung - 1, rung);
        }


        for el in elem {
            println!("{}", el);
        }
    }


