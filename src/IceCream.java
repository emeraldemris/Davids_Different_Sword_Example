public class IceCream {


    private final String iceCreamType;
    private final int foodCalories;
    //this is a constructor, a constructor builds a new instance of an object
    //a constructor is a special type of method/ function, it doesn't have an return type
    //(string int void)
    public IceCream(final String iceCreamType, final int chemicalCalories){
        this.iceCreamType = iceCreamType;
        this.foodCalories =  chemicalCalories;
    }

    public String getIceCreamType(){
        return this.iceCreamType;
    }
    //food calories = chemical calories /1000
    public int getFoodCalories(){
        return (int) Math.floor( this.foodCalories /1000);
    }
    public String getDescription() {
        return this.iceCreamType + this.getFoodCalories();
    }

    public void printData(){
        System.out.println(this.foodCalories);
    }
}
