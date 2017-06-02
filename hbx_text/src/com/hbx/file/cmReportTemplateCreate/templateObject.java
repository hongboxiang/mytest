package com.hbx.file;

public class templateObject {
    private final String reportPath;
    private final String templatePath;
    private final String radiotype;

    public templateObject(String netype) {
        if(netype.equalsIgnoreCase("fdd")){
            this.reportPath = "D:\\mywork\\配置报表加mml命令\\FDD报表";
            this.templatePath = "D:\\mywork\\配置报表加mml命令\\FDD模板";
            this.radiotype = "ltefdd";
        }else if(netype.equalsIgnoreCase("tdd")){
            this.reportPath = "D:\\mywork\\配置报表加mml命令\\TDD报表";
            this.templatePath = "D:\\mywork\\配置报表加mml命令\\TDD模板";
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
