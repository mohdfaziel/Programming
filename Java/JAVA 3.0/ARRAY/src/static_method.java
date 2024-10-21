public class static_method {
    int a = 23;
    int x(int a)
    {
        return a;
    }

    public static void main(String[] args) {
        static_method obj = new static_method();
        System.out.println(obj.a);
        int value = obj.x(obj.a);
    }
}
