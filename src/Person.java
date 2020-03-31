public class Person {
    private String name;
    private String title;
    private IceCream icecream;

    public Person(final String name, final String title) {
        this.name = name;
        this.title = title;
        int x = Math.min(1, 2);
    }

        public Object getName () {
            return this.name;
        }

        public String getTitle () {
            return this.title;
            //david
        }


    public String getFullTitle() {
        return this.getName() + " " + this.getTitle();
    }

    public void setIcecream(final IceCream icecream) {
        this.icecream = icecream;
    }

    public String getIceCreamType() {
        //turinary operator : equvilent to "if icecream is null, then nothing, else icecream type"
        return this.icecream == null ? "nothing": this.icecream.getIceCreamType();
        //return this.icecream.getIceCreamType();
    }

    public int getCalories() {
        return this.icecream.getFoodCalories();
    }

    public void printData() {
        System.out.println(this.getCalories());
    }
}