public class WASlotMachineStraight extends SlotMachine {

    WASlotMachineStraight() {
    	state = "Washington";
    	type = "Straight";
        cabinet = new LargeCabinet();
        display = new ReelsDisplay();
        payment = new BillsPayment();
        gpu = new ARM();
        os = new Linux();
    }
}