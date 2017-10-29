import com.sun.security.ntlm.NTLMException;

import java.util.Scanner;




public class App {
    private  static  String name;
    private  static  String surname;
    private  static  int passport_ID;
    private  static  String temp;

    public static void getClient(Scanner sc)
    {
        System.out.print("Введите имя-> ");
        temp =sc.nextLine();
        name =temp;
        System.out.print("Введите фамилию-> ");
        temp =sc.nextLine();
        surname =temp;
        System.out.print("Введите № паспортва-> ");
        temp =sc.nextLine();
        passport_ID =Integer.parseInt(temp);
    }


    public static void main(String[] args) throws NTLMException {



        Scanner sc = new Scanner(System.in);
        /*getClient(sc);


Сlient a1 = new  Сlient(name,surname,passport_ID);
        System.out.println(a1);*/

    /*Account account1 = new Debet(255,300);
    Account account2= new Debet(98,100);

        System.out.println(account1);
        System.out.println(account2);

        System.out.println("====================");

        account1.add(100);
        account2.reduce(50);
        account1.transfer(account2,50);
        System.out.println(account1);
        System.out.println(account2);*/

        System.out.println("====================");
        Procent account3=new Procent(500,100,200);
        Procent account4=new Procent(200,300,400);
        System.out.println(account3);
        System.out.println(account4);



        System.out.println("====================");

    }

}
