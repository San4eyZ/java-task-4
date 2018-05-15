package calculator.app;

import view.GUI;

public class Main {
    public static void main(String args[]) {
        GUI app = new GUI<GUI.ButtonActionListener>(1, Main.calculate);
        app.setVisible(true);
    }

    public static String calculate(String[] args) {
        return "Hello";
    }
}
