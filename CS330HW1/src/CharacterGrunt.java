public class CharacterGrunt extends GameCharacter {

    public CharacterGrunt(){
        //Sets the default behaviors
        ordersBehavior = new Flee();
        weaponsBehavior = new Axe();
    }

    public void pickup_newweapon() {
        this.setWeapon(new Pistol());
    }
}
