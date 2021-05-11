public class lime extends drinkingredient {
    public lime(drink d) {
        this.DRINK = d;
    }
    public String getName() {
        return DRINK.getName() + ", Lime";
    }
    public int Calories(){
        return DRINK.Calories() + 2;
    }

}