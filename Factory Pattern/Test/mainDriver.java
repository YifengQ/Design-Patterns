public class mainDriver{
    public static void main(String[] args){
        BigGames myFactory = new someStore();
        Order order = myFactory.order("subOrder");
        System.out.println("You just ordered a " + order.getName());
    }
}