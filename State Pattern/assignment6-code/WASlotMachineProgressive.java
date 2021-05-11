public class WASlotMachineProgressive extends SlotMachine {

    WASlotMachineProgressive() {
    	state = "Washington";
    	type = "Progressive";
        cabinet = new LargeCabinet();
        display = new ReelsDisplay();
        payment = new CoinPayment();
        gpu = new ARM();
        os = new Android();
    }
}
