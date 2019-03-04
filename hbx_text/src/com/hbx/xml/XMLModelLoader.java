package com.hbx.xml;

import com.zte.ums.uep.api.util.DebugPrn;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created on 2017/12/6
 */
public class XMLModelLoader {

    private File file;
    private static final DebugPrn logger = new DebugPrn(XMLModelLoader.class.getName());
    private static final String MO = "Mo";
    private static final String MOC = "Moc";
    private static final String FILENAME = "FileName";
    private static final String FIELDLIST = "FieldList";
    private static final String FIELDNAME = "FieldName";
    private static final String MAINNAME = "mainName";
    private static final String MINORNAME = "minorName";
    private static final String FIELDTYPE = "fieldType";
    private List<MoModel> models = new ArrayList<MoModel>();

    public List<MoModel> parse(String path) {
        try {
            SAXBuilder builder = new SAXBuilder();
            Document doc = builder.build(new File(path));
            List<Element> mos = doc.getRootElement().getChildren(MO);
            for (Element mo : mos) {
                setModels(mo, parseField(mo));
            }
            return models;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @NotNull
    private List<String> parseField(Element mo) {
        List<Element> fieldElementList = mo.getChildren(FIELDLIST);
        List<Element> fieldNames = fieldElementList.get(0).getChildren(FIELDNAME);
        List<String> fieldList = new ArrayList<String>();
        for (Element fieldName : fieldNames) {
            if(fieldName.getAttribute(FIELDTYPE) != null){
//                fieldList.add(fieldName.getAttributeValue(INTERNALNAME));
            }else {
                fieldList.add(fieldName.getText());
            }
        }
        return fieldList;
    }

    private void setModels(Element mo, List<String> fieldList) {
        MoModel model = new MoModel();
        model.setMoc(mo.getAttributeValue(MOC));
        model.setFileName(mo.getAttributeValue(FILENAME));
        model.setFieldList(fieldList);
        models.add(model);
    }
}
