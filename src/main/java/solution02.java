import java.util.Scanner;
public class solution02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = input.nextLine();//reads input on next line
        System.out.println("The word "+ s + " has " + s.length() + " characters. " );

    }
}
/*also, pretty simple. first call in the java.util library so i can use the scanner
 function. declare and create an instance of the scanner function. print out the
 line for them to input the string, read in the input, and then print it. this was
 the hardest part, which was realizing that two + signs could be put into the same funciton.
 first we print the word inputted, and then the length of the function using s.length.
*/