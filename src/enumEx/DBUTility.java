package enumEx;

import java.sql.Connection;

public class DBUTility {
    Connection connection;
    public void openConnection( DataBase db ){
        switch (db){
            case USERS:
                // connection = connect
                // code to connect to user db
            case  SALES:
                // connection = connect
                // code to connect to sales db
        }
    }

    }

