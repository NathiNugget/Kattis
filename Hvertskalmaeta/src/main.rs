use std::collections::HashMap;
use std::io;

fn main() {
    let mut some_map = HashMap::new();
    some_map.insert("Reykjavik", "Reykjavik");
    some_map.insert("Kopavogur", "Reykjavik");
    some_map.insert("Hafnarfjordur", "Reykjavik");
    some_map.insert("Reykjanesbaer", "Reykjavik");
    some_map.insert("Akureyri", "Akureyri");
    some_map.insert("Gardabaer", "Reykjavik");
    some_map.insert("Mosfellsbaer", "Reykjavik");
    some_map.insert("Arborg", "Reykjavik");
    some_map.insert("Akranes", "Reykjavik");
    some_map.insert("Fjardabyggd", "Akureyri");
    some_map.insert("Mulathing", "Akureyri");
    some_map.insert("Seltjarnarnes", "Reykjavik");

    let mut buf = String::new();
    let _ = io::stdin().read_line(&mut buf);
    buf = buf.trim().parse().unwrap();
    println!("{}", some_map.get(buf.as_str()).unwrap());




}
