package lifegame;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel ;
import javax.swing.JLabel ;
import java.awt.GridLayout;

public class Lifegame extends JPanel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Login lg= new Login();
        lg.show();
        
        /*JFrame frame = new JFrame("Tennis");
            Lifegame game = new Lifegame();
            frame.add(game);
            frame.setSize(300, 400);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
            
            //Simplemente lo vamos a ejecutar por simpre 
            while (true) {
            	
                game.move();
            	
                game.repaint();
                
                /**
                 * Vamos a pausar el ciclo 10 milisegundo es decir que vamos a 
                 * iterar cada 10 milisegundo
                */
        
            	//.sleep(10);
                
            }
    }
    

