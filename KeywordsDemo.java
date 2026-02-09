public class KeywordsDemo {

    static int staticValue = 10;       // shared
    final int finalValue = 5;          // cannot change
    int normalValue = 3;

    public static void main(String[] args) {
        KeywordsDemo obj = new KeywordsDemo();
        System.out.println(obj.normalValue);
    }

    static {
        System.out.println("Static block executed");
    }
}
