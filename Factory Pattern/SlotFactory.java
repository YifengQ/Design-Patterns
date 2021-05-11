public abstract class SlotFactory {
    public SlotMachine order (String type){
        SlotMachine order;
        order = makeObj(type);
        order.prepare();
        return order;
    }
    protected abstract SlotMachine makeObj(String type);

}
