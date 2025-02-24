fn main() {
    let arr :[[char;2];2] = [['a','e'], ['v','v']];
    check_arr(&arr);
}

fn check_arr(arr: &[[char; 2]; 2]) -> &'static str {
    for (x, row) in arr.iter().enumerate() {
        for (y, col) in row.iter().enumerate() {
           println!("{:?},{:?}", *col, *row);
        }
    }

    ""
}

