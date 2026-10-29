
package dao;

import modelo.Empleado;
import conexion.ConexionDB;
import java.sql.*;
import java.util.ArrayList;

public class EmpleadoDAO {

    public ArrayList<Empleado> listarActivos() {

        ArrayList<Empleado> lista = new ArrayList<>();

        String sql = "SELECT idEmpleado, Nombre, Apellido, "
                + "salario, estado "
                + "FROM empleados "
                + "WHERE estado = 'ACTIVO'";

        try (Connection con = ConexionDB.getConexion();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {

                Empleado emp = new Empleado();

                emp.setIdEmpleado(rs.getInt("idEmpleado"));
                emp.setNombre(rs.getString("Nombre"));
                emp.setApellido(rs.getString("Apellido"));
                emp.setSalarioBase(rs.getDouble("salario"));
                emp.setEstado(rs.getString("estado"));

                lista.add(emp);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }

   public boolean insertarEmpleado(Empleado emp) {

    String sql = "INSERT INTO dbo.empleados "
            + "(nombre, apellido, salario, estado) "
            + "VALUES (?, ?, ?, ?)";

    try (Connection con = ConexionDB.getConexion();
         PreparedStatement ps = con.prepareStatement(sql)) {

        ps.setString(1, emp.getNombre());
        ps.setString(2, emp.getApellido());
        ps.setDouble(3, emp.getSalarioBase());
        ps.setString(4, "ACTIVO");

        int filas = ps.executeUpdate();

        return filas > 0;

    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
}
}
