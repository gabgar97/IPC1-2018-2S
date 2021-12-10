package log;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ingreso_pais extends JFrame implements ActionListener {

    TextField nombre = new TextField();
    TextField tmoneda = new TextField();
    TextField idp = new TextField();
    TextField tcambio = new TextField();
    TextField ganancia = new TextField();
    JButton regresar = new JButton("Regresar");
    JButton cerrar = new JButton("Cerrar Sesión");
    JButton agregar = new JButton("Agregar");
    public static int[] iden = new int[10];
    public static String[] name = new String[10];
    public static String[] moneda = new String[10];
    public static float[] change = new float[10];
    public static float[] win = new float[10];
    public static float[] resta = new float[10];
    public static int conta = 0;
    public String ident, n, tm, tc, g,res;

    public ingreso_pais() {
        setTitle("Sistema de Remesas");
        setLayout(null);
        Label ip = new Label("Identificador del País:");
        ip.setBounds(200, 150, 120, 25);
        add(ip);
        idp.setBounds(340, 150, 100, 25);
        add(idp);
        Label np = new Label("Nombre del Pais:");
        np.setBounds(200, 200, 125, 25);
        add(np);
        nombre.setBounds(340, 200, 100, 25);
        add(nombre);
        Label moneda = new Label("Tipo de Moneda:");
        moneda.setBounds(200, 250, 100, 25);
        add(moneda);
        tmoneda.setBounds(340, 250, 100, 25);
        add(tmoneda);
        Label cambio = new Label("Tipo de Cambio:");
        cambio.setBounds(200, 300, 100, 25);
        add(cambio);
        tcambio.setBounds(340, 300, 100, 25);
        add(tcambio);
        Label gan = new Label("Ganancia:");
        gan.setBounds(200, 350, 70, 25);
        add(gan);
        ganancia.setBounds(340, 350, 100, 25);
        add(ganancia);
        agregar.setBounds(330, 400, 100, 25);
        add(agregar);
        regresar.setBounds(500, 475, 150, 25);
        add(regresar);
        cerrar.setBounds(500, 500, 150, 25);
        add(cerrar);
        agregar.addActionListener(this);
        cerrar.addActionListener(this);
        regresar.addActionListener(this);
    }

    public void crear() {
        for (int i = 0; i < 1; i++) {
            ident = idp.getText();
            n = nombre.getText();
            tm = tmoneda.getText();
            tc = tcambio.getText();
            g = ganancia.getText();
            iden[i + conta] = Integer.parseInt(ident);
            name[i + conta] = n;
            moneda[i + conta] = tm;
            change[i + conta] = Float.valueOf(tc);
            win[i + conta] = Float.valueOf(g);
            resta[i + conta] = Float.valueOf(tc) - Float.valueOf(g);
        }
        conta = conta + 1;
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == agregar) {
            crear();
        } else if (e.getSource() == regresar) {
            admin formulario = new admin();
            formulario.setSize(750, 650);
            formulario.setVisible(true);
            formulario.setResizable(false);
            formulario.setLocationRelativeTo(null);
            this.dispose();
        } else if (e.getSource() == cerrar) {
            Log formulario = new Log();
            formulario.setSize(750, 650);
            formulario.setVisible(true);
            formulario.setResizable(false);
            formulario.setLocationRelativeTo(null);
            this.dispose();
        }

    }
}
