package Paneles;
import javax.swing.*;
import java.awt.*;

public class Panelcuadros extends JPanel {

    public Panelcuadros(int filas, int columnas) {
       
        this.setLayout(new GridLayout(filas, columnas, 10, 10));

       
        for (int i = 0; i < filas * columnas; i++) {
            JPanel cuadro = new JPanel();
            cuadro.setBackground(new Color(50 + i*15, 100, 150));
            cuadro.setBorder(BorderFactory.createLineBorder(Color.white));
            this.add(cuadro);
        }
    }
}
