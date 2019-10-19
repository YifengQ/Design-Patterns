public class CharacterTank extends GameCharacter {

    public CharacterTank(){
        //Sets the default behaviors
        ordersBehavior = new Attack();
        weaponsBehavior = new Canon();
    }

    public void pickup_newweapon(){
        this.setWeapon(new Rocket());
    }
}
