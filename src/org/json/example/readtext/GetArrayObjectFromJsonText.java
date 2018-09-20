package org.json.example.readtext;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.json.JSONObject;

public class GetArrayObjectFromJsonText {
	public static void main(String[] args) {
		String jsonText;
		try {
		    jsonText = IOUtils.toString(new FileInputStream(new File("C:\\Users\\venkataudaykiranp\\Downloads\\Json.txt")));
		    /*or*/
//		    jsonText = "\"{\"gutter_url\":\"\", \"result\":[{\"album_sort\":\"Wall, The\",\"release_year\":1979,\"afs\":\"Y\"}],\"sort_order\":\"popularity\"}\"";
		    int i = jsonText.indexOf("{");
		    jsonText = jsonText.substring(i);
		    JSONObject jsonFile = new JSONObject(jsonText);
		    System.out.println("Input JSON data: "+ jsonFile.toString());
		    Object result = jsonFile.get("result");
		    System.out.println("Result array Data: "+ result);
		} catch (IOException e) {
		    e.printStackTrace();
		}
	}
}

