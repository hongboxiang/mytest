package com.hbx.file;
import java.io.*;

/**
 * Created by 10180885 on 16-6-28.
 */
public class JarName {

	public static void main(String[] args) {
		try {
			String dir = "D:\\lib-jar\\lib-cmicm";
			String outDir = "D:\\myPlays\\rfTransfer.txt";
			File file = new File(dir);
			FileWriter fw = new FileWriter(outDir);
			BufferedWriter bufferedWriter = new BufferedWriter(fw);
			for (String sf:file.list()) {
				if(sf.contains("usf") || sf.contains("uep") || sf.contains("ums")){
					continue;
				}
				String per = sf.replace(".jar","");
				String[] ss = per.split("-|_");
				String version = "";
				for(String ddfd :ss){
					if(ddfd.contains(".")){
						version = ddfd;
					}
				}
//				bufferedWriter.write(sf);
				bufferedWriter.write(" " + version);
				bufferedWriter.newLine();
			}
			bufferedWriter.flush();
			bufferedWriter.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}