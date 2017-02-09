package mainmain;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * Created by yashpatel on 1/26/2017.
 */
public class MyButton extends JButton {
    private ActionListener actionListener;

    public void setActionListener(ActionListener a){
        actionListener = a;
    }

    public void init(){
        this.addActionListener(actionListener);
    }
}
