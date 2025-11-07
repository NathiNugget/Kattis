use std::io::Read;

fn main() {
    let mut buf = String::new();
    std::io::stdin().read_to_string(&mut buf).unwrap();
    let mut lines = buf.trim().lines();
    let line = lines.next().unwrap();
    let vals = line.split_ascii_whitespace().collect::<Vec<_>>();
    let mut output = "?"
        .repeat(vals[0].parse::<usize>().unwrap())
        .trim()
        .to_string();

    'my_dick_in_half: for line in lines {
        let vals = line.split_ascii_whitespace().collect::<Vec<_>>();
        let pos = vals[0].parse::<i32>().unwrap() - 1;

        let space_to_search = vals[1].len() as i32;

        let slice = &output[(pos) as usize..(pos + space_to_search) as usize];

        let mut chs = vals[1].chars();
        for ch in slice.chars() {
            if ch != chs.next().unwrap() && ch != '?' {
                output = "Villa".to_owned();
                break 'my_dick_in_half;
            }
        }

        output.replace_range((pos) as usize..(pos + space_to_search) as usize, vals[1]);
        output = output.trim().to_owned();
    }
    println!("{}", output);
}
