package Lab_5;

public class p12 {
    public static void main(String[] args) {
        A3 a = new A3(); 
        B3 b = new B3();
        a.hello("A3 Instance");
        b.hello("B3 Instance");
        A3 ref;
        ref = b;
        ref.hello("Dynamic Dispatch");
        b.callHello("Calling from B3");
    }
}

class A3 {
    public void hello(String s) {
        System.out.println("A3: Hello From " + s);
    }
}

class B3 extends A3 {
    @Override
    public void hello(String s) {
        System.out.println("B3: Hello From " + s);
    }

    public void callHello(String s) {
        hello(s);
        super.hello(s);
    }
}