
package bbdd;

import java.sql.*;


public class Insercio {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
        //Carregar el controlador per la BD MySQL
        Class.forName("com.mysql.cj.jdbc.Driver");

        //Establir la connexió
        String urlBaseDades = "jdbc:mysql://localhost:3306/Contactes";
        String usuari = Claus.user;
        String contrasenya = Claus.password;
        Connection c = DriverManager.getConnection(urlBaseDades, usuari, contrasenya);

        //Enviar una sentència SQL per inserir o actualitzar dades
        Statement cerca = c.createStatement();
        String sentencia = "INSERT INTO Contacte (nom, telefon, email) VALUES ('Víctor','111222333','vboix@correu.com')";
        int n = cerca.executeUpdate(sentencia);
        System.out.println("Correcte");

        //Tancar la connexió
        c.close();
    }

}
