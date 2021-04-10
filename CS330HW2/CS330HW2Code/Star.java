public class Star extends decoration {

    private static int count = 0;

    public Star(Tree tree){

        if(count == 0){
            this.tree = tree;
            count++;
        }
        else{
            this.tree = tree;
        }

    }

    public String getName(){

        if(count <= 1) {
            count++;
            return tree.getName() + ", a Star";
        }
        else
            return tree.getName();
    }

    public int Cost(){
        if(count <= 2) {
            count++;
            return tree.Cost() + 4;
        }
        else
            return tree.Cost();

    }
}
