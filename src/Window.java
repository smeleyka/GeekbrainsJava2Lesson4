import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        JPanel jpBottom = new JPanel(new FlowLayout());

        add(jpTop, BorderLayout.CENTER);
        add(jpBottom,BorderLayout.SOUTH);

        JTextArea jTextOut = new JTextArea();
        JTextField jTextIn = new JTextField();
        JButton jbSend = new JButton("Отправить");

        jTextOut.setEditable(false);
        jTextIn.setPreferredSize(new Dimension(150,25));
        jbSend.setPreferredSize(new Dimension(100,25));
        JScrollPane jScroll = new JScrollPane(jTextOut);

        jpTop.add(jScroll,BorderLayout.CENTER);
        jpTop.setBackground(Color.RED);
        jpTop.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jpBottom.setBackground(Color.GREEN);
        jpBottom.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jpBottom.add(jTextIn);
        jpBottom.add(jbSend);

        Action actionSend = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextOut.append(jTextIn.getText()+"\n");
                jTextIn.setText("");
                jTextIn.requestFocus();
            }
        };


        jbSend.addActionListener(actionSend);
        jTextIn.addActionListener(actionSend);










        setVisible(true);
    }
}
