public class Main {

    public static void main(String[] args) {
        SlotFactory slotFactory = new NewJerseySlotFactory();
        SlotMachine slotMachine = slotFactory.makeObj("Bonus");
        slotMachine.prepare();
        slotFactory = new NevadaSlotFactory();
        slotMachine = slotFactory.makeObj("Progressive");
        slotMachine.prepare();
    }

}
