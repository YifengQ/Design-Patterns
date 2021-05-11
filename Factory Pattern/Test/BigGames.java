public abstract class BigGames{
    public Order order (String type){
        Order order;
        order = createOrder(type);
        //other function order.prepare(); blah blah 
        return order;
    }
    protected abstract Order createOrder(String type);
    //other methods here
}