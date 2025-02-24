use std::path::Component::ParentDir;

fn main() {


    let mut buf = String::new();
    let _ = std::io::stdin().read_line(&mut buf );
    let val :i32 = buf.trim().parse().unwrap();
    let gin = 45 * val;
    let lemon_juice = 30 * val;
    let syrup = 10 * val;
    let lemon = 1 * val;
    if lemon == 1 {
        println!("{} ml gin\n{} ml fresh lemon juice\n{} ml simple syrup\n{} slice of lemon", gin, lemon_juice, syrup, lemon);
    } else {
        println!("{} ml gin\n{} ml fresh lemon juice\n{} ml simple syrup\n{} slices of lemon", gin, lemon_juice, syrup, lemon);

    }

}
