public class NJSlotMachineProgressive extends SlotMachine {

    NJSlotMachineProgressive() {
    	state = "New Jersey";
    	type = "Progressive";
        cabinet = new SmallCabinet();
        display = new CRTDisplay();
        payment = new BillsPayment();
        gpu = new X86();
        os = new WindowsXP();
    }
}

