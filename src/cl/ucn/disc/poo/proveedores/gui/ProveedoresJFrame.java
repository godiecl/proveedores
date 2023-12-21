package cl.ucn.disc.poo.proveedores.gui;

import jiconfont.icons.font_awesome.FontAwesome;
import jiconfont.swing.IconFontSwing;

import javax.swing.*;

/**
 * The Form of Proveedores.
 *
 * @author Programacion Orientada al Objeto.
 */
public final class ProveedoresJFrame extends JFrame {

    private JPanel pnlContent;
    private JPanel pnlTop;
    private JLabel lblTitle;
    private JPanel pnlProveedor;
    private JTextField txtRut;
    private JTextField txtNombre;
    private JTextField txtDireccion;
    private JTextField txtTelefono;
    private JPanel pnlTable;
    private JButton bntNew;
    private JButton btnSave;
    private JButton btnDelete;
    private JTable tblProveedores;
    private JPanel pnlStatus;
    private JLabel lblSize;

    /**
     * The model of Proveedores.
     */
    private final ProveedoresModel proveedoresModel = new ProveedoresModel();

    /**
     * The Constructor.
     */
    public ProveedoresJFrame() {
        super("Proveedores v1.0.1");

        // the content panel
        this.getContentPane()
            .add(this.pnlContent);

        // default close
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // the size
        this.setSize(800, 600);

        // no redimensionable
        // this.setResizable(false);

        // title
        this.lblTitle.putClientProperty("FlatLaf.styleClass", "h1");

        // text
        this.txtRut.putClientProperty("FlatLaf.styleClass", "monospaced");
        this.txtNombre.putClientProperty("FlatLaf.styleClass", "monospaced");
        this.txtDireccion.putClientProperty("FlatLaf.styleClass", "monospaced");
        this.txtTelefono.putClientProperty("FlatLaf.styleClass", "monospaced");

        // icons
        Icon iconUser = IconFontSwing.buildIcon(FontAwesome.USER, 40);
        this.lblTitle.setIcon(iconUser);

        Icon iconNew = IconFontSwing.buildIcon(FontAwesome.PLUS_SQUARE_O, 18);
        this.bntNew.setIcon(iconNew);

        Icon iconSave = IconFontSwing.buildIcon(FontAwesome.FLOPPY_O, 18);
        this.btnSave.setIcon(iconSave);

        Icon iconDelete = IconFontSwing.buildIcon(FontAwesome.TRASH_O, 18);
        this.btnDelete.setIcon(iconDelete);

        // the model
        this.tblProveedores.setModel(this.proveedoresModel);

        // the new button
        this.bntNew.addActionListener(event -> {
            // FIXME: agregar el codigo para insertar un Proveedor
        });

        this.btnSave.addActionListener(event -> {
            // TODO: agregar codigo para guardar los proveedores el el archivo
        });

        this.btnDelete.addActionListener(event -> {

            // hay una fila seleccionada
            if (this.tblProveedores.getSelectedRow() != -1) {
                // TODO: agregar codigo para borrar el elemento seleccionado
                System.out.println("Fila seleccionada: " + this.tblProveedores.getSelectedRow());
            }

        });

        // re-layout the size
        // this.pack();

        // center in screen
        this.setLocationRelativeTo(null);


    }

}
