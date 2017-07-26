package com.hbx.file;
import java.io.*;

/**
 * Created by 10180885 on 16-6-28.
 */
public class TestcaseHandler {

	public static void main(String[] args) {
		try {
			String dir = "D:\\myPlays\\rfTransfer";
			String outDir = "D:\\myPlays\\rfTransfer.txt";
			File file = new File(dir);
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outDir));
			for (String sf:file.list()) {
				InputStreamReader inputFileReader = new InputStreamReader(new FileInputStream(dir + File.separator + sf), "UTF-8");
				BufferedReader bufferedReader = new BufferedReader(inputFileReader);
				bufferedWriter.write("----------------" + sf);
				bufferedWriter.newLine();
				String line = bufferedReader.readLine();
				while(line != null) {
					if (line.contains("Test Cases")){
						line = bufferedReader.readLine();
						break;
					}
					line = bufferedReader.readLine();
				}
				while(line != null){
					if(line.startsWith("\t") || line.startsWith(" ") || line.equalsIgnoreCase("")){
						line = bufferedReader.readLine();
						continue;
					}

					String title;
					if(line.contains("\t")) {
						title = line.substring(0, line.indexOf("\t"));
					}else {
						title = line;
					}

					if(!title.contains("2003")) {
						bufferedWriter.write(title);
						bufferedWriter.newLine();
					}
					line = bufferedReader.readLine();
				}
				bufferedReader.close();
			}
			bufferedWriter.flush();
			bufferedWriter.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}