public class WASlotMachineBonus extends SlotMachine {

    WASlotMachineBonus() {
    	state = "Washington";
    	type = "Bonus";
        cabinet = new MediumCabinet();
        display = new VGADisplay();
        payment = new TicketInTicketOut();
        gpu = new ARM();
        os = new Symbian();
    }
}
