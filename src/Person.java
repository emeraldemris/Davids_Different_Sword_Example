public class Person {

    private String name;
    private String title;
    private Icecream icecream;

    public Person(final String name, final String title) {

        this.name = name;
        this.title = title;
    }

        public Object getName () {
            return this.name;
        }

        public String getTitle () {
            return this.title;
        }



    public String getFullTitle () {
        return this.getName() + " " + this.getTitle();
    }
    public void setIcecream(final Icecream icecream) {this.icecream = icecream;
    }

}