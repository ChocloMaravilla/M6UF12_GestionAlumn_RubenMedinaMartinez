
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
// import java.io.File;

// import javax.xml.parsers.DocumentBuilder;
// import javax.xml.parsers.DocumentBuilderFactory;
// import javax.xml.parsers.ParserConfigurationException;
// import javax.xml.transform.Transformer;
// import javax.xml.transform.TransformerException;
// import javax.xml.transform.TransformerException;
// import javax.xml.transform.TransformerFactory;
// import javax.xml.transform.dom.DOMSource;
// import javax.xml.transform.stream.StreamResult;
// import javax.swing.JOptionPane;

// import org.w3c.dom.Attr;
// import org.w3c.dom.Document;
// import org.w3c.dom.Element;

public class Swing2 extends JFrame implements ActionListener {

    JFrame frame = new JFrame();
    JPanel pantalla = new JPanel();
    Toolkit tool = Toolkit.getDefaultToolkit();
    JTextField asignatura = new JTextField();
    JTextField alumnos = new JTextField();
    JTextField infoAlumn = new JTextField();
    JTextField buscador = new JTextField();
    JTextField infoError = new JTextField();
    JLabel Icono = new JLabel();
    JButton submit = new JButton();
    JButton Search = new JButton();

    public Swing2() {
        // Seccion de añadir elementos tanto al JFrame como al JPanel.
        frame.setContentPane(pantalla);
        frame.add(asignatura);
        frame.add(alumnos);
        frame.add(submit);
        frame.add(infoAlumn);
        frame.add(Icono);
        frame.add(buscador);
        frame.add(Search);
        frame.add(infoError);

        // Atributos del JFrame.
        // setExtendedState(MAXIMIZED_BOTH);// Esto indica el posicionamiento se adapte
        // a la pantalla.
        frame.setVisible(true);
        frame.setSize(900, 700);
        frame.setLocation(510, 140);
        frame.setResizable(false);// Esto hace que no se pueda reescalar.
        frame.setTitle("Management program Alumn Campusnet vers. 1.0.0 - (variable asignatura de la persona)");
        // En estas dos linias cambio el icono del JDK por un png de un payaso.
        Image icono = tool.getImage("payaso.png");
        frame.setIconImage(icono);

        // Atributos JPanel.
        pantalla.setSize(500, 500);
        pantalla.setBackground(Color.DARK_GRAY);// Color del fondo.
        pantalla.setLayout(null);

        // Atributos JTextField asignatura.
        asignatura.setText("Only 1 Subject at the same time");
        asignatura.setSize(300, 30);
        asignatura.setLocation(10, 20);
        asignatura.setFont(new Font("Montserrat", Font.BOLD, 16));
        asignatura.setBackground(Color.white);
        asignatura.setBorder(null);
        asignatura.selectAll();
        // asignatura.setHorizontalAlignment(SwingConstants.RIGHT);

        // Atributos JTextField alumnos.
        alumnos.setText("Only 1 Student at the same time");
        alumnos.setSize(300, 30);
        alumnos.setLocation(10, 55);
        alumnos.setFont(new Font("Montserrat", Font.BOLD, 16));
        alumnos.setBackground(Color.white);
        alumnos.setBorder(null);
        alumnos.selectAll();
        // alumnos.setHorizontalAlignment(SwingConstants.RIGHT);

        // Atributos JTextiField infoAlumn.
        infoAlumn.setEnabled(false);
        infoAlumn.setSize(865, 525);
        infoAlumn.setLocation(10, 125);
        infoAlumn.setFont(new Font("Montserrat", Font.BOLD, 16));
        infoAlumn.setBackground(Color.white);
        infoAlumn.setBorder(null);

        // Atributos JTextiField infoError.
        infoError.setEnabled(false);
        infoError.setSize(455, 100);
        infoError.setLocation(420, 20);
        infoError.setFont(new Font("Montserrat", Font.BOLD, 16));
        infoError.setBackground(Color.white);
        infoError.setBorder(null);

        // Atributos JTextField buscador.
        buscador.setSize(260, 30);
        buscador.setLocation(50, 90);
        buscador.setFont(new Font("Montserrat", Font.BOLD, 16));
        buscador.setBackground(Color.white);
        buscador.setBorder(null);
        buscador.selectAll();
        // buscador.setHorizontalAlignment(SwingConstants.RIGHT);

        // Atributos JTextField icon.
        Icono.setSize(33, 33);
        Icono.setLocation(10, 90);
        Icono.setBorder(null);
        Icono.setIcon(new ImageIcon("lupa.png"));

        // Atributos JButton submit.
        submit.setText("Submit");
        submit.setSize(100, 65);
        submit.setLocation(315, 20);
        submit.setBackground(Color.lightGray);
        submit.setBorder(null);
        submit.addActionListener(this);

        // Atributos JButton Search.
        Search.setText("Search");
        Search.setSize(100, 30);
        Search.setLocation(315, 90);
        Search.setBackground(Color.lightGray);
        Search.setBorder(null);
        Search.addActionListener(this);

    } // WindowsListener

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == submit) {

        }
        if (e.getSource() == Search) {

        }
    }
}