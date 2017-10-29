public class Procent extends Account{

    private double monthProcent;

    public Procent(int numberAccount, double sumMoneys,double monthProcent)
    {
        this.numberAccount = numberAccount;
        this.sumMoneys = sumMoneys;
        this.monthProcent=monthProcent;
    }

    public void capital(double monthProcent)
    {
        sumMoneys *=(1+monthProcent/100);
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
        return  String.format("\nПроцентный счет "+super.toString()+"\nЕжемесячный процент: "+monthProcent+" %%" );
    }

}
