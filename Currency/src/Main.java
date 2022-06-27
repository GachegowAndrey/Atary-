import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Vector;


public class Main {
    public static  void main(String[] args) throws IOException, SQLException, ClassNotFoundException {

       // PrintWriter writer = new PrintWriter("data/text2.txt");
       //Document document = Jsoup.connect("https://cbr.ru/").maxBodySize(0).get();
      // Document document =Jsoup.parse("https://cbr.ru/","UTF-8");
//        for (int i = 1; i <divClass.size() ; i++) {
//            System.out.println(divClass.get(i).text());
//
//            writer.write(String.valueOf(divClass.get(i).text()+" "+i+"\n"));
//
//        }
//        writer.flush();
//        writer.close();

        Document document = Jsoup.connect("https://ratestats.com/").maxBodySize(0).get();
        Elements divClass =document.select("div");
        Vector<String> columnName = new Vector<>();
        columnName.add("Date");
        columnName.add("RUB-to-USD");
        columnName.add("RUB-to-EUR");
        Vector<String> dataInfo1=new Vector<>();
        dataInfo1.add(divClass.get(16).text());
        dataInfo1.add(divClass.get(17).text());
        dataInfo1.add(divClass.get(19).text());
        Vector<String> dataInfo2=new Vector<>();
        dataInfo2.add(divClass.get(26).text());
        dataInfo2.add(divClass.get(27).text());
        dataInfo2.add(divClass.get(29).text());
        Vector<String> dataInfo3=new Vector<>();
        dataInfo3.add(divClass.get(36).text());
        dataInfo3.add(divClass.get(37).text());
        dataInfo3.add(divClass.get(39).text());
        Vector<String> dataInfo4=new Vector<>();
        dataInfo4.add(divClass.get(46).text());
        dataInfo4.add(divClass.get(47).text());
        dataInfo4.add(divClass.get(49).text());
        Vector<String> dataInfo5=new Vector<>();
        dataInfo5.add(divClass.get(56).text());
        dataInfo5.add(divClass.get(57).text());
        dataInfo5.add(divClass.get(59).text());
        Vector<String> dataInfo6=new Vector<>();
        dataInfo6.add(divClass.get(66).text());
        dataInfo6.add(divClass.get(67).text());
        dataInfo6.add(divClass.get(69).text());
        Vector<String> dataInfo7=new Vector<>();
        dataInfo7.add(divClass.get(76).text());
        dataInfo7.add(divClass.get(77).text());
        dataInfo7.add(divClass.get(79).text());
        Vector<String> dataInfo8=new Vector<>();
        dataInfo8.add(divClass.get(86).text());
        dataInfo8.add(divClass.get(87).text());
        dataInfo8.add(divClass.get(89).text());
        Vector<Vector<String>> vecData = new Vector<>();
        vecData.add(dataInfo1);
        vecData.add(dataInfo2);
        vecData.add(dataInfo3);
        vecData.add(dataInfo4);
        vecData.add(dataInfo5);
        vecData.add(dataInfo6);
        vecData.add(dataInfo7);
        vecData.add(dataInfo8);
        JFrame jf=new JFrame();
        JTable jt=new JTable(vecData,columnName);
        jf.add(new JScrollPane(jt), BorderLayout.CENTER);
        jf.setVisible(true);
    }

}
