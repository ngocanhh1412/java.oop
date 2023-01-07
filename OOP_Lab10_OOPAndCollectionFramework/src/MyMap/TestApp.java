package MyMap;

public class TestApp {
    public static void main(String[] args) {
        MyMap m = new MyHashMap();
        m.put(16, "Nicola");
        m.put(13, "Nick");
        m.put(44, "Marzia");
        m.put(22, "Agata");
        m.remove(14);
        System.out.println(m.contains(32));
        System.out.println(m.contains(22));
        System.out.println(m.size());
        System.out.println(m);
    }
}
