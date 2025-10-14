use std::any::Any;
use std::cmp::Ordering::Less;
use std::io;
use std::io::Read;

#[derive(Debug)]
enum Type {
    Skrimsli = 1,
    Galdur = 2,
    Gildra = 3,
    Annad = 4

}

#[derive(Debug)]
struct Card {
    name: String,
    id: i32,
    card_type: Type,
    sub_type: Option<String>,
    year: i32,
    month: i32,
    day: i32,
}

impl Card {
    fn new(read_name: String, read_id: i32, read_type: String, read_subtype: Option<String>, read_year: i32, read_month: i32, read_day: i32) -> Self {
        Card{
            name: read_name,
            id: read_id,
            card_type: match read_type.as_str() { "Skrimsli" => Type::Skrimsli, "Galdur" => Type::Galdur, "Gildra" => Type::Gildra, _ => Type::Annad, },
            sub_type: read_subtype,
            year: read_year,
            month: read_month,
            day: read_day,
        }
    }
}




fn main() {
    let skrimsli_types = ["Venjulegt", "Ahrifa", "Bodunar", "Samruna", "Samstillt", "Thaeo", "Penduls", "Tengis"];
    let galdur_types = ["Venjulegur", "Bunadar", "Svida", "Samfelldur", "Bodunar", "Hradur"];
    let gildra_types = ["Venjuleg", "Samfelld", "Mot"];
    let mut buf = String::new();
    io::stdin().read_to_string(&mut buf).unwrap();
    let lines_read = buf.trim().to_string();
    let mut lines_read = lines_read.lines();
    let mut parts :Vec<&str>;
    let mut this_card :Card;
    let mut line_type : String;
    let mut this_subtype : String;
    let mut this_combo = vec![""];
    let mut this_year_month_date = vec![""];

    for line in lines_read.skip(1) {
        parts = line.split(", ").collect();
        match parts[2].contains("Annad") {
            true => {
                this_combo  = vec![parts[2].trim()];
                this_year_month_date = parts[3].split("-").collect::<Vec<&str>>();
                this_card = Card::new(
                    parts[0].to_string(),
                    parts[1].parse().unwrap(),
                    this_combo[0].to_string(),
                    None,
                    this_year_month_date[0].parse().unwrap(),
                    this_year_month_date[1].parse().unwrap(),
                    this_year_month_date[2].parse().unwrap(),
                );
            }
            false => {
                this_combo  = parts[2].trim().split(" - ").collect::<Vec<&str>>();
                this_year_month_date = parts[3].split("-").collect::<Vec<&str>>();
                this_card = Card::new(
                    parts[0].to_string(),
                    parts[1].parse().unwrap(),
                    this_combo[0].to_string(),
                    Some(this_combo[1].to_string()),
                    this_year_month_date[0].parse().unwrap(),
                    this_year_month_date[1].parse().unwrap(),
                    this_year_month_date[2].parse().unwrap(),
                );
            }
        }
        println!("{:?}", this_card);

    }




}
