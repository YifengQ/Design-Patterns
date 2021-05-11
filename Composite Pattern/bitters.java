public class bitters extends drinkingredient {
    public bitters(drink d) {
        this.DRINK = d;
    }
    public String getName() {
        return DRINK.getName() + ", Bitters";
    }
    public int Calories(){
        return DRINK.Calories() + 20;
    }

}