
package Java_Class;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JInternalFrame;
import javax.swing.KeyStroke;

/**
 *
 * @author Anthony Flores Llantoy
 * 
 */

public class Scape {
    
    private JInternalFrame internalFrame = null;

    private JButton boton;

    public Scape(JInternalFrame internalFrame, JButton boton) {
        this.internalFrame = internalFrame;
        this.boton = boton;
    }

    public void mapeoTecla(){
        
        ActionMap mapaAccion = internalFrame.getRootPane().getActionMap();
        InputMap map = internalFrame.getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        
        KeyStroke Key_ESC = KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE,0,true);
        
        map.put(Key_ESC, "accion_ESC");
        mapaAccion.put("accion_ESC",Accion_ESC());
        
    }
    
    public AbstractAction Accion_ESC(){
        return new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                boton.doClick();
            }
        };
    }
    
}
