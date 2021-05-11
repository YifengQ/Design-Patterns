public class NJSlotMachineStraight extends SlotMachine {

    NJSlotMachineStraight() {
    	state = "New Jersey";
    	type = "Straight";
        cabinet = new SmallCabinet();
        display = new LCDDisplay();
        payment = new CoinPayment();
        gpu = new ARM();
        os = new WindowsME();
    }
}