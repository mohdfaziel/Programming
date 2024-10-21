public class practice {
    int a;
    int b;

    practice(int x, int y) {
        a = x;
        b = y;
    }

    void add() {
        System.out.println(a + b);
    }
    public static void main(String[] args) {
        practice obj = new practice(4,8);
        int a = 12;
        int [] arr = new int[a];
        obj.add();

    }

}
