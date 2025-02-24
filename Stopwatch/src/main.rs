use std::io::stdin;


fn main() {
    let mut buf:String = String::new();
    let times :u32 = read_line(&mut buf);
    if times % 2 == 1 {
        println!("still running");
    } else {
        let mut time:u32 = 0;
        let mut previous_time:u32 = 0;
        let mut running = true;
        let mut val:u32;
        for _ in 0..times {
            val = read_line(&mut buf);
            running = !running;
            if running {
                time += val-previous_time;

            }
            previous_time = val;

        }
        println!("{}", time);
    }
}

fn read_line(buf: &mut String) -> u32 {
    buf.clear();
    stdin().read_line(buf).unwrap();
    buf.trim().parse().unwrap()

}
