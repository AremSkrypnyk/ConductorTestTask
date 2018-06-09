package main.java.httpsrequests.base.response;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

public class GetResponse {

    private HttpURLConnection connection;

    public GetResponse(HttpURLConnection connection) {
        this.connection = connection;
    }

    public String getResponseBody() throws IOException {
        StringBuffer responseBody = new StringBuffer();
        BufferedReader in = new BufferedReader(
                new InputStreamReader(connection.getInputStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            responseBody.append(inputLine);
        }
        in.close();

        return responseBody.toString();
    }
}
