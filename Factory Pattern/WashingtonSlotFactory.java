public class WashingtonSlotFactory extends SlotFactory{

    protected SlotMachine makeObj(String type) {
        SlotMachine slotMachine = null;

        if (type == "Straight") {
            slotMachine = new WashingtonStraight();
        }
        else if (type == "Bonus"){
            slotMachine = new WashingtonBonus();
        }
        else if (type == "Progressive"){
            slotMachine = new WashingtonProgressive();
        }

        return slotMachine;
    }

}
