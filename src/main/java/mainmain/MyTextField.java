package mainmain; /**
 * Created by yashpatel on 1/26/2017.
 */

import javax.swing.JTextField;
public class MyTextField extends JTextField{
    private String text;
    public void setText(String text){
        this.text = text;
    }

    public void init(){
        setText(text);
    }

}
