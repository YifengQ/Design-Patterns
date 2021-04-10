public class BallsSilver extends decoration {

    public BallsSilver(Tree tree){
        this.tree = tree;
    }

    public String getName(){
        return tree.getName() + ", Balls Silver";
    }

    public int Cost(){
        return tree.Cost() + 3;
    }
}
