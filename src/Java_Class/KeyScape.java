
package Java_Class;

import static Representacion.frminicio.escritorio;
import Representacion.frmplancha;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JInternalFrame;
import javax.swing.KeyStroke;

/**
 *
 * @author Anthony
 * 
 */

public class KeyScape extends KeyAdapter{

    //private JInternalFrame internalframe = null;
    private JButton jbutton;

    public KeyScape(JButton jbutton) {
        this.jbutton = jbutton;
    }

//    public KeyScape(JInternalFrame internalframe) {
//        this.internalframe = internalframe;
//    }
    
    @Override
    public void keyTyped(KeyEvent ke) {
//        if(ke.getKeyCode() == KeyEvent.VK_ESCAPE){
//            
//            internalframe.getDesktopPane().getDesktopManager().closeFrame(internalframe);
//        }        
    }

    @Override
    public void keyPressed(KeyEvent ke) {

//        if(ke.getKeyCode() == KeyEvent.VK_ESCAPE){
//            
//            jbutton.doClick();
//            //internalframe.getDesktopPane().getDesktopManager().closeFrame(internalframe);
//            
////            KeyStroke kstescape = KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE,0,false);
////            Action atcescape = new AbstractAction(){
////
////                @Override
////                public void actionPerformed(ActionEvent e) {
////                    //jbutton.doClick();
////                    internalframe.getDesktopPane().getDesktopManager().closeFrame(internalframe);
////                }
////
////            };
////            escritorio.getRootPane().getInputMap(JInternalFrame.WHEN_FOCUSED).put(kstescape, "ESCAPE");
////            escritorio.getRootPane().getActionMap().put("ESCAPE", atcescape);
//            
//            //internalframe.getDesktopPane().getDesktopManager().closeFrame(internalframe);
//            
//        }
        
    }

    @Override
    public void keyReleased(KeyEvent ke) {
//        if(ke.getKeyCode() == KeyEvent.VK_ESCAPE){
//            
//            internalframe.getDesktopPane().getDesktopManager().closeFrame(internalframe);
//        }                
    }

}
