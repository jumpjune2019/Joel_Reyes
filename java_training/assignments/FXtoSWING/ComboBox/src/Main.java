import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Main extends JFrame implements ItemListener {

    // frame
    static JFrame f;

    // label
    static JLabel l, l1;

    // combobox
    static JComboBox c1;
    // main class
    public static void main(String[] args)
    {
        // create a new frame
        f = new JFrame("ComboBox Demo");

        // create a object
        Main s = new Main();

        // set layout of frame
        f.setLayout(new FlowLayout());

        // array of string contating cities
        String s1[] = { " ","Train","Car","Air Plane" };

        // create checkbox
        c1 = new JComboBox(s1);

        // add ItemListener
        c1.addItemListener(s);

        // create labels
        l = new JLabel("Select Transport Type ");
        l1 = new JLabel("");

        // set color of text
        l.setForeground(Color.red);
        l1.setForeground(Color.blue);

        // create a new panel
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(3,1));
        p.add(l);

        // add combobox to panel
        p.add(c1);

        p.add(l1);

        // add panel to frame
        f.add(p);

        // set the size of frame
        f.setSize(400, 300);

        f.show();
    }
    public void itemStateChanged(ItemEvent e)
    {
        // if the state combobox is changed
        if (e.getSource() == c1) {

            l1.setText(" Selected: "+c1.getSelectedItem()  );
        }
    }
}
