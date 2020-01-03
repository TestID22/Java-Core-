import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("NFS ERON DON DON");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1023, 682);
        frame.add(new Road());

        frame.setVisible(true);
    }
}
