/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Jairo Ortega
 */
public class Empleado {
     private int idEmpleado;
    private String nombre;
    private String apellido;
    private double salarioBase;
    private String estado;

    // Constructor vacío
    public Empleado() { }

    // Constructor con parámetros
    public Empleado(int idEmpleado, String nombre,String apellido, double salarioBase,String estado) {

        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salarioBase = salarioBase;
        this.estado = estado;
    }

    // GET y SET de idEmpleado
    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    // GET y SET de nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // GET y SET de apellido
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    // GET y SET de salarioBase
    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    // GET y SET de estado
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    // Método toString
    @Override
    public String toString() {
        return idEmpleado + " - " + nombre + " - " + apellido;
    }
}