public class Main {
    public static void main(String[] args)
    {
        Database dbType = new MySql();
        Person person = new Person();
        person.setName("Artur");
        ServicePerson servicePerson = new ServicePerson(dbType);
        servicePerson.savePerson(person);
    }
}
