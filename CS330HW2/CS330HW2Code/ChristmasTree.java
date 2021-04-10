public class ChristmasTree {

    public static void main(String[] args){

        Tree mytree = new BlueSpruce();
        mytree = new Star(mytree);
        mytree = new Ruffles(mytree);
        mytree = new Star(mytree);
        mytree = new Ruffles(mytree);
        mytree = new Star(mytree);

        System.out.println(mytree.getName() + " Cost: " + mytree.Cost());
    }

}
