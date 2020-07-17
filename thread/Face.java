package thread;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Face extends JFrame implements ActionListener {
    JButton jia;
    JButton jian;
    JButton cheng;
    JButton chu;
    JTextField one;
    JTextField two;
    JTextField three;
    JLabel label;

    public Face() {
        init();
        setVisible(true);
        setResizable(true);
        validate();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public void init() {
        setLayout(new FlowLayout());
        setSize(300, 320);
        setTitle("¼ÆËã");
        jia = new JButton("¼Ó");
        jian = new JButton("¼õ");
        cheng = new JButton("³Ë");
        chu = new JButton("³ý");
        one = new JTextField(10);
        two = new JTextField(10);
        three = new JTextField(10);
        label = new JLabel(" ", JLabel.CENTER);
        label.setBackground(Color.green);
        add(one);
        add(label);
        add(two);
        add(three);
        add(jia);
        add(jian);
        add(cheng);
        add(chu);
        jia.addActionListener(this);
        jian.addActionListener(this);
        cheng.addActionListener(this);
        chu.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double n;
        if (e.getSource() == jia) {
            double n1, n2;
            try {
                n1 = Double.parseDouble(one.getText());
                n2 = Double.parseDouble(two.getText());
                n = n1 + n2;
                three.setText(String.valueOf(n));
                label.setText("+");
            } catch (NumberFormatException ee) {
                three.setText("ÇëÊäÈëÊý×Ö×Ö·û");
            }
        } else if (e.getSource() == jian) {
            double n1, n2;
            try {
                n1 = Double.parseDouble(one.getText());
                n2 = Double.parseDouble(two.getText());
                n = n1 - n2;
                three.setText(String.valueOf(n));
                label.setText("-");
            } catch (NumberFormatException ee) {
                three.setText("ÇëÊäÈëÊý×Ö×Ö·û");
            }
        } else if (e.getSource() == cheng) {
            double n1, n2;
            try {
                n1 = Double.parseDouble(one.getText());
                n2 = Double.parseDouble(two.getText());
                n = n1 * n2;
                three.setText(String.valueOf(n));
                label.setText("*");
            } catch (NumberFormatException ee) {
                three.setText("ÇëÊäÈëÊý×Ö×Ö·û");
            }
        } else if (e.getSource() == chu) {
            double n1, n2;
            try {
                n1 = Double.parseDouble(one.getText());
                n2 = Double.parseDouble(two.getText());
                n = n1 / n2;
                three.setText(String.valueOf(n));
                label.setText("/");
            } catch (NumberFormatException ee) {
                three.setText("ÇëÊäÈëÊý×Ö×Ö·û");
            }
        }
        validate();
    }
}
