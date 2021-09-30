import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PantallaPrincipal {

    private JPanel panelPrincipal;
    private JTextField campoNombre;
    private JTextField campoEdad;
    private JButton enviarButton;
    private JLabel nombreTexto;
    private JLabel edadTexto;


    public PantallaPrincipal() {

        enviarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String nombre = campoNombre.getText();
                String edad = campoEdad.getText();

                nombreTexto.setText("El nombre es: " + nombre);
                edadTexto.setText("La edad es:" + edad);

                // JOptionPane.showMessageDialog(panelPrincipal, "El Nombre es: " + nombre );
                //  JOptionPane.showMessageDialog(panelPrincipal, "La Edad es: " + edad );

            }
        });

        nombreTexto.setText("No has ingresado un Nombre");
        edadTexto.setText("No has ingresado una edad");

    }

    public static void main(String[] args) {
        JFrame ventana = new JFrame("Mi aplicacion");
        ventana.setContentPane(new PantallaPrincipal().panelPrincipal);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.pack();
        ventana.setVisible(true);
    }


}
