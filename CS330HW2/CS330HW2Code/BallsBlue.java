public class BallsBlue extends decoration {

    public BallsBlue(Tree tree){
        this.tree = tree;
    }

    public String getName(){
        return tree.getName() + ", Balls Blue";
    }

    public int Cost(){
        return tree.Cost() + 2;
    }
}
