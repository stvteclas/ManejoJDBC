package datos;

import domain.Persona;
import datos.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static datos.Conexion.*;

public class PersonaDAO {
    private static final String SQL_SELECT= "SELECT id_persona, nombre, apellido, email, telefono FROM persona";

    public List<Persona> seleccionar(){
        Connection conn=null;
        PreparedStatement stmt= null;
        ResultSet rs = null;
        Persona persona= null;
        List<Persona> personas = new ArrayList<>();

        try {
            conn = getConnection();
            stmt =conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()){
                int idPersona=rs.getInt("id_persona");
                String nombre= rs.getString("nombre");
                String apellido=rs.getString("apellido");
                String email=rs.getString("email");
                String telefono=rs.getString("telefono");

                persona = new Persona(idPersona,nombre,apellido, email, telefono);

                personas.add(persona);
            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        finally {
            try {
                Conexion.close(rs);
                Conexion.close(stmt);
                Conexion.close(conn);

            } catch (SQLException e) {
                e.printStackTrace(System.out);
            }

        }
        return personas;


    }
}
