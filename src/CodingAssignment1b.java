import java.util.Scanner;
public class CodingAssignment1b{
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter in order: verb, verb(ed), teacher name, adjective, song name, student name, and another adjective or adverb");
        String v =  s1.nextLine();
        String ved =  s1.nextLine();
        String tn =  s1.nextLine();
        String adj =  s1.nextLine();
        String song =  s1.nextLine();
        String sn =  s1.nextLine();
        String adjoradv =  s1.nextLine();

        System.out.println("It was a " +adj +" day in APCSA, when " +tn +" burst in the doorway. They started singing " +song +" while " +sn +" " +ved +" with them. The whole class clapped as " +sn +" did their signature dance move: the " +adjoradv + " " +v +".");

    }



}
