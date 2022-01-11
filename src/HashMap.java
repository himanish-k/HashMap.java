public class HashMap {

    private static final int CAPACITY = 10;
    private Node[] map;

    public HashMap() {
        map = new Node[CAPACITY];
    }

    public String get(int key) {
        int i = hash(key);

        Node slotHead = map[i];
        while (slotHead != null) {
            if (slotHead.getKey() == key)
                return slotHead.getValue();

            slotHead = slotHead.getNext();
        }

        return null;
    }

    public void put(int key, String value) {
        int i = hash(key);

        if (map[i] == null) {
            map[i] = new Node(key, value);
        } else {
            Node slotHead = map[i];
            Node prevHead = null;

            while(slotHead != null) {
                if (slotHead.getKey() == key) {
                    slotHead.setValue(value);
                    return;
                }
                prevHead = slotHead;
                slotHead = slotHead.getNext();
            }

            Node newNode = new Node(key, value);
            prevHead.setNext(newNode);
        }
    }

    // Returned value must be less than size of array.
    private int hash(int key) {
        return key % 10;
    }

    class Node {
        private int key;
        private String value;
        Node next, prev;

        public Node(int key, String value) {
            this.key = key;
            this.value = value;
        }

        public int getKey() {
            return this.key;
        }

        public String getValue() {
            return this.value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public Node getNext() {
            return this.next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
