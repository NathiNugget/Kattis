use std::collections::HashMap;
use std::io;
use std::io::Read;

#[derive(Debug, Eq, PartialEq, Hash, Clone)]
struct swag {
    x: i32,
    y: i32,
}

fn main() {
    let mut buf = String::new();
    io::stdin().read_to_string(&mut buf).unwrap();
    let mut lines = buf.lines().skip(1);
    let mut island_map = HashMap::<swag, char>::new();
    for (i, line) in lines.enumerate() {
        let chars = line.chars();
        for (j, char) in chars.enumerate() {
            if char == 'L' || char == 'C' {island_map.insert(swag { x: j as i32, y: i as i32 }, char);}
        }
    }

    println!("{:?}", island_map);
    let mut islands_num = 0;
    let mut buffer :Vec<swag> = vec![];
    let mut itr = island_map.iter_mut();
    
    loop {
        let some = itr.next().unwrap();
        let x = some.0.x;
        let y = some.0.y;
        if island_map.contains_key(&swag { x: x+1, y: y }) {
            buffer.push(swag { x: x+1, y: y });
            continue;
        }


        else if island_map.contains_key(&swag { x: x, y: y-1})
            {
                buffer.push(swag { x: x+1, y: y-1 });
                continue;
            }
        else if island_map.contains_key(&swag { x: x-1, y: y  }) {
                buffer.push(swag { x: x-1, y: y  });
            continue;
        }
        else if island_map.contains_key(&swag { x: x, y: y+1  }) {
            buffer.push(swag { x: x, y: y+1  });
            continue;
        }
        for k in buffer.clone() {
            island_map.remove(&k);
            buffer.clear();
        }

        islands_num += 1;


        if island_map.is_empty() {break;}
    }



}
