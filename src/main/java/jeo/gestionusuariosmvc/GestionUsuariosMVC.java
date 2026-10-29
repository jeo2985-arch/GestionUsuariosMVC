package jeo.gestionusuariosmvc;

import vista.FrmEmpleado;

public class GestionUsuariosMVC {

     public static void main(String[] args) {

        java.awt.EventQueue.invokeLater(() -> {

            FrmEmpleado formulario = new FrmEmpleado();

            formulario.setLocationRelativeTo(null);

            formulario.setVisible(true);

        });
    }
}