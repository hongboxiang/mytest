package com.hbx.xml;

import java.io.File;
import java.io.FileInputStream;
 
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamReader;
 
public class StaxDemo {
 
    public static void main(String[] args) throws Exception {
 
        // 第一步：构建XMLStreamReader
        XMLInputFactory factory = XMLInputFactory.newInstance();
        XMLStreamReader reader = factory
                .createXMLStreamReader(new FileInputStream(new File(
                        "src/font.xml")));
        // 第二部：迭代处理
        while (reader.hasNext()) {
            int event = reader.next();
            //处理开始标签
            if (event == XMLStreamConstants.START_ELEMENT) {
                String name = reader.getLocalName().trim();
                System.out.print("<" + name);
                if (name.equals("size")) {
                    String attrValue = reader.getAttributeValue(null, "unit");
                    System.out.print(" unit=\"" + attrValue + "\"");
                }
                System.out.print(">");
            }
            //处理结束标签
            if (event == XMLStreamConstants.END_ELEMENT) {
                System.out.print("</" + reader.getLocalName() + ">");
            }
            //处理文本
            if (event == XMLStreamConstants.CHARACTERS) {
                System.out.print(reader.getText());
            }
        }
 
    }
}