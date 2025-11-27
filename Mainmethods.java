class Method {
    void show1() {
        System.out.println("no paran ,Noreturn");
    }

    void show2(int x, int y) {
        System.out.println("parametric");
    }

    int show3(int x, int y) {
        System.out.println("returning & parametric");
        return (x + y);
    }

    String[] show4(String[] s) {
        java.util.Arrays.sort(s);
        System.out.println("workinng");
        return (s);
    }

    void show5(Abc ab) {
        System.out.println("object passing");
    }

    Abc show6() {
        Abc ab = new Abc(0, 0  );
        System.out.println("work"   +   " kj");
        return (ab);
    }
}

public class Mainmethods {

    public static void main(String[] str) {
        Method m = new Method();
        m.show1();
        m.show2(10, 20);
        m.show3(2, 3);
        Abc ab = new Abc(10 ,20);
        m.show6();

        

        m.show5(m.show6());
        Abc ab1 = m.show6();
        m.show4(str);
    }
}