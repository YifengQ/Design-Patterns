public class Ruffles extends decoration {

    public Ruffles(Tree tree){
        this.tree = tree;
    }

    public String getName(){
        return tree.getName() + ", Ruffles";
    }

    public int Cost(){
        return tree.Cost() + 1;
    }
}
