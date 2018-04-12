package com.core.hackthon.ola;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

public class OlaQ1 {

	private final static String USER_AGENT = "Mozilla/5.0";

	public static void main(String[] args) {

		String urlString = "https://jsonmock.hackerrank.com/api/movies/search/?Title=spiderman";
		try {

			String response = httpGetMet(urlString);

			JSONObject jsonObj = new JSONObject(response.toString());
			List<String> stringList = new ArrayList<String>();

			String total_pages = jsonObj.getString("total_pages");
			System.out.println("total_pages:: " + total_pages);
			int pages = Integer.parseInt(total_pages);
			if (pages > 0) {
				for (int i = 1; i <= pages; i++) {
					urlString = urlString + "&page=" + i;
					System.out.println(urlString);
					response = httpGetMet(urlString);
					jsonObj = new JSONObject(response);
					JSONArray arr = jsonObj.getJSONArray("data");

					for (int j = 0; j < arr.length(); j++) {
						String title = arr.getJSONObject(j).getString("Title");
						System.out.println(title);
						stringList.add(title);
					}

				}
				System.out.println("**********************");
				Collections.sort(stringList);
				stringList.forEach(str -> System.out.println(str));

			}

		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
	}

	public static String httpGetMet(String urlString) throws IOException {
		URL obj = new URL(urlString);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();

		// optional default is GET
		con.setRequestMethod("GET");

		// add request header
		con.setRequestProperty("User-Agent", USER_AGENT);
		int responseCode = con.getResponseCode();
		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();

		System.out.println("Response::" + response.toString());

		return response.toString();
	}

}
