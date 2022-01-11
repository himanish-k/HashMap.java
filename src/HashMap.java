public class HashMap {

    private static final int CAPACITY = 10;
    private String[] map;

    public HashMap() {
        map = new String[CAPACITY];
    }

    public String get(int key) {
        return map[hash(key)];
    }

    public void put(int key, String value) {
        map[hash(key)] = value;
    }

    // Returned value must be less than size of array.
    private int hash(int key) {
        return key % 10;
    }
}
