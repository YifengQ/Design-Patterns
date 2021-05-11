public class cherry extends drinkingredient {
    public cherry (drink d) {
        this.DRINK = d;
    }
    public String getName() {
        return DRINK.getName() + ", Cherry";
    }
    public int Calories(){
        return DRINK.Calories() + 40;
    }

}