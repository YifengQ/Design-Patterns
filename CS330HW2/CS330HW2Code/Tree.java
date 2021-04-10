public abstract class Tree {

    String name;
    int Cost;

    public Tree(){
        name = "Unknown";
        Cost = 0;
    }


    public String getName(){
        return name;
    }

    public abstract int Cost();

}
