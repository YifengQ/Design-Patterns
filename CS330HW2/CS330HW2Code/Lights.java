public class Lights extends decoration {

    public Lights(Tree tree){
        this.tree = tree;
    }

    public String getName(){
        return tree.getName() + ", Balls Silver";
    }

    public int Cost(){
        return tree.Cost() + 5;
    }
}
