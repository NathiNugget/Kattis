use std::io;

fn main() {
    let mut buf = String::new();
    io::stdin().read_line(&mut buf).unwrap();
    let nums = buf.split_whitespace().map(|x| x.parse::<i32>().unwrap()).collect::<Vec<i32>>();
    if (nums[1] % nums[0] == 0){
        println!("{}", nums[1]/nums[0]);
    }
    else {
        let remaining = nums[1] % nums[0];
        let times = nums[1] / nums[0];
        println!("{}", remaining+times);
    }
}
