
<<<<<<< Updated upstream
    public static void main(final String[] args) {
        System.out.println("what kind of IceCream is David eating");

        final Person david = new Person("David", "Cheese Lord");
        final Person noah = new Person( "Noah", "Buffalo Tyrant");
        Person zach = new Person("Zach", "of Seatac");
        zach = new Person("Zach", "of Seatac 2");
=======

public class Solution {
    //this variable is static which means it's universal. There is one program name in the whole program.
private static final String programName = "David's Program";
private static String status = "Starting"; //because there is only one status but it could be updated
//final each icecream has it's own type but it's type can't change
    public static void main(String[] args) {


        System.out.println("what kind of IceCream is David eating");

        final Person david = new Person("David", "Cheese Lord");
        final Person noah = new Person( "Noah", "Buffalo King");
        final Person zach = new Person("Zach", "of Seatac");

        //new calls the constructor for icecream
        //local varriable (only exists in main)
        final IceCream peanutbutter = new IceCream( "peanutbutter", 150000);
        final IceCream chocolate = new IceCream( "chocolate", 100000);
>>>>>>> Stashed changes


        System.out.println("unsure test");

        zach.setIcecream(chocolate);
        david.setIcecream(peanutbutter);
        noah.setIcecream(null);


	//david

<<<<<<< Updated upstream
        System.out.println(david.getFullTitle() +  " is eating " + david.getIceCreamType);
        System.out.println(zach.getFullTitle() + " tbd");
        System.out.println(noah.getFullTitle() + " tbd");
=======
        System.out.println(david.getFullTitle() +  " is eating " + david.getIceCreamType());
        System.out.println(zach.getFullTitle() + "is eating " + zach.getIceCreamType());
        System.out.println(noah.getFullTitle() + " is eating " + noah.getIceCreamType());

        david.printData();




>>>>>>> Stashed changes
    }
}