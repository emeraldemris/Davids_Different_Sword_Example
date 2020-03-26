public class Icecream {


    private final String iceCreamType;
    private final int calories;

    public Icecream (final String iceCreamType, final int calories){
        this.iceCreamType = iceCreamType;
        this. calories =  calories;

    }
    public String getIceCreamType(){
        return this.iceCreamType;
    }
    public int getCalories(){
        return this.calories;
    }
    public void printData(){
        System.out.println(this.calories);
    }
}
