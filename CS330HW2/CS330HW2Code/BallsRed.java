public class BallsRed extends decoration {

    public BallsRed(Tree tree){
        this.tree = tree;
    }

    public String getName(){
        return tree.getName() + ", Balls Red";
    }

    public int Cost(){
        return tree.Cost() + 1;
    }
}
