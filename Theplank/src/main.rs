fn calculate_ways(total_length: usize, board_lengths: &[usize]) -> u64 {

    let mut dp = vec![0u64; total_length + 1];


    dp[0] = 1;


    for i in 1..=total_length {

        for &board in board_lengths {

            if i >= board {

                dp[i] += dp[i - board];
            }
        }
    }


    dp[total_length]
}

fn main() {

    let mut buf = String::new();
    std::io::stdin().read_line(&mut buf).unwrap();
    let n = buf.trim().parse::<i32>().unwrap();
    let target_length = n;
    let available_boards = [1, 2, 3];

    let number_of_ways = calculate_ways(target_length as usize, &available_boards);


    println!("{}", number_of_ways);



}