package com.hbx.xml;

import java.util.List;

/**
 * Created on 2017/12/6
 */
public class MoModel {
    private String moc;
    private String fileName;
    private List<String> fieldList;

    public String getMoc() {
        return moc;
    }

    public void setMoc(String moc) {
        this.moc = moc;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public List<String> getFieldList() {
        return fieldList;
    }

    public void setFieldList(List<String> fieldList) {
        this.fieldList = fieldList;
    }
}
