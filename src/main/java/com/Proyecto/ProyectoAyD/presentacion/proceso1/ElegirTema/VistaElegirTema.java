package com.Proyecto.ProyectoAyD.presentacion.proceso1.ElegirTema;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.springframework.stereotype.Component;

import com.Proyecto.ProyectoAyD.negocio.modelo.Alumno;
import com.Proyecto.ProyectoAyD.negocio.modelo.Tema;

import javax.swing.JTabbedPane;

@Component
public class VistaElegirTema extends JFrame 
{//Inicio de la clase VistaElegirTema
	private JPanel contentPane;
	private static final long serialVersionUID = 1L;
	private JComboBox <String> comboBoxTema;
	private JPanel PanelTema;
	private ControlElegirTema controlElegirTema;
	private Alumno alumn =new Alumno();;
	public VistaElegirTema() 
	{//Inicio de Constructor VistaElegirTema
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 53, 414, 165);
		contentPane.add(tabbedPane);
		
		PanelTema = new JPanel();
		tabbedPane.addTab("Tema", null, PanelTema, null);
		PanelTema.setLayout(null);
		
		comboBoxTema = new JComboBox<>();
		comboBoxTema.setBounds(131, 57, 169, 22);
		PanelTema.add(comboBoxTema);
		
		JLabel lblNewLabel_2 = new JLabel("Selecciona Tema");
		lblNewLabel_2.setBounds(145, 11, 125, 21);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		PanelTema.add(lblNewLabel_2);
		
		//Boton Confirmar
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.addActionListener(new ActionListener() 
		{//inicio de clase anonima
			public void actionPerformed(ActionEvent e) 
			{//inicio de actionPermorfed JButton
				verificarVacia();
				controlElegirTema.agregarTesina((String) comboBoxTema.getSelectedItem(),alumn);
			}//fin de actionPermorfed JButton
		});//fin de clase anonima
		btnConfirmar.setBounds(293, 103, 89, 23);
		PanelTema.add(btnConfirmar);
		
		JPanel PanelMensaje = new JPanel();
		tabbedPane.addTab("Mensaje", null, PanelMensaje, null);
		
		JPanel PanelAvance = new JPanel();
		tabbedPane.addTab("Avance", null, PanelAvance, null);
		PanelAvance.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(10, 11, 46, 14);
		PanelAvance.add(lblNewLabel_3);
		
		JPanel PanelHorario = new JPanel();
		tabbedPane.addTab("Horario", null, PanelHorario, null);
		JLabel lblFondoVerde = new JLabel("New label");
		lblFondoVerde.setBounds(0, 33, 434, 198);
		lblFondoVerde.setIcon(new ImageIcon("C:\\Users\\Familia\\Downloads\\Imagenes\\Imagenes\\FondoVerde.jpeg"));
		contentPane.add(lblFondoVerde);
		
		JLabel lblLogoFacebook = new JLabel("New label");
		lblLogoFacebook.setBounds(291, 226, 58, 38);
		lblLogoFacebook.setIcon(new ImageIcon("C:\\Users\\Familia\\Downloads\\Imagenes\\Imagenes\\facebook.png"));
		contentPane.add(lblLogoFacebook);
		
		JLabel lblLogoTwitter = new JLabel("New label");
		lblLogoTwitter.setBounds(315, 229, 77, 33);
		lblLogoTwitter.setIcon(new ImageIcon("C:\\Users\\Familia\\Downloads\\Imagenes\\Imagenes\\twitter.png"));
		contentPane.add(lblLogoTwitter);
		
		JLabel lblInstagram = new JLabel("New label");
		lblInstagram.setBounds(356, 231, 78, 28);
		lblInstagram.setIcon(new ImageIcon("C:\\Users\\Familia\\Downloads\\Imagenes\\Imagenes\\instagram.png"));
		contentPane.add(lblInstagram);
		
		JLabel lblNombreSistema = new JLabel("New label");
		lblNombreSistema.setBounds(-24, 229, 184, 44);
		lblNombreSistema.setIcon(new ImageIcon("C:\\Users\\Familia\\Downloads\\Imagenes\\Imagenes\\NombreSistema.png"));
		contentPane.add(lblNombreSistema);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(249, 0, 77, 62);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Familia\\Downloads\\Imagenes\\Imagenes\\usuario.png"));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre Alumno");
		lblNewLabel_1.setBounds(328, 11, 119, 22);
		lblNewLabel_1.setFont(new Font("Sylfaen", Font.BOLD, 13));
		contentPane.add(lblNewLabel_1);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 219, 28);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Inicio");
		menuBar.add(mnNewMenu);
		
		JButton btnNewButton = new JButton("");
		mnNewMenu.add(btnNewButton);
		
		JMenu mnNewMenu_1 = new JMenu("Alumno");
		menuBar.add(mnNewMenu_1);
		
		JButton btnTesina = new JButton("Tesina");
		mnNewMenu_1.add(btnTesina);
		JButton btnElegirDocente = new JButton("Elegir Docente");
		mnNewMenu_1.add(btnElegirDocente);
		
		JButton btnDisponibilidad = new JButton("Disponibilidad de docente");
		mnNewMenu_1.add(btnDisponibilidad);
		
		JMenu mnNewMenu_2 = new JMenu("Clase");
		menuBar.add(mnNewMenu_2);
		
		
	
	}//fin del constructor 
	/*  m??todo para poder mostrar la vista temas, junto a los temas disponibles */
	public void muestra (ControlElegirTema control, List <Tema> temas,Alumno alum) 
	{//Inicio de muestra
		controlElegirTema= control;
		alumn=alum;
		DefaultComboBoxModel <String> comboBoxModel = new DefaultComboBoxModel <>();
		//Agregamos los temas al combo box
		for(Tema tema:temas) 
		{//Inicio de for
			comboBoxModel.addElement(tema.getNombre());
		}//fin de for
		//Mostramos los temas
		comboBoxTema.setModel(comboBoxModel);
		setVisible(true);
	}//fin de muestra
	//M??todo para verificar si el combobox est?? vacio
	public void verificarVacia() 
	{//inicio de m??todo verificarVacia
		if( comboBoxTema.getSelectedItem().toString().isEmpty() )
		{//Inicio de if 
			 JOptionPane.showMessageDialog(null, "Vacio");
		}//fin de if
	}//fin del metodo

	public void muestraDialogoConMensaje(String mensaje ) {
		JOptionPane.showMessageDialog(this , mensaje);
	}
}//fin de la clase vistaElegirTema