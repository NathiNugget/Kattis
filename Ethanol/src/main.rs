

fn main() {
    let mut input = String::new();
    let _ = std::io::stdin().read_line(&mut input);
    let num = input.trim().parse::<i32>().unwrap();
    let mut painting:[&str; 10] = [""; 10];

    painting[0] = "  H  \n  |  \nH-C-OH\n  |  \n  H  ";
    painting[1] = "  H H  \n  | |  \nH-C-C-OH\n  | |  \n  H H  ";
    painting[2] = "  H H H  \n  | | |  \nH-C-C-C-OH\n  | | |  \n  H H H  ";
    painting[3] = "  H H H H  \n  | | | |  \nH-C-C-C-C-OH\n  | | | |  \n  H H H H  ";
    painting[4] = "  H H H H H  \n  | | | | |  \nH-C-C-C-C-C-OH\n  | | | | |  \n  H H H H H  ";
    painting[5] = "  H H H H H H  \n  | | | | | |  \nH-C-C-C-C-C-C-OH\n  | | | | | |  \n  H H H H H H  ";
    painting[6] = "  H H H H H H H  \n  | | | | | | |  \nH-C-C-C-C-C-C-C-OH\n  | | | | | | |  \n  H H H H H H H  ";
    painting[7] = "  H H H H H H H H  \n  | | | | | | | |  \nH-C-C-C-C-C-C-C-C-OH\n  | | | | | | | |  \n  H H H H H H H H  ";
    painting[8] = "  H H H H H H H H H  \n  | | | | | | | | |  \nH-C-C-C-C-C-C-C-C-C-OH\n  | | | | | | | | |  \n  H H H H H H H H H  ";
    painting[9] = "  H H H H H H H H H H  \n  | | | | | | | | | |  \nH-C-C-C-C-C-C-C-C-C-C-OH\n  | | | | | | | | | |  \n  H H H H H H H H H H  ";

    println!("{}", painting[(num-1) as usize]);
}
