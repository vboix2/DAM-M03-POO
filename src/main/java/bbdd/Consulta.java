
package bbdd;

import java.sql.*;


public class Consulta {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        //Carregar el controlador per la BD MySQL
        Class.forName("com.mysql.cj.jdbc.Driver");

        //Establir la connexió
        String urlBaseDades = "jdbc:mysql://localhost:3306/Contactes";
        String usuari = Claus.user;
        String contrasenya = Claus.password;
        Connection c = DriverManager.getConnection(urlBaseDades, usuari, contrasenya);

        //Enviar una sentència SQL per recuperar les dades
        Statement cerca = c.createStatement();
        ResultSet r = cerca.executeQuery("SELECT * FROM Contacte");
        while (r.next()) {
            System.out.println(r.getString("nom") + "\t" +
                               r.getString("telefon") + "\t" +
                               r.getString("email"));
        }

        //Tancar la connexió
        c.close();
    }

}
