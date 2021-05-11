public class drinkMixer {
    public static void main(String[] args){
        //first DRINK   vodka Gimlet   
        drink vodkaGimlet = new vodka();
        vodkaGimlet = new lime(vodkaGimlet);
        vodkaGimlet = new lime(vodkaGimlet);
        System.out.println(vodkaGimlet.getName() + " Number of Calories: " + vodkaGimlet.Calories());     
    }
}