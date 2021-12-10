package log;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class configuracion extends JFrame implements ActionListener {

    TextField pago = new TextField();
    TextField compra = new TextField();
    JButton aceptar = new JButton("Aceptar");
    JButton cancelar = new JButton("Cancelar");
    public static float[] lcompra = new float[1];
    public static float[] lpago = new float[1];
    public String rcompra, rpago;
    public static int conta = 0;

    public configuracion() {
        setTitle("Sistema de Remesas");
        setLayout(null);
        Label comp = new Label("Limite de Venta ($):");
        comp.setBounds(200, 200, 150, 25);
        add(comp);
        compra.setBounds(350, 200, 90, 25);
        add(compra);
        Label pag = new Label("Limite de Pago ($)");
        pag.setBounds(200, 250, 150, 25);
        add(pag);
        pago.setBounds(350, 250, 90, 25);
        add(pago);
        cancelar.setBounds(230, 300, 90, 25);
        add(cancelar);
        aceptar.setBounds(330, 300, 90, 25);
        add(aceptar);
        cancelar.addActionListener(this);
        aceptar.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cancelar) {
            if (JOptionPane.showConfirmDialog(null, "Desea Salir Si o No", "mensaje", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
                admin formulario = new admin();
                formulario.setSize(750, 650);
                formulario.setVisible(true);
                formulario.setResizable(false);
                formulario.setLocationRelativeTo(null);
                this.dispose();
            }
        } else if (e.getSource() == aceptar) {
            rcompra = compra.getText();
            rpago = pago.getText();
            if (Float.valueOf(rcompra) > 5000 || Float.valueOf(rpago) > 5000) {
                JOptionPane.showMessageDialog(null, "Solo se pueden Configurar Montos Menores o Iguales a $5000.°°");
            } else {
                for (int i = 0; i < 1; i++) {
                    lcompra[i + conta] = Float.valueOf(rcompra);
                    lpago[i + conta] = Float.valueOf(rpago);
                }
                conta = conta + 1;

                for (int i = 0; i < conta; i++) {
                    System.out.print("Limite Compra: " + lcompra[i] + " Limite Pago: " + lpago[i]);
                }

                admin formulario = new admin();
                formulario.setSize(750, 650);
                formulario.setVisible(true);
                formulario.setResizable(false);
                formulario.setLocationRelativeTo(null);
                this.dispose();
            }
        }
    }
}
