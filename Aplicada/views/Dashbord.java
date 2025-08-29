package views;

import java.awt.BorderLayout;
import javax.swing.*;
import Paneles.Panelbuscardor;
import Paneles.Buscarpanel;
import Paneles.Panelcuadros;

public class Dashbord extends JFrame {

    public Dashbord() {
        this.setTitle("Productos");
        this.setSize(1000, 800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.setLocationRelativeTo(null);

        // Crear PanelBuscador
        Panelbuscardor panelBuscador = new Panelbuscardor();

        // Crear BuscarPanel
        Buscarpanel buscarPanel = new Buscarpanel();

        // Agregar el panel de búsqueda al banner
        panelBuscador.getBanner().add(buscarPanel);

        // Agregar al JFrame
        this.add(panelBuscador.getBanner(), BorderLayout.WEST);

        // Crear PanelCuadros
        Panelcuadros panelCuadros = new Panelcuadros(2, 4);
        this.add(panelCuadros, BorderLayout.CENTER);
    }
}
