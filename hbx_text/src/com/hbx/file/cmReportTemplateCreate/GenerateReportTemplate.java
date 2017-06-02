package com.hbx.file;

import java.io.*;

/**
 * Created by 10180885 on 2017/5/9.
 */
public class GenerateReportTemplate {
    public static void main(String[] args) {
        new GenerateReportTemplate().geneTemplate();
    }

    public void geneTemplate(){
        geneAllTemplate(new templateObject("tdd"));
    }

    private void readTemplateName(templateObject templateObject) {
        try {
            String[] fddNames =  new File(templateObject.getReportPath()).list();
            File dir = new File(templateObject.getTemplatePath());
            if(!dir.exists()){
                dir.mkdirs();
            }
            for (String fddName:fddNames) {
                String fddReportName = fddName.substring(0, fddName.length()-4);
                String templatePath = templateObject.getTemplatePath() + File.separator + fddReportName +"_NO.csv";
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(templatePath));
                bufferedWriter.write("name,radiotype,objecttype,ismerge(0:merge 1:no merge),attribute(not selected)");
                bufferedWriter.newLine();
                bufferedWriter.write(fddReportName + "," + templateObject.getRadiotype() + "," + fddReportName + ",1");

                bufferedWriter.flush();
                bufferedWriter.close();
            }
            for (String fddName:fddNames) {
                String fddReportName = fddName.substring(0, fddName.length()-4);
                String templatePath = templateObject.getTemplatePath() + File.separator + fddReportName +"_M.csv";
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(templatePath));
                bufferedWriter.write("name,radiotype,objecttype,ismerge(0:merge 1:no merge),attribute(not selected)");
                bufferedWriter.newLine();
                bufferedWriter.write(fddReportName + "," + templateObject.getRadiotype() + "," + fddReportName + ",0");

                bufferedWriter.flush();
                bufferedWriter.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void geneAllTemplate(templateObject templateObject) {
        try {
            String[] fddNames =  new File(templateObject.getReportPath()).list();
            File dir = new File(templateObject.getTemplatePath());
            if(!dir.exists()){
                dir.mkdirs();
            }
            String templatePath = templateObject.getTemplatePath() + File.separator + "all_NO.csv";
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(templatePath));
            bufferedWriter.write("name,radiotype,objecttype,ismerge(0:merge 1:no merge),attribute(not selected)");
            bufferedWriter.newLine();
            for (String fddName:fddNames) {
                String fddReportName = fddName.substring(0, fddName.length()-4);
                bufferedWriter.write(fddReportName + "," + templateObject.getRadiotype() + "," + fddReportName + ",1");
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
            bufferedWriter.close();
            String templatePathM = templateObject.getTemplatePath() + File.separator + "all_M.csv";
            BufferedWriter bufferedWriterM = new BufferedWriter(new FileWriter(templatePathM));
            bufferedWriterM.write("name,radiotype,objecttype,ismerge(0:merge 1:no merge),attribute(not selected)");
            bufferedWriterM.newLine();
            for (String fddName:fddNames) {
                String fddReportName = fddName.substring(0, fddName.length()-4);
                bufferedWriterM.write(fddReportName + "," + templateObject.getRadiotype() + "," + fddReportName + ",0");
                bufferedWriterM.newLine();

                bufferedWriterM.flush();
            }
            bufferedWriterM.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
