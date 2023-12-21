package cl.ucn.disc.poo.proveedores;

import cl.ucn.disc.poo.proveedores.gui.ProveedoresJFrame;
import com.formdev.flatlaf.FlatLightLaf;
import jiconfont.icons.font_awesome.FontAwesome;
import jiconfont.swing.IconFontSwing;

import javax.swing.*;
import java.awt.*;

/**
 * The Main.
 *
 * @author Programacion Orientada al Objeto.
 */
public final class Main {

    /**
     * The main.
     */
    public static void main(String[] args) {

        // run in the swing thread
        SwingUtilities.invokeLater(() -> {

            // look & feel: https://www.formdev.com/flatlaf/
            FlatLightLaf.setup();

            // setup fonts
            IconFontSwing.register(FontAwesome.getIconFont());


            // show the jframe
            new ProveedoresJFrame().setVisible(true);

        });

    }

}
