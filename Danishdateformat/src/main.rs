use std::collections::HashMap;

fn main() {
    let mut buf = String::new();
    std::io::stdin().read_line(&mut buf).unwrap();
    buf = buf.trim().to_string();
    let parts = buf.split("/").collect::<Vec<_>>();
    let map = HashMap::from([
        ("01", "januar"),
        ("02", "februar"),
        ("03", "marts"),
        ("04", "april"),
        ("05", "maj"),
        ("06", "juni"),
        ("07", "juli"),
        ("08", "august"),
        ("09", "september"),
        ("10", "oktober"),
        ("11", "november"),
        ("12", "december"),
    ]);

    let mut output = String::new();
    let mut val:String = String::from(parts[1]);
    match val.chars().nth(0).unwrap() == '0' {
        true => {
            val = val.replace('0', "");
        }
        false => {}
    }

    output.push_str(val.as_str());
    output.push_str(". ");
    output.push_str(map.get(parts[0]).unwrap());
    let mut final_part:String = String::from(" ");
    final_part.push_str(parts[2]);
    output.push_str(&final_part);
    println!("{}", output);
}
