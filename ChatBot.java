import java.util.Scanner;
public class ChatBot{
    public static void main(String [] args){
    Scanner scan = new Scanner(System.in);

        System.out.println("\nI am Shakerbot, Are you ready to answer some questions?");
        System.out.println("What is your name?");
       

        String name = scan.nextLine() ;

        System.out.println("\nHow old are you?");
        int age = scan.nextInt();

        scan.nextLine();
        System.out.println("\nWhere do you live?");
        String city = scan.nextLine();


        System.out.println("\nWhere are you from?");
        String country = scan.nextLine();

        System.out.println("\nWhat is your favourite colour?");
        String colour = scan.nextLine();

        System.out.println("\nHow much do you spend on shoes?");
        double shoe = scan.nextDouble();

        System.out.println("\nHow much do you spend on clothing?");
        double clothe = scan.nextDouble();

        scan.nextLine();
        System.out.println("\nWhat is your favorite shoe brand?");
        String shoeBrand = scan.nextLine();

        System.out.println("\nWhat is your favorite  clothing brand");
        String clotheBrand = scan.nextLine();

        System.out.println("\nHello " + name + "!");
        System.out.println("You said you're " + age + " years old. That's great!");
        System.out.println("I heard " + city + " is a great place with good people");
        System.out.println("Wow! " + country + " is wonderful country");
        System.out.println(colour + " is a nice  colour!");
        System.out.println("You Spend $" + shoe + " on shoes");
        System.out.println("You Spend $" + clothe + " on clothing");
        System.out.println("Your favorite shoe brand is " + shoeBrand);
        System.out.println("Your favorite clothe brand is " + clotheBrand);
        System.out.println("\nThank you for taking time to answer the questions " + name +"!");
        System.out.print("\nThis is Shakerbot!\n");

        scan.close();
    }




}
