import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

/**
 * Created by smeleyka on 03.05.17.
 */
public class Window extends JFrame{
    public Window()  {
        setTitle("Просто окно");
        setBounds(800,300,350,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        JPanel jpTop = new JPanel(new BorderLayout());
        JPanel jpBottom = new JPanel(new GridLayout(0,2));
        add(jpTop, BorderLayout.CENTER);
        add(jpBottom,BorderLayout.SOUTH);

        JTextArea jTextOut = new JTextArea();
        JTextArea jTextIn = new JTextArea();
        JButton jbSend = new JButton("Отправить");
        jTextOut.setEditable(false);
        JScrollPane jScroll = new JScrollPane(jTextOut);
        jpTop.add(jScroll,BorderLayout.CENTER);

        jpBottom.add(jTextIn);
        jpBottom.add(jbSend);










        setVisible(true);
    }
}
