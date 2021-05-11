public abstract class SlotMachine {

	protected String state;
	protected String type;
    protected Cabinet cabinet;
    protected Payment payment;
    protected Display display;
    protected GPU gpu;
    protected OS os;

    public void printInfo() {
    	System.out.println("Making a "+state+" style "+type+" Slot Machine");
        System.out.println("Fetching components: "+cabinet.toString()+", "+payment.toString()+" validator, "+display.toString()+", "+gpu.toString());
        System.out.println("Assembling components\nTesting hardware");
        System.out.println("Uploading software: "+os.toString()+"\nTesting software");
        System.out.println(state+" style "+type+" Slot Machine processed for shipping!");
    }
}
