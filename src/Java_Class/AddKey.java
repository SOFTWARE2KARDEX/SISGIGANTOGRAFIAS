
package Java_Class;

import static Representacion.frminicio.escritorio;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JInternalFrame;
import javax.swing.KeyStroke;

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
