import java.awt.EventQueue;
import java.awt.Image;
import javax.swing.JFrame;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JRadioButton;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.ListSelectionModel;

public class Ventana {

	private JFrame frmBajaGym;
	private JTextField txtApellidoPaterno;
	private JTextField txtTelefono;
	private JTextField textField;
	private JTextField txtNombre;

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
		frmBajaGym.setBounds(100, 100, 899, 698);
		frmBajaGym.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		inicio(frmBajaGym);
	    login(frmBajaGym);
	    registro1(frmBajaGym);
	  
		
		
		
		// -------------------------- NOTA: INVESTIGAR BIEN LO DE LOS ICONOS -------------------------
		
		frmBajaGym.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/icono.png")));

		
		// Obtiene el tamaño de la pantalla
        int screenWidth = Toolkit.getDefaultToolkit().getScreenSize().width;
        int screenHeight = Toolkit.getDefaultToolkit().getScreenSize().height;

        //Guarda el tamaño de la ventana
        int ventanaWidth = 899;
        int ventanaHeight = 698;
        frmBajaGym.setSize(759, 690);

        // Calculo de la pos
        int ventanaX=(screenWidth - ventanaWidth)/2;
        int ventanaY=(screenHeight - ventanaHeight)/2;
        frmBajaGym.setLocation(ventanaX, ventanaY);
		frmBajaGym.getContentPane().setLayout(null);
		
		
		
        
		//////////////////////////////////////////////////////////////// MENU //////////////////////////////////////////////////////////////////
		
        JMenuBar menuBar = new JMenuBar();
        frmBajaGym.setJMenuBar(menuBar);
        
        //////////////////////////////////////////////// USUARIOS ///////////////////////////////////////////
        
        JMenu mnUsuarios = new JMenu("Usuarios");
        menuBar.add(mnUsuarios);
        
        JMenuItem mntmIniciarSesion = new JMenuItem("Iniciar sesion");
        mntmIniciarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmBajaGym.getContentPane().removeAll();
				login(frmBajaGym);
				frmBajaGym.validate();
				frmBajaGym.repaint();
			}
		});
        mnUsuarios.add(mntmIniciarSesion);
        
       
        
        JMenuItem mnRegistro = new JMenuItem("Registro");
        mnRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmBajaGym.getContentPane().removeAll();
				registro1(frmBajaGym);
				frmBajaGym.validate();
				frmBajaGym.repaint();
			}
		});
        mnUsuarios.add(mnRegistro);
        
        
        //////////////////////////////////////////////// CLIENTES  ///////////////////////////////////////////
        
        JMenu mnClientes = new JMenu("Clientes");
        menuBar.add(mnClientes);
        
        JMenuItem mntmCrearCliente = new JMenuItem("Crear");
        mnClientes.add(mntmCrearCliente);
        
        JMenuItem mntmEditarClientes = new JMenuItem("Editar");
        mnClientes.add(mntmEditarClientes);
        
        JMenuItem mntmEliminarClientes = new JMenuItem("Eliminar");
        mnClientes.add(mntmEliminarClientes);
        
        JMenuItem mntmConsultarClientes = new JMenuItem("Consultar");
        mnClientes.add(mntmConsultarClientes);
        
        //////////////////////////////////////////////// TARIFAS  ///////////////////////////////////////////
        
        JMenu Tarifas = new JMenu("Tarifas");
        menuBar.add(Tarifas);
        
        JMenu mnConsultarTarifa = new JMenu("Consultar");
        Tarifas.add(mnConsultarTarifa);
        
        JMenuItem mntmCrearTarifa = new JMenuItem("Crear");
        Tarifas.add(mntmCrearTarifa);
        
        JMenuItem mntmEditarTarifa = new JMenuItem("Editar");
        Tarifas.add(mntmEditarTarifa);
        
        JMenuItem mntmEliminarTarifa = new JMenuItem("Eliminar");
        Tarifas.add(mntmEliminarTarifa);
        
        //////////////////////////////////////////////// TIENDA  ///////////////////////////////////////////
        
        JMenu mnTienda = new JMenu("Tienda");
        menuBar.add(mnTienda);
        
        JMenu mnMujeres = new JMenu("Mujeres");
        mnTienda.add(mnMujeres);
        
        JMenuItem mntmHombres = new JMenuItem("Hombres");
        mnTienda.add(mntmHombres);
        
        JMenuItem mntmSuplementos = new JMenuItem("Suplementos");
        mnTienda.add(mntmSuplementos);
        
        JMenuItem mntmEquipo = new JMenuItem("Equipo");
        mnTienda.add(mntmEquipo);
        
        //////////////////////////////////////////////// CAJA  ///////////////////////////////////////////
        
        JMenu mnCaja = new JMenu("Caja");
        menuBar.add(mnCaja);
        
        JMenuItem mntmFactura = new JMenuItem("Factura");
        mnCaja.add(mntmFactura);
	}
	
	
public void login (JFrame frame) {
		
		JPanel panelLogin = new JPanel();
		panelLogin.setBounds(-42, 0, 863, 637);
        frame.getContentPane().add(panelLogin);
        panelLogin.setBackground(Color.decode("#071931"));
        panelLogin.setLayout(null);
        
        JLabel lbl_InicioSeSion = new JLabel("Inicio de sesíon");
        lbl_InicioSeSion.setHorizontalAlignment(SwingConstants.CENTER);
        lbl_InicioSeSion.setVerticalAlignment(SwingConstants.CENTER);
        lbl_InicioSeSion.setFont(new Font("Dialog", Font.BOLD, 40));
        lbl_InicioSeSion.setForeground(new Color(255, 255, 255));
        lbl_InicioSeSion.setBounds(223, 189, 428, 45);
        panelLogin.add(lbl_InicioSeSion);
        
        JTextField txtNombreDeUsuario = new JTextField();
        txtNombreDeUsuario.setForeground(new Color(128, 128, 128));
        txtNombreDeUsuario.setFont(new Font("Tahoma", Font.PLAIN, 20));
        txtNombreDeUsuario.setText("Nombre de usuario");
        txtNombreDeUsuario.setBounds(215, 372, 462, 37);
        panelLogin.add(txtNombreDeUsuario);
        txtNombreDeUsuario.setColumns(10);
        
        JTextField txtContraseña = new JTextField();
        txtContraseña.setForeground(new Color(128, 128, 128));
        txtContraseña.setFont(new Font("Tahoma", Font.PLAIN, 20));
        txtContraseña.setText("Contraseña");
        txtContraseña.setColumns(10);
        txtContraseña.setBounds(215, 286, 462, 37);
        panelLogin.add(txtContraseña);
        
        JLabel lblUser = new JLabel("");
        lblUser.setIcon(new ImageIcon(getClass().getResource("userxd.png")));
        lblUser.setBounds(155,273,50,50);
		panelLogin.add(lblUser);
	
        
        JLabel logoContraseña = new JLabel();
	    logoContraseña.setIcon(new ImageIcon(getClass().getResource("candadoBlanco.png")));
	    logoContraseña.setBounds(155,359,40,50);
	    panelLogin.add(logoContraseña);
	    
	    JLabel lblLogo = new JLabel();
        lblLogo.setIcon(new ImageIcon(getClass().getResource("logoLogin.png")));
        lblLogo.setBounds(368,0,229,220);
	    panelLogin.add(lblLogo);
        
        JLabel lblContraOlvidada = new JLabel("¿Olvidaste tu contraseña?");
        lblContraOlvidada.setFont(new Font("Tahoma", Font.ITALIC, 15));
        lblContraOlvidada.setForeground(new Color(255, 255, 255));
        lblContraOlvidada.setBounds(352, 584, 180, 14);
        
        panelLogin.add(lblContraOlvidada);
        
        JLabel lblNoCuenta = new JLabel("¿No tienes cuenta? Registrate aquí");
        lblNoCuenta.setFont(new Font("Tahoma", Font.ITALIC, 15));
        lblNoCuenta.setForeground(Color.WHITE);
        lblNoCuenta.setBounds(318, 561, 238, 25);
        panelLogin.add(lblNoCuenta);
		
	}




public void inicio (JFrame frame) {

	JPanel panelInicio = new JPanel();
	panelInicio.setBackground(Color.decode("#071931"));
	panelInicio.setBounds(0, 0, 814, 622);
	frmBajaGym.getContentPane().add(panelInicio);
	 panelInicio.setLayout(null);
	
	 JLabel lblFondo = new JLabel();
	 lblFondo.setIcon(new ImageIcon(getClass().getResource("icono.png")));
     lblFondo.setBounds(72,52,663,508);
     panelInicio.add(lblFondo);
}


public void registro1(JFrame frame) {
	JPanel panelRegistro = new JPanel();
	panelRegistro.setBounds(0, -25, 857, 759);
    frame.getContentPane().add(panelRegistro);
    panelRegistro.setBackground(Color.decode("#071931"));
    panelRegistro.setLayout(null);
    
    JLabel lbl_InicioSeSion = new JLabel("Registro");
    lbl_InicioSeSion.setHorizontalAlignment(SwingConstants.CENTER);
    lbl_InicioSeSion.setVerticalAlignment(SwingConstants.CENTER);
    lbl_InicioSeSion.setFont(new Font("Dialog", Font.BOLD, 40));
    lbl_InicioSeSion.setForeground(new Color(255, 255, 255));
    lbl_InicioSeSion.setBounds(155, 168, 428, 45);
    panelRegistro.add(lbl_InicioSeSion);
    
    JLabel lblUser = new JLabel("");
    lblUser.setBounds(155,273,50,50);
    panelRegistro.add(lblUser);

    
    JLabel logoContraseña = new JLabel();
    logoContraseña.setBounds(155,359,40,50);
    panelRegistro.add(logoContraseña);
    
    JLabel lblLogo = new JLabel();
    lblLogo.setIcon(new ImageIcon(getClass().getResource("logoLogin.png")));
    lblLogo.setBounds(299,-7,229,220);
    panelRegistro.add(lblLogo);
    
    txtApellidoPaterno = new JTextField();
    txtApellidoPaterno.setText("Apellido Paterno");
    txtApellidoPaterno.setForeground(Color.GRAY);
    txtApellidoPaterno.setFont(new Font("Tahoma", Font.PLAIN, 20));
    txtApellidoPaterno.setColumns(10);
    txtApellidoPaterno.setBounds(165, 390, 428, 45);
    panelRegistro.add(txtApellidoPaterno);
    
    txtTelefono = new JTextField();
    txtTelefono.setText("Telefono");
    txtTelefono.setForeground(Color.GRAY);
    txtTelefono.setFont(new Font("Tahoma", Font.PLAIN, 20));
    txtTelefono.setColumns(10);
    txtTelefono.setBounds(165, 465, 428, 45);
    panelRegistro.add(txtTelefono);
    
    textField = new JTextField();
    textField.setText("Apellido Materno");
    textField.setForeground(Color.GRAY);
    textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
    textField.setColumns(10);
    textField.setBounds(165, 313, 428, 45);
    panelRegistro.add(textField);
    
    txtNombre = new JTextField();
    txtNombre.setText("Nombre");
    txtNombre.setForeground(Color.GRAY);
    txtNombre.setFont(new Font("Tahoma", Font.PLAIN, 20));
    txtNombre.setColumns(10);
    txtNombre.setBounds(165, 242, 428, 45);
    panelRegistro.add(txtNombre);
    
    JButton btnAtras = new JButton("");
    btnAtras.setBounds(165, 555, 174, 57);
    panelRegistro.add(btnAtras);
    
    JButton btnSiguient = new JButton("");
    btnSiguient.setBounds(388, 555, 174, 57);
    panelRegistro.add(btnSiguient);

	
}
}
