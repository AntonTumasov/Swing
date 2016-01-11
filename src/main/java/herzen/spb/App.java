package herzen.spb;
import javax.swing.*;
import java.awt.*;


public class App extends JFrame
{

    public App() {

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        JButton button_top = new JButton("start");
        panel.add(button_top, BorderLayout.NORTH);
        JPanel panel_center = new JPanel();
        panel.add(panel_center, BorderLayout.CENTER);
        panel_center.setLayout(new GridLayout(3, 3));
        for (int i = 1; i<10; i++){
            JButton btns = new JButton();
            btns.setText(""+ i);
            panel_center.add(btns);
        }
        JLabel label_btm = new JLabel("Status bar");
        panel.add(label_btm, BorderLayout.SOUTH);
        JPanel panel_left = new JPanel();
        panel.add(panel_left, BorderLayout.WEST);
        panel_left.setLayout(new GridLayout(3,1));
        String[] names = {"Top","Center","Bottom"};
        for (String name:names)
        {
            JButton btns = new JButton(name);
            panel_left.add(btns);
        }
        getContentPane().add(panel);


    }

    public static void main( String[] args )
    {
        App ex = new App();
        ex.validate();
        ex.setVisible(true);
    }




}
