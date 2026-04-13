public class ServicePerson {
    private Database dbType;

    public ServicePerson(Database dbType)
    {
        this.dbType = dbType;
    }

    public void savePerson(Person person) {
        dbType.savePerson(person);
    }
}