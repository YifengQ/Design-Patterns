public class NewJerseySlotFactory extends SlotFactory {

    protected SlotMachine makeObj(String type) {
        SlotMachine slotMachine = null;

        if (type == "Straight") {
            slotMachine = new NewJerseyStraight();
        }
        else if (type == "Bonus"){
            slotMachine = new NewJerseyBonus();
        }
        else if (type == "Progressive"){
            slotMachine = new NewJerseyProgressive();
        }

        return slotMachine;
    }

}
