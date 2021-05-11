public class vermouth extends drinkingredient {
    public vermouth(drink d) {
        this.DRINK = d;
    }
    public String getName() {
        return DRINK.getName() + ", Vermouth";
    }
    public int Calories(){
        return DRINK.Calories() + 40;
    }

}