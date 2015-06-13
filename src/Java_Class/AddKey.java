
package Java_Class;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;

/**
 * @author Anthony Flores Llantoy
 */

public class AddKey extends KeyAdapter{

    private JButton jbutton;
    
    public AddKey(JButton jbutton) {
        this.jbutton = jbutton;
    }

    public void keyPressed(KeyEvent ke) {
        if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
            jbutton.doClick();
        }
    }
    
}
