package lifegame;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author lenovo
 */
public class NewClass extends JButton implements ActionListener{
    
    public NewClass(int f, int c){
        addActionListener(this);
        setText(f+","+(c));
    }
    public void setNombre(int f, int c){
        setText(f+","+(c));
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        setBackground(Color.red);
        equals(true);
    }
}
