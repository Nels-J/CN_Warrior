package database;

import java.sql.*;

public class Database {
    // ATTRIBUTE(s)
    //String url = "jdbc:mysql://localhost:3306/dndDB";
    //String user = "NelsJ";
    //String pwd = "";

    // CONSTRUCTOR(s) if nothing declared here after then the default constructor is called


    // GETTER(s) & SETTER(s)

    // METHOD(s)

    public void loadDatabase() {

        try {
            // 0 get a jdbc driver (installed from maven)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 1 get connection to db
            Connection dbConnexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/dndDB" , "nelsj", "Ayrton13!"); //FIXME how to use dotenv

            // 2 create a statement
            Statement myStatement = dbConnexion.createStatement();

            // 3 execute sql query
            ResultSet myResult = myStatement.executeQuery("SELECT * from hero_table");

            // 4 process result set
            while (myResult.next()) { //boucle de lecture des enregistrements dans la table
                System.out.println("Record: ID: " + myResult.getString("hero_id") + ", Name: " + myResult.getString("hero_name") + ", Hero type: " + myResult.getString("hero_type") + ", Life: " + myResult.getString("hero_life") + ", Strength: " + myResult.getString("hero_strength"));
            }

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("DB loading finish");
        }
    }


    public void insertIntoDatabase(String newHeroName,String newHeroType) {

        try {
            // 0 get a jdbc driver (installed from maven)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 1 get connection to db
            Connection dbConnexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/dndDB" , "nelsj", "Ayrton13!");

            // 2 create a statement
            Statement myStatement = dbConnexion.createStatement();

            // 3 execute sql query
            //prepare
            PreparedStatement preparedStatement = dbConnexion.prepareStatement("INSERT INTO hero_table(hero_name, hero_type, hero_life, hero_strength) VALUES (?,?,3,8);");
            preparedStatement.setString(1, newHeroName);
            preparedStatement.setString(2, newHeroType);

            preparedStatement.executeUpdate();

            System.out.println("Insert complete");

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("DB inserting finish");
        }

    }

    //TODO update db to do later

    @Override
    public String toString() {
        return super.toString();
    }
}


