import java.util.Scanner;
public class CodingAssignment1a {
    public static void main(String[] args) throws Exception {
        System.out.print("Enter your name: ");

        Scanner s1 = new Scanner(System.in);
        String userName = s1.nextLine();
        System.out.println("Hi, " +userName + ", welcome to APCSA!");

        System.out.print("Name 1: ");
        String Name1 = s1.nextLine();
        String n1 = Name1;
        System.out.print("Name 2: ");
        String Name2 = s1.nextLine();
        String n2 = Name2;
        System.out.print("Name 3: ");
        String Name3 = s1.nextLine();
        String n3 = Name3;
        System.out.println(n3 +", " +n2 +", " +n1);

        System.out.print("Enter weight: ");
        double weight = s1.nextDouble();
        System.out.println("You weigh " + weight*0.4 +" on Mercury.");
        System.out.println("You weigh " + weight*0.9 +" on Venus.");
        System.out.println("You weigh " + weight*0.38 +" on Mars.");
        System.out.println("You weigh " + weight*2.3 +" on Jupiter.");
        System.out.println("You weigh " + weight*1.1 +" on Saturn.");
        System.out.println("You weigh " + weight*0.92 +" on Uranus.");
        System.out.println("You weigh " + weight*1.2 +" on Neptune.");

        // whitespace

        s1.nextLine();

        System.out.print("Name an amount of seconds: ");
        int time = s1.nextInt();
        int hours = time / 3600;
        int minutes = (time % 3600) / 60;
        int seconds = time % 60;
        System.out.println("That is " + hours +" hours, " + minutes + " minutes, and " +seconds +" seconds.");

    }
}
