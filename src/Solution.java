public class Solution {

    public static void main(final String[] args) {
        System.out.println("what kind of IceCream is David eating");

        final Person david = new Person("David", "Cheese Lord");
        final Person noah = new Person( "Noah", "Buffalo Tyrant");
        Person zach = new Person("Zach", "of Seatac");
        zach = new Person("Zach", "of Seatac 2");

        final Icecream chocolate = new Icecream( "chocolate", 100);

        System.out.println("unsure test");

        david.setIcecream(chocolate);

	//david

        System.out.println(david.getFullTitle() +  " is eating " + david.getIceCreamType);
        System.out.println(zach.getFullTitle() + " tbd");
        System.out.println(noah.getFullTitle() + " tbd");
    }
}