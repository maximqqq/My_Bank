public class Debet extends Account {

    public Debet(int numberAccount, double sumMoneys)
    {
        this.numberAccount = numberAccount;
        this.sumMoneys = sumMoneys;
    }


    @Override
    public double add(double sum) {
        sumMoneys += sum;
        return sumMoneys;

    }

    @Override
    public double reduce(double sum) {
        sumMoneys -= sum;
        return sumMoneys;
    }

    @Override
    public double transfer(Account othernumberAccount ,double sum) {
        sumMoneys -= sum;//аналогично reduse(sum);
        othernumberAccount.add(sum);
        return sumMoneys;
    }

    @Override
    public  String toString()
    {
        return  String.format("\nДебетовый счет "+super.toString());
    }
}
