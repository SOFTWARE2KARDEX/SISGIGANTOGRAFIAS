
package Java_Class;

import static Representacion.frminicio.escritorio;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Anthony
 */
public class CentrarVentanaInterna {
    
    private JInternalFrame internalFrame;

    public CentrarVentanaInterna(JInternalFrame internalFrame) {
        this.internalFrame = internalFrame;
    }
    
    public static void FocusInternalWindow(JInternalFrame internalFrame ){           //  centra el jinternalframe y la muestra en el jDesktop
        int x = (escritorio.getWidth()/2) - internalFrame.getWidth()/2;
        int y = (escritorio.getHeight()/2) - internalFrame.getHeight()/2;
        
        if(internalFrame.isShowing()){
            internalFrame.setLocation(x,y);
            //JOptionPane.showMessageDialog(escritorio, "Este es un mensaje de prueba");
        }
        else{
            escritorio.add(internalFrame);
            internalFrame.setLocation(x,y);
            internalFrame.show();
            internalFrame.toFront();
            internalFrame.requestFocus();
        }
    }    
    
}
