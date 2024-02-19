package Øvelse;

public class Pen {
    private boolean clicked;

    Pen() {
        clicked =false;
    }

    public void clickPen() {
        clicked = true;
    }

    public void clickBack() {
        clicked = false;
    }

    public boolean isClicked() {
        return clicked;
    }

    public static void main(String[] args) {
        Pen pen = new Pen();

        pen.clickPen();
        System.out.println(pen.isClicked());

        pen.clickBack();
        System.out.println(pen.isClicked());
    }
}
