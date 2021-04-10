public class Ribbons extends decoration {

    public Ribbons(Tree tree){
        this.tree = tree;
    }

    public String getName(){
        return tree.getName() + ", ribbons";
    }

    public int Cost(){
        return tree.Cost() + 2;
    }
}
