package log;

import java.awt.*;
import java.awt.event.*;
import java.util.Date;
import javax.swing.*;

public class cancelar_venta extends JFrame implements ActionListener {

    Date ahora = new Date();
    Choice remi = new Choice();
    TextField idus = new TextField();
    TextArea mot = new TextArea();
    JButton aceptar = new JButton("Aceptar");
    JButton cancelar = new JButton("Cancelar");
    public static int conta = 0;
    public static int[] remesas = new int[10];
    public static int[] ru = new int[10];
    public static String[] moti = new String[10];
    public static Date[] fecha = new Date[10];
    String remesa, usuario, motiv;

    public cancelar_venta() {
        setTitle("Sistema de Remesas");
        setLayout(null);
        Label id = new Label("Id Remesa:");
        id.setBounds(270, 200, 90, 25);
        add(id);
        remi.add("Seleccione Id");
        for (int i = 0; i < venta_remesa.conta; i++) {
            remi.add("" + venta_remesa.ide[i]);
        }
        remi.setBounds(370, 200, 100, 25);
        add(remi);
        Label idu = new Label("Id Usuario:");
        idu.setBounds(270, 250, 100, 25);
        add(idu);
        idus.setBounds(370, 250, 50, 25);
        add(idus);
        Label motivo = new Label("Motivo:");
        motivo.setBounds(270, 300, 70, 25);
        add(motivo);
        mot.setBounds(370, 300, 200, 75);
        add(mot);
        cancelar.setBounds(290, 390, 90, 25);
        add(cancelar);
        aceptar.setBounds(390, 390, 90, 25);
        add(aceptar);
        aceptar.addActionListener(this);
        cancelar.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {
        remesa = remi.getSelectedItem();
        usuario = idus.getText();
        motiv = mot.getText();

        if (e.getSource() == aceptar) {
            venta_remesa.stateca[Integer.parseInt(remesa)] = "Cancelado";
            venta_remesa.fechaca[Integer.parseInt(remesa)] = ahora;

            for (int i = 0; i < 1; i++) {
                remesas[i + conta] = Integer.valueOf(remesa);
                ru[i + conta] = Integer.valueOf(usuario);
                moti[i + conta] = motiv;
                fecha[i + conta] = ahora;
            }
            conta = conta + 1;
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
        } else if(e.getSource() == cancelar){
            if (e.getSource() == cancelar) {
            if (JOptionPane.showConfirmDialog(null, "Desea Salir Si o No", "mensaje", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
                if (Log.op.getSelectedItem().equals("Administrador")) {
                transaccion formulario = new transaccion();
                formulario.setSize(750, 650);
                formulario.setVisible(true);
                formulario.setResizable(false);
                formulario.setLocationRelativeTo(null);
                this.dispose();
            } else if (Log.op.getSelectedItem().equals("Vendedor")) {
                vende formulario = new vende();
                formulario.setSize(750, 650);
                formulario.setVisible(true);
                formulario.setResizable(false);
                formulario.setLocationRelativeTo(null);
                this.dispose();
            }
            }
        }
        }
    }
}
