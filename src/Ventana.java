import java.awt.EventQueue;
import java.awt.Image;
import javax.swing.JFrame;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.GridLayout;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;

public class Ventana {

	private JFrame frmBajaGym;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana window = new Ventana();
					window.frmBajaGym.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	

	/**
	 * Create the application.
	 */
	public Ventana() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBajaGym = new JFrame();
		
		frmBajaGym.setTitle("Baja Gym");
		frmBajaGym.setBounds(100, 100, 700, 700);
		frmBajaGym.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// -------------------------- NOTA: INVESTIGAR BIEN LO DE LOS ICONOS -------------------------
		
		//frmBajaGym.setIconImage(Toolkit.getDefaultToolkit().getImage("\src\\icono.png"));
		
		// Obtiene el tamaño de la pantalla
        int screenWidth = Toolkit.getDefaultToolkit().getScreenSize().width;
        int screenHeight = Toolkit.getDefaultToolkit().getScreenSize().height;

        //Guarda el tamaño de la ventana
        int ventanaWidth = 899;
        int ventanaHeight = 698;
        frmBajaGym.setSize(879, 698);

        // Calculo de la pos
        int ventanaX=(screenWidth - ventanaWidth)/2;
        int ventanaY=(screenHeight - ventanaHeight)/2;
        frmBajaGym.setLocation(ventanaX, ventanaY);
		frmBajaGym.getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
        
		JPanel panelLogin = new JPanel();
        frmBajaGym.getContentPane().add(panelLogin);
        panelLogin.setBackground(Color.decode("#071931"));
        panelLogin.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("Inicio de sesíon");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setVerticalAlignment(SwingConstants.CENTER);
        lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 40));
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setBounds(212, 40, 428, 45);
        panelLogin.add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("Usuario");
        lblNewLabel_1.setForeground(new Color(153, 153, 153));
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
        lblNewLabel_1.setBounds(82, 188, 109, 24);
        panelLogin.add(lblNewLabel_1);
        
        textField = new JTextField();
        textField.setBounds(72, 180, 706, 45);
        panelLogin.add(textField);
        textField.setColumns(10);
        
        textField_1 = new JTextField();
        textField_1.setColumns(10);
        textField_1.setBounds(72, 279, 706, 45);
        panelLogin.add(textField_1);
        
        JLabel lblNewLabel_1_1 = new JLabel("Contraseña");
        lblNewLabel_1_1.setForeground(new Color(153, 153, 153));
        lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
        lblNewLabel_1_1.setBounds(72, 283, 161, 34);
        panelLogin.add(lblNewLabel_1_1);
        
        JButton btnNewButton = new JButton("Ingresar");
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnNewButton.setBounds(259, 471, 246, 68);
        panelLogin.add(btnNewButton);
        
        JLabel lblNewLabel_1_2 = new JLabel("Contraseña");
        lblNewLabel_1_2.setForeground(new Color(153, 153, 153));
        lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 24));
        lblNewLabel_1_2.setBounds(82, 283, 208, 35);
        panelLogin.add(lblNewLabel_1_2);
	}
}
