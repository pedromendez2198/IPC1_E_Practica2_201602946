package lifegame;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.LineBorder;

public class Login extends JFrame{
    private JPanel contentpane;
    private JLabel lblUsuario, lblPassword, lblFondo;
    private JTextField txtUsuario, txtPassword;
    private Icon icoUsuario, icoFondo;
   
    private JButton btnEntrar, btnSalir;
    
    public Login() {
        this.init_component();
        this.getContentPane().setBackground(Color.GRAY);
    }

    public void init_component() {
        setSize(415, 230);
        setLocationRelativeTo(null);
        setTitle("LOGIN");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        setVisible(true);

        this.contentpane = (JPanel) this.getContentPane();
        this.contentpane.setLayout(null);
        
        this.contentpane.setSize(510, 350);

        //fondo ****************************************************************
        this.lblFondo = new JLabel("");
        this.icoFondo = new ImageIcon(getClass().getResource("/imagenes/Conway_s_Game_of_Life7.jpg"));
        this.lblFondo.setIcon(icoFondo);
        this.lblFondo.setSize(414, 159);
        this.lblFondo.setLocation(2, 2);
        this.contentpane.add(this.lblFondo);

        //usuario *************************************************************
        this.lblUsuario = new JLabel("");
//        this.icoUsuario = new ImageIcon(getClass().getResource("/imagenes/usuario.png"));
        this.lblUsuario.setIcon(icoUsuario);
        this.lblUsuario.setSize(100, 100);
        this.lblUsuario.setLocation(300, 110);
        this.contentpane.add(this.lblUsuario);

        this.txtUsuario = new JTextField();
        this.txtUsuario.setEnabled(true); 
        this.txtUsuario.setBackground(Color.BLACK);
        this.txtUsuario.setForeground(Color.GREEN);
        this.txtUsuario.setDisabledTextColor(Color.RED);
        this.txtUsuario.setBorder(new LineBorder(Color.GRAY));
        this.txtUsuario.setSize(150, 30);
        this.txtUsuario.setLocation(140, 125);
        this.contentpane.add(this.txtUsuario);

       

        //boton de login ******************************************************
        this.btnEntrar = new JButton("Entrar");
        this.btnEntrar.setToolTipText("Entrar");
        this.btnEntrar.setSize(212, 40);
        this.btnEntrar.setLocation(0, 161);
        this.btnEntrar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                
                NewJFrame jg=new NewJFrame(Integer.parseInt(txtUsuario.getText()));
                //jg.CMatriz();
                jg.show();
            }
        });
        this.contentpane.add(this.btnEntrar);

        //boton salir ********************************************************
        this.btnSalir = new JButton("SALIR");
        this.btnSalir.setToolTipText("SALIR");
        this.btnSalir.setSize(212, 40);
        this.btnSalir.setLocation(213, 161);
        this.btnSalir.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                btnSalir(evt);
            }
        });
        this.contentpane.add(this.btnSalir);
    }
    private void btnSalir(ActionEvent evt) {
        System.exit(0);
    }
    
}
