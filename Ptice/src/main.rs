fn main() {
    let adrian_letters :[char; 3] = ['A', 'B', 'C'];
    let bruno_letters :[char; 4] = ['B', 'A', 'B', 'C'];
    let goran_letters :[char; 6] = ['C', 'C', 'A', 'A', 'B', 'B'];
    let mut adrian_score = 0;
    let mut bruno_score = 0;
    let mut goran_score = 0;
    let mut input = String::new();
    std::io::stdin().read_line(&mut input).unwrap();
    input.clear();
    std::io::stdin().read_line(&mut input).unwrap();
    for (index, letter) in input.chars().enumerate() {
        if letter.eq(&adrian_letters[index % 3])  {
            adrian_score += 1;
        }
        if letter.eq(&bruno_letters[index % 4])  {
            bruno_score += 1;
        }
        if letter.eq(&goran_letters[index % 6])  {
            goran_score += 1;
        }
    }

    if adrian_score > bruno_score && adrian_score > goran_score {
        println!("{}", adrian_score);
        println!("Adrian");
    }

    else if bruno_score > goran_score && bruno_score > adrian_score {
        println!("{}", bruno_score);
        println!("Bruno");
    }
    else if goran_score > adrian_score && goran_score > bruno_score {
        println!("{}", goran_score);
        println!("Goran");
    }
    else if adrian_score > bruno_score && adrian_score == goran_score {
        println!("{}", adrian_score);
        println!("Adrian");
        println!("Goran");
    }
    else if bruno_score > adrian_score && bruno_score == goran_score {
        println!("{}", bruno_score);
        println!("Bruno");
        println!("Goran");
    }
    else if adrian_score > goran_score && adrian_score == bruno_score {
        println!("{}", adrian_score);
        println!("Adrian");
        println!("Bruno");
    }
    else {
        println!("{}", adrian_score);
        println!("Adrian");
        println!("Bruno");
        println!("Goran");
    }

}
