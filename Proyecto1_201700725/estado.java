package log;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class estado extends JFrame implements ActionListener {

     venta_remesa venta[] = new venta_remesa[10];
     venta_remesa v = new venta_remesa();
     JButton regresar = new JButton("Regresar");
    
    public estado() {
        setTitle("Sistema de Remesas");
        regresar.setBounds(500, 475, 150, 25);
        add(regresar);
        regresar.addActionListener(this);
        Object[][] datos = {};
        String[] columnNames = {"Id Remesa", "Estado", "Monto","Fecha"};
        DefaultTableModel dtm = new DefaultTableModel(datos, columnNames);
        final JTable table = new JTable(dtm);
        for (int i = 0; i < venta_remesa.conta; i++) {
            dtm.addRow(new Object[]{venta_remesa.ide[i],venta_remesa.stateca[i],venta_remesa.mon[i],venta_remesa.fechaca[i]});
        }
        table.setPreferredScrollableViewportSize(new Dimension(250, 100));
        JScrollPane scrollPane = new JScrollPane(table);
        getContentPane().add(scrollPane, BorderLayout.CENTER);
        
        
    }

     @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == regresar) {
            switch (Log.op.getSelectedItem()) {
                case "Administrador":
                    {
                        transaccion formulario = new transaccion();
                        formulario.setSize(750, 650);
                        formulario.setVisible(true);
                        formulario.setResizable(false);
                        formulario.setLocationRelativeTo(null);
                        this.dispose();
                        break;
                    }
                case "Vendedor":
                    {
                        vende formulario = new vende();
                        formulario.setSize(750, 650);
                        formulario.setVisible(true);
                        formulario.setResizable(false);
                        formulario.setLocationRelativeTo(null);
                        this.dispose();
                        break;
                    }
                case "Pagador":
                    {
                        pagador formulario = new pagador();
                        formulario.setSize(750, 650);
                        formulario.setVisible(true);
                        formulario.setResizable(false);
                        formulario.setLocationRelativeTo(null);
                        this.dispose();
                        break;
                    }
                default:
                    {
                        transaccion formulario = new transaccion();
                        formulario.setSize(750, 650);
                        formulario.setVisible(true);
                        formulario.setResizable(false);
                        formulario.setLocationRelativeTo(null);
                        this.dispose();
                        break;
                    }
            }
            
        }
    }
}
