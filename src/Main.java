//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int x,z,y;
        x = 0;
        y = 1;

        for (int i = 0; i<1000; i++) {
            z = x+y;
            x=y;
            y =z;
            System.out.println(x);
        }

    }
}