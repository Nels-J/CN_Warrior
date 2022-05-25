package database;

import java.sql.*;

public class DbConnection {

    public void loadDatabase() {

        try {
            // 0 get a jdbc driver (installed from maven)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 1 get connection to db
            Connection dbConnexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/dndDB", "userdb", "userdbpwd!");

            //FIXME ajouter un return de la connexion qui sera un paramètre


            //TODO a dispatcher ds d'autres classes là ou cela sera utile. 2 à 4

            // 2 create a statement
            Statement myStatement = dbConnexion.createStatement();

            // 3 execute sql query
            ResultSet myResult = myStatement.executeQuery("SELECT * from hero_table");

            // 4 process result set
            while (myResult.next()) {
                System.out.println("Record: ID: " + myResult.getString("hero_id") + ", Name: "+ myResult.getString("hero_name") + ", Hero type: " + myResult.getString("hero_type") + ", Life: " + myResult.getString("hero_life") + ", Strength: " + myResult.getString("hero_strength"));
            }

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            System.out.println("Finish");
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}


