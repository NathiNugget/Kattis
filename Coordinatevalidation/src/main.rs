use std::io::Read;

fn main() {
    let mut buf = String::new();
    std::io::stdin().read_to_string(&mut buf).unwrap();
    let mut lines = buf.lines().skip(1);
    for line in lines {
        let mut nums = line.split_ascii_whitespace();
        let (long,lat) = (nums.next().unwrap().parse::<f32>().unwrap(), nums.next().unwrap().parse::<f32>().unwrap());
        println!("{}", match (long <= 180f32 && long >= -180f32) && (lat <= 90f32 && lat >= -90f32) {
            true => {"VALID"}
            false => {"INVALID"}
        })

    }
}
