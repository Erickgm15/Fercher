package Paneles;

import java.awt.*;
import javax.swing.*;

public class Buscarpanel extends JPanel {

    public JTextField txtBuscar;

    public Buscarpanel() {
        
        setPreferredSize(new Dimension(120, 50));
        setBorder(BorderFactory.createTitledBorder("Buscar Producto"));

        txtBuscar = new JTextField(10);

     
        add(txtBuscar);
    }
}