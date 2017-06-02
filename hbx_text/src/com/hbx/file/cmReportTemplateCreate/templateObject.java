package com.hbx.file;

public class templateObject {
    private final String reportPath;
    private final String templatePath;
    private final String radiotype;

    public templateObject(String netype) {
        if(netype.equalsIgnoreCase("fdd")){
            this.reportPath = "D:\\mywork\\���ñ����mml����\\FDD����";
            this.templatePath = "D:\\mywork\\���ñ����mml����\\FDDģ��";
            this.radiotype = "ltefdd";
        }else if(netype.equalsIgnoreCase("tdd")){
            this.reportPath = "D:\\mywork\\���ñ����mml����\\TDD����";
            this.templatePath = "D:\\mywork\\���ñ����mml����\\TDDģ��";
            this.radiotype = "ltetdd";
        }else {
            this.reportPath = "";
            this.templatePath = "";
            this.radiotype = "";
        }
    }

    public String getReportPath() {
        return reportPath;
    }

    public String getTemplatePath() {
        return templatePath;
    }

    public String getRadiotype() {
        return radiotype;
    }
}
