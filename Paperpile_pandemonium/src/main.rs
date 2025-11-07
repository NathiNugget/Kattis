use std::io;
use std::io::Read;

fn main() {
    let mut buf = String::new();
    io::stdin().read_to_string(&mut buf).unwrap();

    let mut lines = buf.lines();
    let line = lines.next().unwrap();
    let nums = line.split_ascii_whitespace().map(|x| x.parse::<i32>().unwrap()).collect::<Vec<i32>>();
    let mut paperpiles:Vec<Vec<i32>> = vec![];

    for _ in 0..nums[1]{
        let mut local_pile:Vec<i32> = Vec::new();
        let mut num = 0;
        let line = lines.next().unwrap();
        local_pile = line.split_whitespace().map(|x| x.parse::<i32>().unwrap()).collect::<Vec<i32>>().iter().skip(1).map(|x| x.clone()).collect::<Vec<i32>>();
        paperpiles.push(local_pile);

    }
    let m = lines.next().unwrap().parse::<i32>().unwrap();

    for _ in 0..m {
        let line = lines.next().unwrap();
        let nums = line.split_whitespace().map(|x| x.parse::<i32>().unwrap()).collect::<Vec<i32>>();
        let source = (nums[0]-1) as usize;
        let target = (nums[1]-1) as usize;
        let sheets = nums[2] as usize;

        let mut placeholder: Vec<i32> = vec![];
        (0..sheets).for_each(|_| {
            placeholder.push(paperpiles[source].pop().unwrap());
        });




        (0..sheets).for_each(|_| {
            paperpiles[target].push(placeholder.pop().unwrap());
        });


    }

    paperpiles.iter().for_each(|x|{
        println!("{}", x.into_iter().map(|y| y.to_string()).collect::<Vec<String>>().join(" "));

    })
}
