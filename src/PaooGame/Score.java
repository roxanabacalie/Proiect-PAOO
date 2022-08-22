package PaooGame;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Score implements Observer {


    @Override
    public void update(int level, long score) {
        System.out.println("Score: " + score + " Level: " + level);
        Statement stmt;
        Connection c;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:GameScores.db");
            c.setAutoCommit(false);
            stmt = c.createStatement();
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Introduceti numele: ");
            String name = keyboard.nextLine();
            String sql;
            if (level == 1) {
                sql = "INSERT INTO SCORE (NAME,LEVEL,SCORE) " +
                        "VALUES ('" + name + "', '" + level + "', '" + score + "' );";
            } else {
                sql = "UPDATE SCORE set LEVEL = '" + level + "' where NAME='" + name + "';";
                stmt.executeUpdate(sql);
                sql = "UPDATE SCORE set SCORE = '" + score + "' where NAME='" + name + "';";
            }
            stmt.executeUpdate(sql);

            stmt.close();
            c.commit();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }

        System.out.println("Records created successfully");

    }
}
