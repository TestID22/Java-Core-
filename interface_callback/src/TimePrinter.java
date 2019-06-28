import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class TimePrinter implements ActionListener {
    public void actionPerformed(ActionEvent event){
        Date now = new Date();
        System.out.println("Звонок " + now);
        Toolkit.getDefaultToolkit().beep();
    }



}
