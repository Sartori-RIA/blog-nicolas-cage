package br.edu.utfpr.model.DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

/**
 * Created by sartori on 19/04/17.
 */

public class BlogDAO extends ConnectionDB{

    private Connection connection;
    private PreparedStatement statement;

    public void create(String title, String content) throws SQLException {
        try {
            statement= connection.prepareStatement("INSERT INTO blog(title, content) " +
                    "values ("+ title + ","+ content + ");");
            statement.executeQuery();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Exception is ;"+e);
        }
    }

    public void show(){
        try {
            statement= connection.prepareStatement("SELECT * FROM blog ORDER BY created_at;");
            statement.executeQuery();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Exception is ;"+e);
        }
    }
}
