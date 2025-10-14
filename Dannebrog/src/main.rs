fn main() {
    let mut buf = String::new();
    std::io::stdin().read_line(&mut buf).unwrap();
    let scale :f64 = 34.0/28.0;
    let x :f64 = buf.trim().parse().unwrap();
    let top :f64 = x*scale;
    let total_area = x*top;
    let cross_width = x/7.0;
    let cross :f64 = top*cross_width + x*cross_width - (cross_width*cross_width);
    let red_area :f64 = total_area - cross;
    println!("{}", red_area);
}
