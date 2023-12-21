package cl.ucn.disc.poo.proveedores.gui;

import javax.swing.table.AbstractTableModel;
import java.util.Arrays;
import java.util.List;

/**
 * The Model of Proveedores.
 *
 * @author Programacion Orientada al Objeto.
 */
public final class ProveedoresModel extends AbstractTableModel {

    /**
     * El proveedor del listado de proveedores.
     */
    // TODO: agregar el proveedor.

    /**
     * The Columnas.
     */
    private static final List<String> COLS = Arrays.asList(
            "RUT", // 0
            "Nombre", // 1
            "Direccion", // 2
            "Telefono" // 3
    );

    /**
     * {@inheritDoc}
     */
    @Override
    public int getRowCount() {
        // TODO: preguntar al proveedor el numero de filas
        return 10;
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public int getColumnCount() {
        return COLS.size();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getColumnName(int column) {
        return COLS.get(column);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        // TODO: obtener los valores de fila y columna indicados
        return "Datos";
    }
}
