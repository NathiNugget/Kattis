use std::collections::HashSet;

fn main() {
    let mut input = String::new();
    let _ = std::io::stdin().read_line(&mut input);
    let cases :i32 = input.trim().parse().unwrap();
    input.clear();
    let mut targets:HashSet<Vec<i32>> = HashSet::new();
    let mut coords:Vec<i32>;
    for _ in 0..cases {
        input.clear();
        let _ = std::io::stdin().read_line(&mut input);
        coords = vec![];
        let mut line = input.trim().split_whitespace().collect::<Vec<_>>();
        let shape = line.remove(0);
        let numbers :Vec<i32> = line.iter().map(|&x| x.to_string().parse().unwrap()).collect();

        match shape {
            "rectangle" => {
                for number in numbers {
                    coords.push(number);
                }
                targets.insert(coords);
            },
            "circle" => {
                for number in numbers {
                    coords.push(number);
                }
                targets.insert(coords);
            },
            _ => {}
        }
    }
    input.clear();
    let _ = std::io::stdin().read_line(&mut input);
    let shots :i32 = input.trim().parse().unwrap();
    let mut x :i32;
    let mut y :i32;
    let mut score :i32;

    for _i in 0..shots {
        score = 0;
        input.clear();
        let _ = std::io::stdin().read_line(&mut input);
        x = input.trim().split_whitespace().next().unwrap().parse().unwrap();
        y = input.trim().split_whitespace().skip(1).next().unwrap().parse().unwrap();
        for target in targets.iter() {
            match target.iter().count() {
                3 => {
                    if is_within_circle(x,y, *target.get(0).unwrap(), *target.get(1).unwrap(), *target.get(2).unwrap()) { score += 1 }
                },
                4 => {
                    if is_within_rectangle(x, y, *target.get(0).unwrap(), *target.get(1).unwrap(), *target.get(2).unwrap(), *target.get(3).unwrap()) { score += 1 }
                }
                _ => {}
            }
        }
        println!("{}", score);
    }

}

fn is_within_circle(x :i32, y :i32, circ_x :i32, circ_y :i32, radius :i32) -> bool {
    f32::sqrt((x - circ_x).pow(2) as f32 +(y-circ_y).pow(2) as f32) <= radius as f32
}

fn is_within_rectangle(x :i32, y :i32, x1 :i32, y1 :i32, x2 :i32, y2 :i32) -> bool {
    x >= x1 && x <= x2 && y >= y1 && y <= y2
}
