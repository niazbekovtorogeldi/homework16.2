public class Main {
    public static void main(String[] args) {
        Backend[] array = {new Java(), new CShard(), new Python()};
        for (Backend a : array) {
            System.out.println(a.getClass());
            if (a instanceof Java) {
                Java java = (Java) a;
                java.spring();
            } else if (a instanceof CShard) {
                CShard cSharp = (CShard) a;
                cSharp.dotNet();
            } else if (a instanceof Python) {
                Python python = (Python) a;
                python.Python();
            }
        }
    }
}