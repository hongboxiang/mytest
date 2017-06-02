package com.hbx.xml;

import java.io.File;
import java.io.FileInputStream;
 
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamReader;
 
public class StaxDemo {
 
    public static void main(String[] args) throws Exception {
 
        // ��һ��������XMLStreamReader
        XMLInputFactory factory = XMLInputFactory.newInstance();
        XMLStreamReader reader = factory
                .createXMLStreamReader(new FileInputStream(new File(
                        "src/font.xml")));
        // �ڶ�������������
        while (reader.hasNext()) {
            int event = reader.next();
            //����ʼ��ǩ
            if (event == XMLStreamConstants.START_ELEMENT) {
                String name = reader.getLocalName().trim();
                System.out.print("<" + name);
                if (name.equals("size")) {
                    String attrValue = reader.getAttributeValue(null, "unit");
                    System.out.print(" unit=\"" + attrValue + "\"");
                }
                System.out.print(">");
            }
            //���������ǩ
            if (event == XMLStreamConstants.END_ELEMENT) {
                System.out.print("</" + reader.getLocalName() + ">");
            }
            //�����ı�
            if (event == XMLStreamConstants.CHARACTERS) {
                System.out.print(reader.getText());
            }
        }
 
    }
}