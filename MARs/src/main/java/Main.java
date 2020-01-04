import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("NFS ERON DON DON");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1023, 682);
        //добавили дорогу.
        frame.add(new Road());
        //Подключили управление на фрейм.
        frame.addKeyListener(new InputHandler());
        frame.setVisible(true);
    }
}
