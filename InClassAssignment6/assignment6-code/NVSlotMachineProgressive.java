public class NVSlotMachineProgressive extends SlotMachine {

    NVSlotMachineProgressive() {
    	state = "Nevada";
    	type = "Progressive";
        cabinet = new SmallCabinet();
        display = new CRTDisplay();
        payment = new TicketInTicketOut();
        gpu = new X86();
        os = new Linux();
    }
}
