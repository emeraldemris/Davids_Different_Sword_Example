public class Solution {

    public static void main(String[] args) {


        System.out.println("what kind of IceCream is David eating");

        Person david = new Person("David", "Cheese Lord");
        Person noah = new Person( "Noah", "Buffalo King");
        Person zach = new Person("Zach", "of Seatac");

        final Icecream chocolate = new Icecream( "chocolate", 100);

        System.out.println("unsure test");

        david.setIcecream(chocolate);

        System.out.println(david.getFullTitle() +  " is eating " + david.getIceCreamType);
        System.out.println(zach.getFullTitle() + " tbd");
        System.out.println(noah.getFullTitle() + " tbd");


    }
}