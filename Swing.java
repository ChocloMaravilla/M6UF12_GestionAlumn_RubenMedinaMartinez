
import java.awt.*;
import javax.swing.*;

public class Swing extends JFrame {

    public Swing() {
        JPanel pantalla = new JPanel();
        Toolkit tool = Toolkit.getDefaultToolkit();
        JTextField nombre = new JTextField();
        JPasswordField contraseña = new JPasswordField();
        JButton submit = new JButton();

        // Seccion de añadir elementos tanto al JFrame como al JPanel.
        pantalla.add(nombre);
        pantalla.add(contraseña);
        pantalla.add(submit);
        add(pantalla);

        // Atributos del JFrame.
        setSize(500, 500);// Esto indica el tamaño del JFrame.
        // setExtendedState(MAXIMIZED_BOTH);// Esto indica el posicionamiento se adapte
        // a la pantalla.
        setSize(500, 200);
        setLocation(720, 340);
        setResizable(false);// Esto hace que no se pueda reescalar.
        setTitle("Management program Alumn Campusnet vers. 1.0.0");
        // En estas dos linias cambio el icono del JDK por un png de un payaso.
        Image icono = tool.getImage("payaso.png");
        setIconImage(icono);

        // Atributos JPanel.
        pantalla.setSize(500, 500);
        pantalla.setBackground(Color.DARK_GRAY);// Color del fondo.
        pantalla.setLayout(null);

        // Atributos JTextField nombre.
        nombre.setText("Name");
        nombre.setSize(200, 30);
        nombre.setLocation(145, 20);
        nombre.setFont(new Font("Montserrat", Font.BOLD, 16));
        nombre.setBackground(Color.white);
        nombre.setBorder(null);

        // Atributos JPasswordField contraseña.
        contraseña.setText("Password");
        contraseña.setSize(200, 30);
        contraseña.setLocation(145, 55);
        contraseña.setFont(new Font("Montserrat", Font.BOLD, 16));
        contraseña.setBackground(Color.white);
        contraseña.setBorder(null);

        // Atributos JButton submit.
        submit.setText("Submit");
        submit.setSize(100, 30);
        submit.setLocation(196, 90);
        submit.setBackground(Color.lightGray);
        submit.setBorder(null);
    }
}