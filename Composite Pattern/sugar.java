public class sugar extends drinkingredient {
    public sugar(drink d) {
        this.DRINK = d;
    }
    public String getName() {
        return DRINK.getName() + ", Sugar";
    }
    public int Calories(){
        return DRINK.Calories() + 300;
    }

}