/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BBDD;

import Usuario.Usuario;
import java.sql.*;

/**
 *
 * @author CafeConPalito
 */
public class MetodosUsuarioBBDD {

    /**
     * Metodo para buscar un usuario en la BBDD
     *
     * @param con Conexion a BBDD
     * @param usuario
     * @return boolean
     */
    public static boolean loginUsuario(Connection con, String usuario) {

        PreparedStatement ps = null;
        ResultSet rs = null;

        // se prepara la sentencia para la BBDD como un String
        String selectLogUsuario = "select nombre_usuario from usuario where nombre_usuario = ?";

        try {

            //se crear el Statement Con la conexion a la BBDD y el String
            ps = con.prepareStatement(selectLogUsuario);
            //se añade al select el nombre del usuario
            ps.setString(1, usuario);
            //se ejecuta la sentencia y devuelve un resultado
            rs = ps.executeQuery();

            //Es necesario usar el Next Para pasar a la primera Linea de la busqueda
            //una vez en la primera linea podemos obtener la informacion;
            if (rs.next() && usuario.equals(rs.getString(1))) {
                return true;
            }
            return false;

        } catch (SQLException e) {
            //System.err.println("ERROR AL LEER Login Usuario");
            return false;
        }

    }

    /**
     * Comprobar que la contraseña de un usuario coincide con la contraseña
     * cifrada de ese usuario en la BBDD
     *
     * @param con Conexion a BBDD
     * @param usuario
     * @param contrasena
     * @return boolean
     */
    public static boolean loginContrasena(Connection con, String usuario, String contrasena) {

        PreparedStatement ps = null;
        ResultSet rs = null;

        //debuelve 1 para true 0 para false
        String selectComprobarContraseña = "select if(md5(?) = (select contrasena from usuario where nombre_usuario = ?),true,false)";

        try {

            ps = con.prepareStatement(selectComprobarContraseña);
            ps.setString(1, contrasena);
            ps.setString(2, usuario);

            rs = ps.executeQuery();

            //el valor que retorna es 1 (true) o 0(false)
            if (rs.next() && "1".equalsIgnoreCase(rs.getString(1))) {
                return true;
            }

            return false;

        } catch (SQLException e) {
            //System.err.println("ERROR AL LEER Loging");
            return false;
        }

    }

    /**
     * Comprobar si el Usuario es Profesor en la BBDD
     *
     * @param con Conexion a BBDD
     * @param nombreUsuario
     * @return boolean
     */
    public static boolean comprobarEsProfesor(Connection con, String nombreUsuario) {
        PreparedStatement ps = null;
        ResultSet rs = null;

        if (!"".equalsIgnoreCase(nombreUsuario)) {

            // se prepara la sentencia para la BBDD como un String
            String selectNombreUsuario = "select profesor from persona inner join usuario using(id_usuario) where nombre_usuario = ?";

            try {

                ps = con.prepareStatement(selectNombreUsuario);
                ps.setString(1, nombreUsuario);
                rs = ps.executeQuery();

                //Es necesario usar el Next Para pasar a la primera Linea de la busqueda
                //una vez en la primera linea podemos obtener la informacion;
                //el valor que retorna es 1 (true) o 0(false)
                if (rs.next() && "1".equalsIgnoreCase(rs.getString(1))) {
                    return true;
                }

            } catch (SQLException e) {
                //System.err.println("ERROR AL LEER ES Profesor");
                return false;
            }

        }
        return false;
    }

    /**
     * Aglutina todos los metodos que cargan desde la BBDD los datos del
     * usuario. Trae el id_usuario, alias, nombre, apellido1, apellido2,
     * esProfe, el curso.
     *
     * @param con Conexion a BBDD
     */
    public static void generarUsuario(Connection con) {
        getid_usuario(con);
        getalias(con);
        getnombre(con);
        getapellido1(con);
        getapellido2(con);
        getEsProfe(con);
        getCurso(con);
    }

    /**
     * Metodo que trae desde la BBDD el id_usuario del usuario Pensado para
     * utilizar despues del Login
     *
     * @param con Conexion a BBDD
     */
    public static void getid_usuario(Connection con) {
        PreparedStatement ps = null;
        ResultSet rs = null;

        // se prepara la sentencia para la BBDD como un String
        String select = "select id_usuario from usuario where nombre_usuario = ?";

        try {

            ps = con.prepareStatement(select);
            ps.setString(1, Usuario.getUsuario());
            rs = ps.executeQuery();

            //Es necesario usar el Next Para pasar a la primera Linea de la busqueda
            //una vez en la primera linea podemos obtener la informacion;
            rs.next();
            Usuario.setIdUsuario(rs.getInt(1));

        } catch (SQLException e) {
            //System.err.println("ERROR AL LEER id_usuario");
        }
    }

    /**
     * Metodo que trae desde la BBDD el nombre del usuario Pensado para utilizar
     * despues del Login
     *
     * @param con Conexion a BBDD
     */
    public static void getnombre(Connection con) {
        PreparedStatement ps = null;
        ResultSet rs = null;

        // se prepara la sentencia para la BBDD como un String
        String select = "select nombre from persona where id_usuario = ?";

        try {

            ps = con.prepareStatement(select);
            ps.setInt(1, Usuario.getIdUsuario());
            rs = ps.executeQuery();

            //Es necesario usar el Next Para pasar a la primera Linea de la busqueda
            //una vez en la primera linea podemos obtener la informacion;
            rs.next();
            Usuario.setNombre(rs.getString(1));

        } catch (SQLException e) {
            //System.err.println("ERROR AL LEER NombreUsuario");
        }
    }

    /**
     * Metodo que trae desde la BBDD el alias del usuario Pensado para utilizar
     * despues del Login
     *
     * @param con Conexion a BBDD
     */
    public static void getalias(Connection con) {
        PreparedStatement ps = null;
        ResultSet rs = null;

        // se prepara la sentencia para la BBDD como un String
        String select = "select alias from usuario where id_usuario = ?";

        try {

            ps = con.prepareStatement(select);
            ps.setString(1, Integer.toString(Usuario.getIdUsuario()));
            rs = ps.executeQuery();

            //Es necesario usar el Next Para pasar a la primera Linea de la busqueda
            //una vez en la primera linea podemos obtener la informacion;
            rs.next();
            Usuario.setAlias(rs.getString(1));

        } catch (SQLException e) {
            //System.err.println("ERROR AL LEER alias");
        }
    }

    /**
     * Metodo que trae desde la BBDD el apellido1 del usuario Pensado para
     * utilizar despues del Login
     *
     * @param con Conexion a BBDD
     */
    public static void getapellido1(Connection con) {
        PreparedStatement ps = null;
        ResultSet rs = null;

        // se prepara la sentencia para la BBDD como un String
        String select = "select apellido1 from persona where id_usuario = ?";

        try {

            ps = con.prepareStatement(select);
            ps.setString(1, Integer.toString(Usuario.getIdUsuario()));
            rs = ps.executeQuery();

            //Es necesario usar el Next Para pasar a la primera Linea de la busqueda
            //una vez en la primera linea podemos obtener la informacion;
            rs.next();
            Usuario.setApellido1(rs.getString(1));

        } catch (SQLException e) {
            //System.err.println("ERROR AL LEER apellido1");
        }
    }

    /**
     * Metodo que trae desde la BBDD el apellido1 del usuario Pensado para
     * utilizar despues del Login
     *
     * @param con Conexion a BBDD
     */
    public static void getapellido2(Connection con) {
        PreparedStatement ps = null;
        ResultSet rs = null;

        // se prepara la sentencia para la BBDD como un String
        String select = "select apellido2 from persona where id_usuario = ?";

        try {

            ps = con.prepareStatement(select);
            ps.setString(1, Integer.toString(Usuario.getIdUsuario()));
            rs = ps.executeQuery();

            //Es necesario usar el Next Para pasar a la primera Linea de la busqueda
            //una vez en la primera linea podemos obtener la informacion;
            rs.next();
            Usuario.setApellido2(rs.getString(1));

        } catch (SQLException e) {
            //System.err.println("ERROR AL LEER apellido2");
        }
    }

    /**
     * Metodo que trae desde la BBDD si el Usuario es profesor Pensado para
     * utilizar despues del Login
     *
     * @param con Conexion a BBDD
     */
    public static void getEsProfe(Connection con) {
        PreparedStatement ps = null;
        ResultSet rs = null;

        // se prepara la sentencia para la BBDD como un String
        String select = "select profesor from persona where id_usuario = ?";

        try {

            ps = con.prepareStatement(select);
            ps.setString(1, Integer.toString(Usuario.getIdUsuario()));
            rs = ps.executeQuery();

            //Es necesario usar el Next Para pasar a la primera Linea de la busqueda
            //una vez en la primera linea podemos obtener la informacion;
            rs.next();
            if ("1".equalsIgnoreCase(rs.getString(1))) {
                Usuario.setEsProfe(true);
            } else {
                Usuario.setEsProfe(false);
            }

        } catch (SQLException e) {
            //System.err.println("ERROR AL LEER esProfe");
        }
    }

    /**
     * Metodo que trae desde la BBDD si el curso del Usuario si el usuario es
     * profesor no se realiza. Pensado para utilizar despues del Login
     *
     * @param con Conexion a BBDD
     */
    public static void getCurso(Connection con) {

        // si el usuario no es profesor trae su curso , en caso contrario el curso queda a null
        if (!Usuario.isEsProfe()) {
            PreparedStatement ps = null;
            ResultSet rs = null;

            // se prepara la sentencia para la BBDD como un String
            String select = "select curso from persona where id_usuario = ?";

            try {

                ps = con.prepareStatement(select);
                ps.setString(1, Integer.toString(Usuario.getIdUsuario()));
                rs = ps.executeQuery();

                //Es necesario usar el Next Para pasar a la primera Linea de la busqueda
                //una vez en la primera linea podemos obtener la informacion;
                rs.next();
                Usuario.setCurso(rs.getString(1));

            } catch (SQLException e) {
                //System.err.println("ERROR AL LEER Curso");
            }

        }

    }

}
