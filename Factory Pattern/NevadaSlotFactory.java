public class NevadaSlotFactory extends SlotFactory {
    protected SlotMachine makeObj(String type){
        if (type.equals("Straight")){
            return new NevadaStraight();
        }
        else if (type.equals("Bonus")){
            return new NevadaBonus();
        }
        else if (type.equals("Progressive")){
            return new NevadaProgressive();
        }else return null;

    }

}
