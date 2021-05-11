public class AdvancedDisplay implements Parents, Display{
    private Boolean crying;
    private int level;
    private Baby cryingData;
    private Baby cryingData2;


    public AdvancedDisplay(Baby cryingData){
        this.cryingData = cryingData;
        cryingData.add_Parents(this);
    }
    public AdvancedDisplay(Baby cryingData, Baby cryingData2){
        this.cryingData = cryingData;
        this.cryingData2 = cryingData2;
        cryingData2.add_Parents(this);
        cryingData.add_Parents(this);
    }

    public void update(int level, Boolean crying)
    {
        this.crying = crying;
        this.level = level;
        display();
    }

    public void display(){

        if(crying)
        {
            System.out.println("Baby is Crying at level 0f " + level);
        }
        else if (crying == false )
        {
            System.out.println("Baby is not crying so there is no level");
        }
    }
}