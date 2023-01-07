public class Customer2 {
    private int id;
    private String name;
    private char gender;

    public Customer2(int id, String name, int discount) {
        this.id = id;
        this.name = name;
    }

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public String toString() {
        return name + "(" + id + ")";
    }
}
