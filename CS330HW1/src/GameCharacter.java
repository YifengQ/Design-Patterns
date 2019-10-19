public abstract class GameCharacter {

    OrdersBehavior ordersBehavior;
    WeaponsBehavior weaponsBehavior;

    public GameCharacter(){
    }

    public void displayOrder(){
        ordersBehavior.displayOrder();
    }

    public void displayWeapon(){
        weaponsBehavior.displayWeapon();
    }

    public void setOrder(OrdersBehavior order){
        ordersBehavior = order;
    }

    public void setWeapon(WeaponsBehavior weapon){
        weaponsBehavior = weapon;
    }

    public void pickup_newweapon() {
    }

}
