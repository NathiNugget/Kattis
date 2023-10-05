import java.util.HashSet;
import java.util.Scanner;

public class Countthevowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        HashSet<Character> list = new HashSet<Character>(); 
        list.add('a');
        list.add('e');
        list.add('i');
        list.add('o');
        list.add('u');
        list.add('A');
        list.add('E');
        list.add('I');
        list.add('O');
        list.add('U');

        char[] input = sc.nextLine().toCharArray(); 
        int vowels = 0; 

        for (char c : input) {
            if (list.contains(c)) {
                vowels++; 
            }
        }
        sc.close();
        System.out.println(vowels);
    }
}
