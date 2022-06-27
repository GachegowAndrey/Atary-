import org.h2.store.Data;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

public class CurrencyRates {
    private BigDecimal USDSell;
    private BigDecimal USDBuy;
    private BigDecimal EURSell;
    private BigDecimal EURBuy;

    public CurrencyRates(String USDSell, String USDBuy, String EURSell, String EURBuy) {
    }


//    public CurrencyRates()throws SQLException{
//        super("");
//    }

//    @Override
//    public void createTable() throws SQLException {
//
//        super.executeSqlStatement("CREATE TABLE shares(" +
//                "id BIGINT AUTO_INCREMENT PRIMARY KEY," +
//                "name VARCHAR(255) NOT NULL," +
//                "startPrice DECIMAL(15,2) NOT NULL DEFAULT 10," +
//                "changeProbability INTEGER NOT NULL DEFAULT 25,"+
//                "delta INTEGER NOT NULL DEFAULT 15)", "Создана таблица " + tableName);
//    }
}


