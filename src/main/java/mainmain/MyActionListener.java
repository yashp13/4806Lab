package mainmain;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by yashpatel on 1/26/2017.
 */
public class MyActionListener implements ActionListener {
    private JTextField nameField, numberField, displayField;
    AddressBook ab = new AddressBook();

    public void setNameField(JTextField field){ nameField = field;}
    public void setNumberField(JTextField field){numberField = field;}
    public void setDisplayField(JTextField field){displayField = field;}

    public void actionPerformed(ActionEvent e){
        System.out.print("test");
        BuddyInfo buddy = new BuddyInfo(nameField.getText(), Integer.parseInt(numberField.getText()));
        System.out.println(nameField.getText());
        ab.addBuddy(buddy);
        System.out.println(ab);
        displayField.setText(ab.toString());
        displayField.validate();
        System.out.println(displayField.getText());
    }

}
