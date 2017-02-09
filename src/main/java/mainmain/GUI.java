package mainmain;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by yashpatel on 1/26/2017.
 */
public class GUI {


    public static  void main(String[] args){
        final AddressBook ab = new AddressBook();
        JFrame frame = new JFrame("addressbook");
        JButton add = new JButton("ADD");
        //JButton remove = new JButton("REMOVE");
        final JTextField name = new JTextField("name");
        final JTextField num = new JTextField("number");
        final JTextField buddies = new JTextField();
        buddies.setEditable(false);
        buddies.setAutoscrolls(true);
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        panel.add(name);
        panel.add(num);
        panel.add(add, add.CENTER_ALIGNMENT);
        panel.add(buddies);
        frame.getContentPane().add(panel);
        frame.setSize(new Dimension(300,200));
        frame.setVisible(true);
        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                BuddyInfo buddy = new BuddyInfo(name.getText(), Integer.parseInt(num.getText()));
                ab.addBuddy(buddy);
                buddies.setText(ab.toString());
            }
        });

    }
}
