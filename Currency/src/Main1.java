

import java.sql.*;
public class Main1 {
    /*
    Задание:
     Загрузка курсов валют с сайта ЦБРФ.
    -забрать данные с сайта
    -создать таблицу для хранения данных
    -загружать данные в созданную таблицу
    - написать select  для просмотра загруженных курсов на текущую дату.
     */
    public static void main(String args[])

    {

        //Connection c = null;

       // Statement stmt = null;

      //  String CreateSql = null;

        try

        {


            Class.forName("org.postgresql.Driver");

            Connection c = DriverManager.getConnection(

                    "jdbc:postgresql:://localhost:8080/procedure_demo",

                    "postgres", "postgres");

            System.out.println("Database Connected ..");

            Statement stmt = c.createStatement();

            String tableName="test";
            String CreateSql = "Create Table "+tableName+"(id int primary key, name varchar, address text) ";

            stmt.executeUpdate(CreateSql);

            stmt.close();

            c.close();

        }

        catch (Exception e)

        {

            System.err.println( e.getClass().getName()+": "+ e.getMessage() );

            System.exit(0);

        }

        System.out.println("Table Created successfully");

    }

}
