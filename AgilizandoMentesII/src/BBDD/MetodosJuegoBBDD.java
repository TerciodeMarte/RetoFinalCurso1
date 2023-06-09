/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BBDD;

import Usuario.Usuario;
import java.sql.*;
import java.util.ArrayList;


/**
 *
 * @author CafeConPalito
 */
public class MetodosJuegoBBDD {

    /**
     * Inserta en la BBDD la puntuacion del jugador para el juego Resto Division
     *
     * @param con Conexion con la BBDD
     * @param aciertos se pasan los aciertos del jugador
     * @param tiempo_partida se pasan los segundos como entero
     * @param nombreJuego nombre del juego
     * @param nivel Nivel del juego
     */
    public static void insertResultado(Connection con, int aciertos, int tiempo_partida, String nombreJuego, int nivel) {
        PreparedStatement ps = null;
        PreparedStatement psBusqueda = null;
        ResultSet rs = null;

        //SQL
        String select = "select id_reto from reto where nombre_reto = ? and nivel = ?";
        String insert = "insert into " + nombreJuego + "(jugador,reto,aciertos,tiempo_partida) values (?,?,?,sec_to_time(?))";

        try {

            //ejecuta esta sentencia para buscar ID del reto corresponde con el jugador. Pensado por si añadimos mas cosas al mismo reto 
            psBusqueda = con.prepareStatement(select);
            psBusqueda.setString(1, nombreJuego);
            psBusqueda.setInt(2, nivel);
            rs = psBusqueda.executeQuery();
            // si existe reto para ese jugador lo inserta.
            if (rs.next()) {
                ps = con.prepareStatement(insert);
                ps.setInt(1, Usuario.getIdUsuario());
                ps.setString(2, rs.getString(1));
                ps.setInt(3, aciertos);
                ps.setInt(4, tiempo_partida);

                //CUANDO REALIZAMOS UNA INSERT SE UTILIZA EXECUTE UPDATE
                ps.executeUpdate();

            } else {
                System.err.println("FALLO EN LA BUSQUEDA, ERROR AL INSERTAR DATOS");
            }

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }

    }

    /**
     * Busca en la BBDD las mejores 5 partidas del jugador y las ordena de mejor
     * a peor 1º por puntos luego por tiempo.
     *
     * @param con Conexion con la BBDD
     * @param nombreJuego Nombre del Juego
     * @param nivel Nivel del Juego
     * @return ArrayList con las 5 mejores partidas del jugador en ese nivel
     */
    public static ArrayList selectJugadorMejoresPartidas(Connection con, String nombreJuego ,int nivel) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<ObjetoJuegoBBDD> lista = new ArrayList();

        //SQL
        String select = "select alias, tiempo_partida, aciertos, fecha_hora from view_" + nombreJuego + "_tablas where id_usuario = ?  and nivel = ? order by aciertos desc, tiempo_partida asc limit 5";

        try {

            ps = con.prepareStatement(select);
            ps.setInt(1, Usuario.getIdUsuario());
            ps.setInt(2, nivel);

            rs = ps.executeQuery();

            while (rs.next()) {
                ObjetoJuegoBBDD jugador = new ObjetoJuegoBBDD(rs.getString(1), rs.getInt(2), rs.getInt(3), rs.getString(4));
                lista.add(jugador);
            }

        } catch (SQLException ex) {
            System.err.println("Error selectJugadorMejoresPartidas");
        }

        return lista;

    }

    /**
     * Busca en la BBDD las ultimas 5 partidas de el jugador
     *
     * @param con Conexion con la BBDD
     * @param nombreJuego Nombre del Juego
     * @param nivel Nivel del Juego
     * @return ArrayList con las 5 ultimas partidas del jugador en ese nivel
     */
    public static ArrayList selectJugadorUltimasPartidas(Connection con, String nombreJuego,int nivel) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<ObjetoJuegoBBDD> lista = new ArrayList();

        //Variable nombre del juego
        //String nombreJuego = "RestoDiv";
        //SQL
        String select = "select alias, tiempo_partida, aciertos, fecha_hora from view_" + nombreJuego + "_tablas where id_usuario = ? and  nivel = ? order by fecha_hora desc limit 5";

        try {

            ps = con.prepareStatement(select);
            ps.setInt(1, Usuario.getIdUsuario());
            ps.setInt(2, nivel);

            rs = ps.executeQuery();

            while (rs.next()) {
                //System.out.println(rs.getString(1) + " " + rs.getInt(2)+ " " + rs.getInt(3)+ " " + rs.getString(4));
                ObjetoJuegoBBDD jugador = new ObjetoJuegoBBDD(rs.getString(1), rs.getInt(2), rs.getByte(3), rs.getString(4));
                lista.add(jugador);
            }

        } catch (SQLException ex) {
            System.err.println("Error selectJugadorUltimasPartidas");
        }

        return lista;
    }

    /**
     * Busca en la BBDD las 5 mejores puntuaciones de todos los jugadores en el
     * nivel del Usuario
     *
     * @param con Conexion con la BBDD
     * @param nombreJuego Nombre del Juego
     * @param nivel Nivel del Juego
     * @return ArrayList con los 5 mejores calificados de todos los Jugadores en ese nivel
     */
    public static ArrayList selectClasificacion(Connection con, String nombreJuego, int nivel) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<ObjetoJuegoBBDD> lista = new ArrayList();

        //SQL
        String select = "select alias, tiempo_partida, aciertos, fecha_hora from view_"+nombreJuego+"_tablas where nivel = ?  order by aciertos desc, tiempo_partida asc limit 5;";

        try {

            //si encuentra resultado del reto de ese jugador busca la info
            ps = con.prepareStatement(select);
            ps.setInt(1, nivel);

            rs = ps.executeQuery();

            while (rs.next()) {
                ObjetoJuegoBBDD jugador = new ObjetoJuegoBBDD(rs.getString(1), rs.getInt(2), rs.getInt(3), rs.getString(4));
                lista.add(jugador);

            }

        } catch (SQLException ex) {
            System.err.println("Error selectClasificacion");

        }

        return lista;
    }
    /**
     * Busca en la BBDD el total de partidas del Jugador en ese nivel
     * @param con Conexion a la Base de datos
     * @param nombreJuego Nombre del Juego
     * @param nivel nivel del Juego
     * @return Devuelve String con la cantidad de partidas jugadas en ese nivel
     */
    public static String totalPartidas(Connection con, String nombreJuego, int nivel) {
        String totalPartidas = "0";

        PreparedStatement ps = null;
        ResultSet rs = null;

        //SQL
        String select = "SELECT partidas FROM estadisticas_" +nombreJuego+ " where jugador = ? and nivel = ?";

        try {

            ps = con.prepareStatement(select);
            ps.setInt(1, Usuario.getIdUsuario());
            ps.setInt(2, nivel);

            rs = ps.executeQuery();

            while (rs.next()) {
                totalPartidas = rs.getString(1);
            }

        } catch (SQLException ex) {

        }

        return totalPartidas;
    }

    /**
     * Busca en la BBDD la media de aciertos del Jugador en ese nivel
     * @param con Conexion a la BBDD
     * @param nombreJuego nombre del juego
     * @param nivel nivel del juego
     * @return Devuelve un String con la media de aciertos del Jugador
     */
    public static String mediaAciertos(Connection con, String nombreJuego, int nivel) {
        String mediaAciertos = "0";

        PreparedStatement ps = null;
        ResultSet rs = null;

        //SQL
        String select = "SELECT mediaAciertos FROM estadisticas_" + nombreJuego + " where jugador = ? and nivel = ?";

        try {

            ps = con.prepareStatement(select);
            ps.setInt(1, Usuario.getIdUsuario());
            ps.setInt(2, nivel);

            rs = ps.executeQuery();

            while (rs.next()) {
                mediaAciertos = rs.getString(1);
            }

        } catch (SQLException ex) {

        }

        return mediaAciertos;
    }

}
