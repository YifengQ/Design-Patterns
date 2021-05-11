public class GuitarHero {
    public static void main(String[] args) {
        characters player1 = new Slash();
        characters player2 = new Jimi();
        player1.playGuitar();
        player2.playGuitar();
        player1.playSolo();
        player2.playSolo();
        Guitar fender = new Fender();
        player1.changeGuitar(fender);
        player1.playGuitar();
    }
}