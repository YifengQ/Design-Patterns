public class NVSlotMachineBonus extends SlotMachine {

    NVSlotMachineBonus() {
    	state = "Nevada";
    	type = "Bonus";
        cabinet = new SmallCabinet();
        display = new CRTDisplay();
        payment = new TicketInTicketOut();
        gpu = new X86();
        os = new Linux();
    }
}
