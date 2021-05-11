public abstract class SlotMachine {

    String Cabinet;
    String Payment;
    String Display;
    String GPU;
    String OS;

    public void prepare() {
        System.out.println("fetching components: " + this.Cabinet + " Cabinet, " + this.Payment + " validator, " + this.Display + ", " + this.GPU);
        System.out.println("assembling components");
        System.out.println("testing hardware");
        System.out.println("uploading software: " + this.OS);
        System.out.println("testing software");
        System.out.println("packaging parts so the UPS guys can drop it");
    }
}
