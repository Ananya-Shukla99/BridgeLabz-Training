//a program tp replace 
import java.util.*;
public class ReplaceWord {
    public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
		
        String sentence = sc.next();
        String oldWord = sc.next();
        String newWord = sc.next();

        String updated = sentence.replace(oldWord, newWord); // replace all occurrences
        System.out.println(updated);
    }
}