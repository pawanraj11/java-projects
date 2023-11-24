package polymorphism;

class Test {

    public int max(int a, int b) {
        return a > b ? a : b;
    }

    public int max(int a, int b, int c) {
        if (a > b && a > c)
            return a;
        else if (b > c)
            return b;
        return c;

    }
}

class Polymorphism {
    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t.max(10, 5));
        System.out.println(t.max(10, 14, 5));

    }

}
