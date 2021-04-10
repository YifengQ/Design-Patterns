public class NVSlotMachineStraight extends SlotMachine {

    NVSlotMachineStraight() {
    	state = "Nevada";
    	type = "Straight";
        cabinet = new LargeCabinet();
        display = new ReelsDisplay();
        payment = new TicketInTicketOut();
        gpu = new ARM();
        os = new Linux();
    }
}
