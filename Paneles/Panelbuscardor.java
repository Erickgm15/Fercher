package Paneles;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

public class Panelbuscardor {
    private JPanel panelBanner;

    public Panelbuscardor() {
        this.panelBanner = new JPanel();
        panelBanner.setPreferredSize(new Dimension(200,800));
        panelBanner.setOpaque(true);
        panelBanner.setBackground(Color.GRAY);
    }
    public JPanel getBanner(){
        return panelBanner;
    }
}