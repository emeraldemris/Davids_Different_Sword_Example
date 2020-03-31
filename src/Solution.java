import java.util.Scanner;

public class Solution {
    //this variable is static which means it's universal. There is one program name in the whole program.
    private static final String programName = "David's Program";
    private static String status = "Starting"; //because there is only one status but it could be updated

    //final each icecream has it's own type but it's type can't change
    public static void main(String[] args) {


        System.out.println("what kind of IceCream is David eating");

        final Person david = new Person("David", "The Cheese Lord");
        final Person noah = new Person("Noah", "The Buffalo King");
        final Person zach = new Person("Zach", "of Seatac");

        //new calls the constructor for icecream
        //local varriable (only exists in main)
        final IceCream peanutbutter = new IceCream("peanutbutter", 150000);
        final IceCream chocolate = new IceCream("chocolate", 100000);


        System.out.println("unsure test");

        final Scanner scanner = new Scanner(System.in);
        String input = "";

        System.out.println("Menu:");
        System.out.println("0-exit");
        System.out.println("1-what is David eating?");
        System.out.println("2-what is Zach eating?");
        System.out.println("3-what is Noah eating?");


        zach.setIcecream(chocolate);
        david.setIcecream(peanutbutter);
        noah.setIcecream(null);

        while (!input.equals("0")) {
            input = scanner.next();

            if (input.equals("1") || input.equals("David")) {
                System.out.println(david.getFullTitle() + " is eating " + david.getIceCreamType());
            } else if (input.equals("2") || input.equals("Zach")) {
                System.out.println(zach.getFullTitle() + " is eating " + zach.getIceCreamType());
            }
             else if (input.equals("3") || input.equals("Noah")) {
                System.out.println(noah.getFullTitle() + " is eating " + noah.getIceCreamType());
            } else {
                System.out.println("who?");
            }
        }






            //david
            System.out.println(zach.getFullTitle() + "is eating " + zach.getIceCreamType());
            System.out.println(noah.getFullTitle() + " is eating " + noah.getIceCreamType());

            david.printData();


        }

    }