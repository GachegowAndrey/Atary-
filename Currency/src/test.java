import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Date;
import java.util.Vector;


public class test {
    public static  void main(String[] args) throws IOException, SQLException, ClassNotFoundException {


        Document document = Jsoup.connect("https://cbr.ru/").maxBodySize(0).get();
        // Document document =Jsoup.parse("https://cbr.ru/","UTF-8");
        Elements divClass =document.select("div");
        Date date=new Date();
        Vector<String> columnName = new Vector<>();
        columnName.add("Date");
        columnName.add("USD-buy");
        columnName.add("USD-sell");
        columnName.add("EUR-buy");
        columnName.add("EUR-sell");

        Vector<String> dataInfo=new Vector<>();
        dataInfo.add(String.valueOf(date));
        dataInfo.add(divClass.get(180).text());
        dataInfo.add(divClass.get(181).text());
        dataInfo.add(divClass.get(186).text());
        dataInfo.add(divClass.get(187).text());
        Vector<Vector<String>> vecData = new Vector<>();
        vecData.add(dataInfo);
        JFrame jf=new JFrame();
        JTable jt=new JTable(vecData,columnName);
        jf.add(new JScrollPane(jt), BorderLayout.CENTER);
        jf.setVisible(true);

    }

}
