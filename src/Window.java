import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
/**
 * Created by smeleyka on 03.05.17.
 */
public class Window extends JFrame{

    public Window()  {

        setTitle("Transparent Panel");
        setBounds(800,300,350,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(new JLabel(new ImageIcon("src/back.jpg")));
        setLayout(new BorderLayout());

        JPanel p1=new JPanel(new BorderLayout());
        JPanel p2=new JPanel(new BorderLayout());

        p1.setBackground(new Color(0,0,0,100));
        p1.setBorder(BorderFactory.createEmptyBorder(15, 15, 0, 15));
        p2.setBackground(new Color(0,0,0,50));
        p2.setPreferredSize(new Dimension(0,80));
        p2.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        add(p1,BorderLayout.CENTER);
        add(p2,BorderLayout.SOUTH);

        JTextArea jTextOut = new JTextArea();
        JTextField jTextIn = new JTextField();

        jTextOut.setBackground(new Color(255,255,255,50));

        Icon send = new ImageIcon("src/send35.png");
        JButton jbSend = new JButton(send);

        p1.add(jTextOut,BorderLayout.CENTER);
        p2.add(jTextIn,BorderLayout.CENTER);
        p2.add(jbSend,BorderLayout.EAST);

        Action actionSend = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextOut.append(jTextIn.getText()+"\n");
                jTextIn.setText("");
                jTextIn.requestFocus();
                jTextOut.setBackground(new Color(255,255,255,255));

            }
        };

        jbSend.addActionListener(actionSend);
        jTextIn.addActionListener(actionSend);

        setVisible(true);
    }
}
