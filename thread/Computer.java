package thread;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class Computer extends JFrame implements DocumentListener {
    JTextArea text1, text2;
    int count = 0;
    double sum = 0, aver = 0;

    Computer() {
        setLayout(new FlowLayout());
        text1 = new JTextArea(6, 20);
        text2 = new JTextArea(6, 20);
        add(new JScrollPane(text1));// 滚动窗格
        add(new JScrollPane(text2));
        text2.setEditable(false);// 不可编辑
        (text1.getDocument()).addDocumentListener(this);// 文本区调用getDocument方法放回所维护的文档，能触发DocumentEvent事件
        setSize(300, 320);
        setVisible(true);
        validate();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }

    @Override
    public void insertUpdate(DocumentEvent e) {
        changedUpdate(e);

    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        changedUpdate(e);

    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        String s = text1.getText();
        String[] a = s.split("[^0123456789.]+");// 正则表达式，除了0-9和小数点以外的字符作为分隔符
        sum = 0;
        aver = 0;
        count = 0;
        for (int i = 0; i < a.length; i++) {
            try {
                sum = sum + Double.parseDouble(a[i]);// 转换为double类型
                count++;
            } catch (Exception ee) {

            }
        }
        aver = sum / count;
        text2.setText(null);
        text2.append("\n和:" + sum);
        text2.append("\n平均值：" + aver);
    }

}
