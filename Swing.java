
import java.awt.*;
import javax.swing.*;
//import java.awt.event.*;
//import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// import java.io.FileInputStream;
// import java.io.FileNotFoundException;
// import java.io.IOException;
// import java.io.InputStream;
// import java.util.Properties;
import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
// import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
// import javax.swing.JOptionPane;

// import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class Swing extends JFrame implements ActionListener {

    JFrame frame = new JFrame();
    JPanel pantalla = new JPanel();
    Toolkit tool = Toolkit.getDefaultToolkit();
    JTextField nombre = new JTextField();
    JPasswordField contraseña = new JPasswordField();
    JButton submit = new JButton();

    public Swing() {

        // Seccion de añadir elementos tanto al JFrame como al JPanel.
        frame.setContentPane(pantalla);
        frame.add(nombre);
        frame.add(contraseña);
        frame.add(submit);

        // Atributos del JFrame.
        frame.setSize(500, 200);// Esto indica el tamaño del JFrame.
        frame.setLocation(720, 340);
        frame.setResizable(false);// Esto hace que no se pueda reescalar.
        frame.setTitle("Management program Alumn Campusnet vers. 1.0.0");
        frame.setVisible(true);
        // En estas dos linias cambio el icono del JDK por un png de un payaso.
        Image icono = tool.getImage("payaso.png");
        frame.setIconImage(icono);

        // Atributos JPanel.
        // pantalla.setSize(500, 500);
        pantalla.setBackground(Color.DARK_GRAY);// Color del fondo.
        pantalla.setLayout(null);
        pantalla.setVisible(true);

        // Atributos JTextField nombre.
        nombre.setText("Name");

        nombre.setSize(200, 30);
        nombre.setLocation(145, 20);
        nombre.setFont(new Font("Montserrat", Font.BOLD, 16));
        nombre.setBackground(Color.white);
        nombre.setBorder(null);
        nombre.selectAll();
        nombre.setHorizontalAlignment(SwingConstants.CENTER);

        // Atributos JPasswordField contraseña.
        contraseña.setText("Password");
        contraseña.setSize(200, 30);
        contraseña.setLocation(145, 55);
        contraseña.setFont(new Font("Montserrat", Font.BOLD, 16));
        contraseña.setBackground(Color.white);
        contraseña.setBorder(null);
        contraseña.selectAll();
        contraseña.setHorizontalAlignment(SwingConstants.CENTER);

        // Atributos JButton submit.
        submit.setText("Submit");
        submit.setSize(100, 30);
        submit.setLocation(196, 90);
        submit.setBackground(Color.lightGray);
        submit.setBorder(null);
        submit.addActionListener(this);

        // Logica

        // names = nombre.getText();
        // WindowListener

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == submit) {

            /*
             * Swing pantalla = new Swing();
             * String names = pantalla.nombre.getText();
             * String passwords = new String(pantalla.contraseña.getPassword());
             * Properties propiedades = new Properties();
             * InputStream inputt = null;
             * try {
             * inputt = new FileInputStream("credenciales.properties");
             * } catch (FileNotFoundException e1) {
             * e1.printStackTrace();
             * }
             * try {
             * propiedades.load(inputt);
             * } catch (IOException e1) {
             * e1.printStackTrace();
             * }
             * String temp1 = propiedades.getProperty("Name");
             * String temp2 = propiedades.getProperty("Password");
             * // String names = pantalla.nombre.getText();
             * // String passwords = new String(pantalla.contraseña.getPassword());
             * System.out.println(names);
             * System.out.println(passwords);
             * if (temp1 != names || temp2 != passwords) {
             * JOptionPane.showMessageDialog(null,
             * "El name o la password estan mal, el programa se cerrara");
             * System.exit(0);
             * } else {
             * pantalla.setVisible(false);
             * new Swing2();
             * }
             */
            String fichero = "GuardadoGestionDatos.xml";
            File archivo = new File(fichero);
            if (archivo.exists()) {
                frame.setVisible(false);
                new Swing2();
            }

            else {
                try {
                    DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
                    DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

                    Document documento = docBuilder.newDocument();
                    Element principalElement = documento.createElement("campusNET");
                    documento.appendChild(principalElement);

                    TransformerFactory transformerFactory = TransformerFactory.newInstance();
                    Transformer transformer = transformerFactory.newTransformer();
                    DOMSource source = new DOMSource(documento);
                    StreamResult result = new StreamResult(new File("GuardadoGestionDatos.xml"));
                    transformer.transform(source, result);
                } catch (ParserConfigurationException pce) {
                    pce.printStackTrace();
                } catch (TransformerException tfe) {
                    tfe.printStackTrace();
                }
                frame.setVisible(false);
                new Swing2();
            }
        }
    }
}

/*
 * APP_GUI.addWindowListener(new WindowAdapter() {
 * public void windowClosing(WindowEvent evento) {
 * writerReader();
 * Printtxt(jugador);
 * }
 * });
 * }
 * public APP_GUI(){}
 * 
 * @Override
 * public void actionPerformed (ActionEvent e){
 * //Boton Negro.
 * if (e.getSource() == bot1) {
 * selector = true;
 * }
 * //Boton Rojo
 * if (e.getSource() == bot2) {
 * selector = false;
 * }
 * if (e.getSource() == Actualizar) {
 * 
 * ingresar = Integer.parseInt((textFielddeposito.getText()));
 * dinero = dinero + ingresar;
 * textField.setText(String.valueOf(dinero));
 * textFielddeposito.setText(" ");
 * moneys += ingresar;
 * }
 */