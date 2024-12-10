package com.itheima.demo1;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import java.io.File; // 导入 File 类
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Analysis {
    public static ArrayList<Order> analysisFun(String address) throws Exception {
        ArrayList<Order> orders = new ArrayList<>();
        SAXReader saxReader = new SAXReader(); // 创建 SAXReader 实例
        Document document = saxReader.read(Analysis.class.getResourceAsStream(address)); // 使用 File 对象读取 XML
        Element root = document.getRootElement();
        List<Element> elements = root.elements();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        for (Element user : elements) {
            Order order = new Order();
            order.setName(user.elementText("name"));
            order.setTime(LocalDateTime.parse(user.elementText("time"), formatter));
            order.setPrice(Double.parseDouble(user.elementText("double")));
            orders.add(order);
        }
        return orders;
    }
}
