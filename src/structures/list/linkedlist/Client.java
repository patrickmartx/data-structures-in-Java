package structures.list.linkedlist;

public class Client {
    private String cpf;
    private String name;
    private int age;

    public Client(String cpf, String name, int age) {
        this.cpf = cpf;
        this.name = name;
        this.age = age;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        String text = "Name: " + this.name
                + "\nCPF: " + this.cpf
                + "\nAge: " +  String.valueOf(this.age);
        return text;
    }
}
