package mainmain;

import javax.swing.*;
import java.awt.*;

/**
 * Created by yashpatel on 1/26/2017.
 */
public class MyFrame extends JFrame {
    public void init(){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                setSize(new Dimension(300,200));
                setVisible(true);
            }
        });
    }
}
