import java.util.*;
 public class exe60 {
     public static void main(String[] args){	
     Scanner sc = new Scanner(System.in);
     System.out.print("Input a Sentence: ");
	 String line = sc.nextLine();
	 String[] words = line.split("[ ]+");
	 System.out.println("Penultimate word: "+words[words.length - 2]);
	 }			
}