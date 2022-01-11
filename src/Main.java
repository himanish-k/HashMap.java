public class Main {

    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put(55, "55");
        System.out.println(map.get(55));
        map.put(55, "55u");
        System.out.println(map.get(55));
        map.put(56, "56");
        System.out.println(map.get(56));
    }
}
