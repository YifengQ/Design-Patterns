import java.util.ArrayList;

public class BabyData implements Baby{
    private ArrayList<Parents> parents; 
    Boolean crying;
    int level;


    public BabyData(){
        parents = new ArrayList<Parents>();
    }
    public void add_Parents(Parents O){
        parents.add(O);
    }
    public void remove_Parents(Parents O){
        int i = parents.indexOf(O);
        if (i >= 0){
            parents.remove(i);
        }
    }
    public void notify_Parents(){
        for (Parents parent : parents ){
            parent.update(level, crying);
        }
    }
    public void DataChangeed(){
        notify_Parents();
    }
    public void SetData(int level, Boolean crying){
        this.level = level;
        this.crying = crying;
        DataChangeed();
    }


}