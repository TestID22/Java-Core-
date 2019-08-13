import javax.swing.*;
import java.awt.*;

public class Eframe extends JFrame {
    //Load picture with Exception
    ImageIcon icon = new ImageIcon("D:\\Code_Code_Code\\Java-Core-\\IOfileTest\\res\\" +
                                        "Checked-and-Unchecked-Exceptions-in-Java.png");;
    Image image = icon.getImage();

    //Load picture with Collections
    ImageIcon iconCollection = new ImageIcon("D:\\Code_Code_Code\\" +
            "Java-Core-\\IOfileTest\\res\\Collection-framework-hierarchy.png");
    Image imageCollection = iconCollection.getImage();

    JPanel panel = new JPanel();
    JMenu menu = new JMenu();

    JButton btnException = new JButton("Exception");
    JButton btnCollection = new JButton("Collections");

    final int LOCALEIMAGEY = 70;
    final int LOCALEIMAGEX = 40;


    public Eframe() throws HeadlessException {
        setTitle("Иерархия Exception в Java");
        setSize(660,400);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBackground(Color.black);

        btnException.addActionListener(e -> getGraphics().
                drawImage(image,LOCALEIMAGEX,LOCALEIMAGEY,this));

        btnCollection.addActionListener(e ->
                {getGraphics().
                drawImage(imageCollection,LOCALEIMAGEX - 25,LOCALEIMAGEY , 660, 400,this);
                setSize(700,600);
                setBackground(Color.black);

                });

        //add buttons to panel and add it at frame
        panel.add(btnException);
        panel.add(btnCollection);
        add(panel);

    }


}
