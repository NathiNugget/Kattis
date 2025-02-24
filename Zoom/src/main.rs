use std::io;

fn main() {
    let mut buf:String = String::new();
    let _ = io::stdin().read_line(&mut buf);
    let first_line:Vec<i32> = buf.trim().split(' ').map(|x| x.parse::<i32>().unwrap()).collect();
    let modulus :i32 = *first_line.get(1).unwrap();
    buf.clear();
    let _ = io::stdin().read_line(&mut buf);
    let input :Vec<i32> = buf.trim().split(' ').map(|x| x.parse::<i32>().unwrap()).collect();
    let mut container:Vec<i32> = Vec::with_capacity(first_line.len()/modulus as usize);
    let mut counter = 0;
    for i in input.iter() {
        counter += 1;
        if counter % modulus == 0 {
            container.push(*i);
        }
    }
    let output :String = container
        .into_iter()
        .map(|x| x.to_string())
        .collect::<Vec<String>>()
        .join(" ");


    println!("{}", output);
}
