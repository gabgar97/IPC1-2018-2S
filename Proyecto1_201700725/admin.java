package log;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class admin extends JFrame implements ActionListener {

    JButton crear = new JButton("Crear Usuarios");
    JButton pais = new JButton("Agregar Pais y Porcentaje");
    JButton trans = new JButton("Hacer Transacción");
    JButton cerrar = new JButton("Cerrar Sesión");
    JButton configuracion = new JButton("Configuración");
    JButton mremitente = new JButton("Modulo de Remitente");
    JButton mbeneficiario = new JButton("Modulo de Beneficiario");
    JButton estadistica = new JButton("Estadistica");
    JButton modificar = new JButton("Modificar o Eliminar Usuario");

    public admin() {
        setTitle("Sistema de Remesas");
        setLayout(null);
        crear.setBounds(300, 100, 170, 25);
        pais.setBounds(300, 150, 170, 25);
        trans.setBounds(300, 200, 170, 25);
        configuracion.setBounds(300, 250, 170, 25);
        mremitente.setBounds(300, 300, 170, 25);
        mbeneficiario.setBounds(300, 350, 170, 25);
        estadistica.setBounds(300, 400, 170, 25);
        modificar.setBounds(300, 450, 170, 25);
        cerrar.setBounds(500, 550, 150, 25);

        crear.addActionListener(this);
        pais.addActionListener(this);
        trans.addActionListener(this);
        configuracion.addActionListener(this);
        mremitente.addActionListener(this);
        mbeneficiario.addActionListener(this);
        estadistica.addActionListener(this);
        modificar.addActionListener(this);
        cerrar.addActionListener(this);
        add(crear);
        add(pais);
        add(trans);
        add(configuracion);
        add(mremitente);
        add(mbeneficiario);
        add(estadistica);
        add(modificar);
        add(cerrar);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == crear) {
            user formulario = new user();
            formulario.setSize(750, 650);
            formulario.setVisible(true);
            formulario.setResizable(false);
            formulario.setLocationRelativeTo(null);
            this.dispose();
        } else if (e.getSource() == pais) {
            ingreso_pais formulario = new ingreso_pais();
            formulario.setSize(750, 650);
            formulario.setVisible(true);
            formulario.setResizable(false);
            formulario.setLocationRelativeTo(null);
            this.dispose();
        } else if (e.getSource() == trans) {
            transaccion formulario = new transaccion();
            formulario.setSize(750, 650);
            formulario.setVisible(true);
            formulario.setResizable(false);
            formulario.setLocationRelativeTo(null);
            this.dispose();
        } else if (e.getSource() == configuracion) {
            configuracion formulario = new configuracion();
            formulario.setSize(750, 650);
            formulario.setVisible(true);
            formulario.setResizable(false);
            formulario.setLocationRelativeTo(null);
            this.dispose();
        } else if (e.getSource() == mremitente) {
            mod_remi formulario = new mod_remi();
            formulario.setSize(750, 650);
            formulario.setVisible(true);
            formulario.setResizable(false);
            formulario.setLocationRelativeTo(null);
            this.dispose();
        } else if (e.getSource() == mbeneficiario) {
            mod_beni formulario = new mod_beni();
            formulario.setSize(750, 650);
            formulario.setVisible(true);
            formulario.setResizable(false);
            formulario.setLocationRelativeTo(null);
            this.dispose();
        } else if (e.getSource() == estadistica) {
            estadisticas formulario = new estadisticas();
            formulario.setSize(750, 650);
            formulario.setVisible(true);
            formulario.setResizable(false);
            formulario.setLocationRelativeTo(null);
            this.dispose();
        } else if (e.getSource() == modificar) {
            modi_elim formulario = new modi_elim();
            formulario.setSize(750, 650);
            formulario.setVisible(true);
            formulario.setResizable(false);
            formulario.setLocationRelativeTo(null);
            this.dispose();
        } else if (e.getSource() == cerrar) {
            Log formulario;
            formulario = new Log();
            formulario.setSize(750, 650);
            formulario.setVisible(true);
            formulario.setResizable(false);
            formulario.setLocationRelativeTo(null);
            this.dispose();
        }
    }

}
