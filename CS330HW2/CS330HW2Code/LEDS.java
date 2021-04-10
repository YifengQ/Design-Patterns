public class LEDS extends decoration {

    public LEDS(Tree tree){
        this.tree = tree;
    }

    public String getName(){
        return tree.getName() + ", L.E.D's";
    }

    public int Cost(){
        return tree.Cost() + 10;
    }
}

