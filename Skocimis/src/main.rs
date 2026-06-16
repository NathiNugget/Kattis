use std::io;
use std::mem::swap;

fn main() {
    let mut input = String::new();
    io::stdin().read_line(&mut input).unwrap();
    let mut lowest: i32;
    let mut mid: i32;
    let mut highest: i32;
    let mut moves = 0;
    let nums = input.trim().split(' ').map(|x|x.parse().unwrap()).collect::<Vec<i32>>();
    lowest = nums[0];
    mid = nums[1];
    highest = nums[2];

    while mid-lowest != 1 || highest-mid != 1 {
        moves += 1;
        if mid-lowest == 1 { //
            lowest = highest-1;
            swap(&mut mid, &mut lowest);//
        }
        else if highest-mid == 1 {//
            highest = lowest+1;
            swap(&mut mid, &mut highest);//
        }
        else {
            match mid - lowest > highest - mid {
                true => { //
                    highest = lowest+1;
                    swap(&mut mid, &mut highest);
                },
                false => {
                    lowest = highest-1;
                    swap(&mut mid, &mut lowest);
                }
            }
        }
    }
    println!("{}", moves);

}
