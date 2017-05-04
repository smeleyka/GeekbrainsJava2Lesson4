import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
/**
 * Created by smeleyka on 03.05.17.
 */
public class Window extends JFrame{
//    JPanel jpTop;
//    JPanel jpBottom;

    public Window()  {

//        jpTop = new JPanel(new BorderLayout());
//        jpBottom = new JPanel(new BorderLayout());
//        setTitle("Просто окно");
//        setBounds(800,300,350,500);
//        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        setLayout(new FlowLayout());
//        //setBackground(Color.PINK);
//        setContentPane(new JLabel(new ImageIcon("src/back.jpg")));
//
//
//
//
//        jpTop.setPreferredSize(new Dimension(150,100));
//        jpBottom.setPreferredSize(new Dimension(150,100));
//        Icon send = new ImageIcon("src/send35.png");
//
//
//        add(jpTop);
//        add(jpBottom);

//        JTextArea jTextOut = new JTextArea();
//        JTextField jTextIn = new JTextField();
//        JButton jbSend = new JButton(send);
//
//        jTextOut.setEditable(false);
//        //jTextIn.setPreferredSize(new Dimension(150,0));
//        //jbSend.setPreferredSize(new Dimension(0,0));
//        JScrollPane jScroll = new JScrollPane(jTextOut);
//
//        jpTop.add(jScroll,BorderLayout.CENTER);
//        jpTop.setOpaque(true);
//        jpTop.setBackground(new Color(0,0,0,200));
//        jpTop.setBorder(BorderFactory.createEmptyBorder(5, 5, 0, 5));
//        //jpBottom.setBackground(Color.GREEN);
//        jpBottom.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
//        jpBottom.add(jTextIn, BorderLayout.CENTER);
//        jpBottom.add(jbSend, BorderLayout.EAST);
//
//        Action actionSend = new AbstractAction() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                jTextOut.append(jTextIn.getText()+"\n");
//                jTextIn.setText("");
//                jTextIn.requestFocus();
//            }
//        };
//
//
//        jbSend.addActionListener(actionSend);
//        jTextIn.addActionListener(actionSend);
//
//
//
//
//

        setTitle("Transparent Panel");
        setBounds(800,300,350,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Set a background for JFrame
        setContentPane(new JLabel(new ImageIcon("src/back.jpg")));

        // Set some layout, say FlowLayout
        setLayout(new BorderLayout());


        // Create a JPanel
        JPanel p1=new JPanel(new BorderLayout());

        // Set the background, black with 125 as alpha value
        // This is less transparent
        p1.setBackground(new Color(0,0,0,100));

        // Create another JPanel
        JPanel p2=new JPanel(new BorderLayout());

        // This is more transparent than the previous
        // one
        p2.setBackground(new Color(0,0,0,50));

        // Set some size to the panels
        //p1.setPreferredSize(new Dimension(0,150));
        p2.setPreferredSize(new Dimension(0,80));
        p1.setBorder(BorderFactory.createEmptyBorder(15, 15, 0, 15));
        p2.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
//        //jpBottom.setBackground(Color.GREEN);
//        jpBottom.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        // Add the panels to the JFrame
        add(p1,BorderLayout.CENTER);
        add(p2,BorderLayout.SOUTH);

        JTextArea jTextOut = new JTextArea();
        JTextField jTextIn = new JTextField();

        jTextOut.setBackground(new Color(0,0,0,50));

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
//
//
        jbSend.addActionListener(actionSend);
        jTextIn.addActionListener(actionSend);




        //setSize(600,400);
        setVisible(true);
    }
}
