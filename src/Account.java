public abstract class Account {

    protected  int numberAccount;
    protected  double sumMoneys;

    public  abstract  double add(double sumMoneys);
    public  abstract  double reduce(double sumMoneys);
    public  abstract  double transfer(Account othernumberAccount ,double sumMoneys);

    @Override
    public  String toString()
    {
        return String.format("\nНомер счета: "+numberAccount+"\nСумма на счету: "+sumMoneys);
    }






}
