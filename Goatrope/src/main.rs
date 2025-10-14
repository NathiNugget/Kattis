use std::io;
use std::f64;

fn main() {
    // Read input
    let mut input = String::new();
    io::stdin().read_line(&mut input).unwrap();
    let nums: Vec<i32> = input
        .split_whitespace()
        .map(|x| x.parse().unwrap())
        .collect();

    let (x, y, x1, y1, x2, y2) = (nums[0], nums[1], nums[2], nums[3], nums[4], nums[5]);

    // Normalize rectangle corners
    let (rx1, rx2) = if x1 < x2 { (x1, x2) } else { (x2, x1) };
    let (ry1, ry2) = if y1 < y2 { (y1, y2) } else { (y2, y1) };

    // Compute closest point on rectangle to (x, y)
    let cx = if x < rx1 {
        rx1
    } else if x > rx2 {
        rx2
    } else {
        x
    };

    let cy = if y < ry1 {
        ry1
    } else if y > ry2 {
        ry2
    } else {
        y
    };

    // Compute Euclidean distance
    let dx = (x - cx) as f64;
    let dy = (y - cy) as f64;
    let distance = (dx * dx + dy * dy).sqrt();

    // Print result with high precision
    println!("{}", distance);
}
