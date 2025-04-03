package B1;

public class Account {

    private static Account instance;
    private int id;
    private String name;
    private int age;

    public Account(int age, int id, String name) {
        this.age = age;
        this.id = id;
        this.name = name;
    }

    public Account() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    static public Account getInstance(){
       if(instance==null) {
           instance = new Account();
       }
        return instance;
    }
}
