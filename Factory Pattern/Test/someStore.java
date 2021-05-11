public class someStore extends BigGames{
    protected Order createOrder(String what){
        if (what.equals("subOrder")){
            return new subOrder();
        }else return null;
        // and some other shitty if statements 
    }
}