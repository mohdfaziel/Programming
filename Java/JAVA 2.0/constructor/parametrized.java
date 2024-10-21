package constructor;

class algebra{
    int a;
    int b;
    algebra(int x, int y)
    {
        System.out.println("Calling constructor at parameters "+x+","+y);
        a = x;
        b = y;
    }
    int add()
    {
        return a + b;
    }
    int mul()
    {
        return a*b;
    }
}
public class parametrized {
    public static void main(String[] args) {
    // calling constructor at 4,4 parameters:
        algebra obj1 = new algebra(4, 4);
        System.out.println(obj1.add());
        System.out.println(obj1.mul());

    // calling constructor at 3,9 parameters:
        algebra obj2 = new algebra(3, 9);
        System.out.println(obj2.add());
        System.out.println(obj2.mul());

    }
}
