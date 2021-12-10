package log;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class estadisticas extends JFrame implements ActionListener {

    JButton presentar = new JButton("Información Ventas");
    JButton presentar1 = new JButton("Información Pagos");
    JButton presentar2 = new JButton("Información Cancelación Ventas");
    JButton presentar3 = new JButton("Información Cancelación Pagos");
    JButton regresar = new JButton("Regresar");
    float conta = 0, conta1=0;

    public estadisticas() {
        setTitle("Sistema de Remesas");
        setLayout(null);
        presentar.setBounds(300, 100, 200, 25);
        presentar1.setBounds(300, 150, 200, 25);
        presentar2.setBounds(300, 200, 200, 25);
        presentar3.setBounds(300, 250, 200, 25);
        regresar.setBounds(500, 500, 100, 25);
        add(presentar);
        add(presentar1);
        add(presentar2);
        add(presentar3);
        add(regresar);
        presentar.addActionListener(this);
        presentar1.addActionListener(this);
        presentar2.addActionListener(this);
        presentar3.addActionListener(this);
        regresar.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == presentar) {
            FileWriter archivo = null;
            try {
                archivo = new FileWriter("estadisticas.html");
                PrintWriter ar = new PrintWriter(archivo);

                ar.println("<html>"
                        + "<title>Sistema de Remesas</title>"
                        + "<body background=finanza.jpg size=cover>"
                        + "<center><table border= 3 location= center>"
                        + "<caption align=top><font color=white>INFORMACION DE LAS VENTAS</font></caption>"
                        + "<tr>"
                        + "<td bgcolor=white><center>Id Remesa:</center></td>"
                        + "<td bgcolor=white><center>Id Remitente:</center></td>"
                        + "<td bgcolor=white><center>Id Beneficiario:</center></td>"
                        + "<td bgcolor=white><center>Pais:</center></td>"
                        + "<td bgcolor=white><center>Monto:</center></td>"
                        + "<td bgcolor=white><center>Fecha de Venta:</center></td>"
                        + "</tr>");
                for (int i = 0; i < venta_remesa.conta; i++) {
                    conta = conta + venta_remesa.mon[i];
                    ar.println("<tr>"
                            + "<td bgcolor=white><center>" + venta_remesa.ide[i] + "</center></td>"
                            + "<td bgcolor=white><center>" + venta_remesa.idre[i] + "</center></td>"
                            + "<td bgcolor=white><center>" + venta_remesa.idbe[i] + "</center></td>"
                            + "<td bgcolor=white><center>" + venta_remesa.pais[i] + "</center></td>"
                            + "<td bgcolor=white><center>" + venta_remesa.mon[i] + "</center></td>"
                            + "<td bgcolor=white><center>" + venta_remesa.fecha[i] + "</center></td>"
                            + "</tr>");
                }
                ar.println(""
                        + "<tr>"
                        + "<td colspan=4  bgcolor=white><center>TOTAL DE VENTAS:</center></td>"
                        + "<td colspan=2  bgcolor=white><center>"+conta+"</center></td>"
                        + "</tr>"
                        + "</table></center>"
                        + "</body>"
                        + "</html>");

                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + "estadisticas.html");

            } catch (IOException ex) {
                Logger.getLogger(estadisticas.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    archivo.close();
                } catch (IOException ex) {
                    Logger.getLogger(estadisticas.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else if (e.getSource() == presentar1) {
            FileWriter archivo = null;
            try {
                archivo = new FileWriter("estadisticas1.html");
                PrintWriter ar = new PrintWriter(archivo);

                ar.println("<html>"
                        + "<title>Sistema de Remesas</title>"
                        + "<body background=finanza.jpg>"
                        + "<center><table border= 3 location= center>"
                        + "<caption align=top><font color=white>INFORMACION DE LOS PAGOS</font></caption>"
                        + "<tr>"
                        + "<td bgcolor=white><center>Id Remesa:</center></td>"
                        + "<td bgcolor=white><center>Id Remitente:</center></td>"
                        + "<td bgcolor=white><center>Id Beneficiario:</center></td>"
                        + "<td bgcolor=white><center>Monto:</center></td>"
                        + "<td bgcolor=white><center>Fecha de Pago:</center></td>"
                        + "</tr>");
                for (int i = 0; i < pago.conta; i++) {
                    conta1 = conta1 + pago.pagar[i];
                    ar.println("<tr>"
                            + "<td bgcolor=white><center>" + pago.idr[i] + "</center></td>"
                            + "<td bgcolor=white><center>" + pago.idre[i] + "</center></td>"
                            + "<td bgcolor=white><center>" + pago.idbe[i] + "</center></td>"
                            + "<td bgcolor=white><center>" + pago.pagar[i] + "</center></td>"
                            + "<td bgcolor=white><center>" + pago.fecha[i] + "</center></td>"
                            + "</tr>");
                }
                ar.println(""
                        + "<tr>"
                        + "<td colspan=4 bgcolor=white><center>TOTAL DE PAGOS:</center></td>"
                        + "<td colspan=2 bgcolor=white><center>"+conta1+"</center></td>"
                        + "</tr>"
                        + "</table></center>"
                        + "</body>"
                        + "</html>");

                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + "estadisticas1.html");

            } catch (IOException ex) {
                Logger.getLogger(estadisticas.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    archivo.close();
                } catch (IOException ex) {
                    Logger.getLogger(estadisticas.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else if (e.getSource() == presentar2) {
            FileWriter archivo = null;
            try {
                archivo = new FileWriter("estadisticas2.html");
                PrintWriter ar = new PrintWriter(archivo);

                ar.println("<html>"
                        + "<title>Sistema de Remesas</title>"
                        + "<body background=finanza.jpg>"
                        + "<center><table border= 3 location= center>"
                        + "<caption align=top><font color=white>CANCELACION DE LAS VENTAS</font></caption>"
                        + "<tr>"
                        + "<td bgcolor=white><center>Id Remesa:</center></td>"
                        + "<td bgcolor=white><center>Id Usuario:</center></td>"
                        + "<td bgcolor=white><center>Motivo:</center></td>"
                        + "<td bgcolor=white><center>Fecha de Cancelación:</center></td>"
                        + "</tr>");
                for (int i = 0; i < cancelar_venta.conta; i++) {
                    ar.println("<tr>"
                            + "<td bgcolor=white><center>" + cancelar_venta.remesas[i] + "</center></td>"
                            + "<td bgcolor=white><center>" + cancelar_venta.ru[i] + "</center></td>"
                            + "<td bgcolor=white><center>" + cancelar_venta.moti[i] + "</center></td>"
                            + "<td bgcolor=white><center>" + cancelar_venta.fecha[i] + "</center></td>"
                            + "</tr>");
                }
                ar.println(""
                        + "</table></center>"
                        + "</body>"
                        + "</html>");

                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + "estadisticas2.html");

            } catch (IOException ex) {
                Logger.getLogger(estadisticas.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    archivo.close();
                } catch (IOException ex) {
                    Logger.getLogger(estadisticas.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else if (e.getSource() == presentar3) {
            FileWriter archivo = null;
            try {
                archivo = new FileWriter("estadisticas3.html");
                PrintWriter ar = new PrintWriter(archivo);

                ar.println("<html>"
                        + "<title>Sistema de Remesas</title>"
                        + "<body background=finanza.jpg>"
                        + "<center><table border= 3 location= center>"
                        + "<caption align=top><font color=white>CANCELACION DE LOS PAGOS</font></caption>"
                        + "<tr>"
                        + "<td bgcolor=white><center>Id Remesa:</center></td>"
                        + "<td bgcolor=white><center>Id Usuario:</center></td>"
                        + "<td bgcolor=white><center>Motivo:</center></td>"
                        + "<td bgcolor=white><center>Fecha de Venta:</center></td>"
                        + "</tr>");
                for (int i = 0; i < cancelar_venta.conta; i++) {
                    ar.println("<tr>"
                            + "<td bgcolor=white><center>" + cancelar_pago.remesas[i] + "</center></td>"
                            + "<td bgcolor=white><center>" + cancelar_pago.ru[i] + "</center></td>"
                            + "<td bgcolor=white><center>" + cancelar_pago.moti[i] + "</center></td>"
                            + "<td bgcolor=white><center>" + cancelar_pago.fecha[i] + "</center></td>"
                            + "</tr>");
                }
                ar.println(""
                        + "</table></center>"
                        + "</body>"
                        + "</html>");

                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + "estadisticas3.html");

            } catch (IOException ex) {
                Logger.getLogger(estadisticas.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    archivo.close();
                } catch (IOException ex) {
                    Logger.getLogger(estadisticas.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else if(e.getSource() == regresar){
            switch (Log.op.getSelectedItem()) {
                case "Administrador":
                    {
                        admin formulario = new admin();
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
