public class GameDriver {

    public static void main(String[] args) {

        //Creates the Game Characters and set the default order and weapon
        GameCharacter characterTank = new CharacterTank();
        GameCharacter characterGrunt = new CharacterGrunt();

        System.out.println("Default Tank");
        characterTank.displayOrder();
        characterTank.displayWeapon();
        System.out.println("\nDefault Grunt");
        characterGrunt.displayOrder();
        characterGrunt.displayWeapon();


        System.out.println("\nNew Tank");
        characterTank.setOrder(new SelfDestruct());
        //characterTank.setWeapon(new Rocket());
        characterTank.pickup_newweapon();
        characterTank.displayOrder();
        characterTank.displayWeapon();

        System.out.println("\nNew Grunt");
        characterGrunt.setOrder(new Attack());
        //characterGrunt.setWeapon(new Pistol());
        characterGrunt.pickup_newweapon();
        characterGrunt.displayOrder();
        characterGrunt.displayWeapon();
    }
}
