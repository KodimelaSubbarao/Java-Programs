public class AddAmount {
    int amount=500;
    AddAmount()
    {
        System.out.println("initial amount is : "+amount);
    }
    AddAmount(int amount1)
    {
        System.out.println("Adding amount is : "+amount1);
        amount +=amount1;
    }
    public static void main(String[] args)
    {
        new AddAmount();
        AddAmount obj=new AddAmount(500);
        System.out.println("Total available Amount is : "+obj.amount);
    }
}
