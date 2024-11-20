interface X {
    void message();
}

interface Y extends X {
    void display();
}

public class Test {
    public static void main(String arg[]) {
        X ref = () -> {
            System.out.println("Interface X");
        };
        Y ref2 = () -> {
            System.out.println("Interface Y");
        };
        ref.message();
        ref2.display();
    }
}