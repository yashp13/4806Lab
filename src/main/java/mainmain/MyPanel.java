package mainmain;

import javax.swing.*;
import java.awt.*;
import java.util.Iterator;
import java.util.List;

/**
 * Created by yashpatel on 1/26/2017.
 */
public class MyPanel extends JPanel {
    private List panelComponents;
    public void setPanelComponents(List panelComponents){
        this.panelComponents = panelComponents;
    }
    public void init(){
        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        for (Iterator i = panelComponents.iterator(); i.hasNext();){
            Component component = (Component) i.next();
            add(component);
        }
    }
}
