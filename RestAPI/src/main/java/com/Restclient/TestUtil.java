package com.Restclient;

import org.json.JSONArray;
import org.json.JSONObject;

public class TestUtil {

	public static String getValueFromJsonResponse(JSONObject responsejson, String jsonpath) {
		Object obj = responsejson;
		for (String s : jsonpath.split("/"))
		{
			if (!s.isEmpty())
				// if not Json array - then it goes in IF block
				if (!(s.contains("[") || s.contains("]")))
					obj = ((JSONObject) obj).get(s);
			// if its Json array its goes in ELSE IF block
				else if (s.contains("[") || s.contains("]"))
					obj = ((JSONArray) ((JSONObject) obj).get(s.split("\\[")[0]))
							.get(Integer.parseInt(s.split("\\[")[1].replace("]", "")));
		}
		return obj.toString();
		}	
}

//Split Function
/*
String string = "aString/bString";
String stringArray[] =string.split("/");
for (String arrEle : stringArray) {
	System.out.println(arrEle);
}
*/

