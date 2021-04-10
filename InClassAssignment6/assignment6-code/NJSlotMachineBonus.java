public class NJSlotMachineBonus extends SlotMachine {

    NJSlotMachineBonus() {
    	state = "New Jersey";
    	type = "Bonus";
        cabinet = new LargeCabinet();
        display = new ReelsDisplay();
        payment = new CoinPayment();
        gpu = new ARM();
        os = new WindowsME();
    }
}
