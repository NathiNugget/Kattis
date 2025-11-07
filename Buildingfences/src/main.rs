use std::io::Read;

fn main() {
    let mut buf = String::new();
    std::io::stdin().read_to_string(&mut buf).unwrap();
    let mut lines = buf.lines().skip(1);
    let f_line = lines.next().unwrap().split_whitespace().collect::<Vec<_>>();
    let outer_x = f_line[0].parse::<i32>().unwrap();
    let outer_y = f_line[1].parse::<i32>().unwrap();
    let mut x_smallest = outer_x;
    let mut x_largest = outer_x;
    let mut y_smallest = outer_y;
    let mut y_largest = outer_y;

    let mut ln = String::new();
    for line in lines {
        ln = line.to_string();
        let (x, y) = ln.split_once(' ').unwrap();
        let x = x.parse::<i32>().unwrap();
        let y = y.parse::<i32>().unwrap();
        if x < x_smallest {
            x_smallest = x;
        }
        if x > x_largest {
            x_largest = x;
        }
        if y < y_smallest {
            y_smallest = y;
        }
        if y > y_largest {
            y_largest = y;
        }
    }

    let total_len = 2*(((x_largest+1) - (x_smallest-1)).abs()) + 2*(((y_largest+1) - (y_smallest-1)).abs());
    println!("{}", total_len);

}
