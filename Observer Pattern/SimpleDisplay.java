public class SimpleDisplay implements Parents, Display{
    private int level;
    private Boolean crying;
    private Baby cryingData;

    public SimpleDisplay(Baby cryingData){
        this.cryingData = cryingData;
        cryingData.add_Parents(this);
    }

    public void update(int level,Boolean crying)
    {
        this.level = 0;
        this.crying = crying;
        display();
    }

    public void display(){

        if(crying)
        {
            System.out.println("Baby is Crying");
        }
        else if (crying == false )
        {
            System.out.println("Baby is not crying");
        }
    }
}