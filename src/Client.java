
class Сlient {

    private String name;
    private String surname;
    private int passport_ID;

    public Сlient(String name, String surname, int passport_ID)
    {

        if(name == "" || name == " " || name == null || surname == ""  || surname == " " || surname == null ||  passport_ID == 0)
        {
            throw new IllegalStateException("!!! Все поля должны быть заполнены !!!");
        }else {


            this.name = name;
            this.surname = surname;
            this.passport_ID = passport_ID;
        }

    }

/*
// get

    public String getName()
    {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public int getPassport_ID() {
        return passport_ID;
    }

//  set

    public void steNeme( String name ) { this.name = name; }
    public void setSurname (String surname) {this.surname=surname;}
    public void setPassport_ID (int passport_ID) {this.passport_ID = passport_ID;}
*/
    @Override
    public String toString()
    {
        return "\nИмя: "+name+"\nФамилия: "+surname+"\n№ Паспорта: "+passport_ID;
    }
}
