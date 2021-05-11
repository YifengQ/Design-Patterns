public class mainDriver{
    public static void main (String[] args){
        BabyData baby = new BabyData();
        BabyData baby2 = new BabyData();
        //Simple display first 
        SimpleDisplay simpledisply = new SimpleDisplay(baby);
        AdvancedDisplay advanceddisplay = new AdvancedDisplay(baby);
       
        
        baby.SetData(0, false);
        baby.SetData(2, true);

        AdvancedDisplay advanceddisplay2 = new AdvancedDisplay(baby, baby2);
        
        baby2.SetData(1, true);
        
    }
}