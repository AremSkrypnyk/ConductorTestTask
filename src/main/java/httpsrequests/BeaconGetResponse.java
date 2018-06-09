package main.java.httpsrequests;

import main.java.httpsrequests.base.response.GetResponse;
import main.java.parsers.StringParser;

import java.io.IOException;
import java.net.HttpURLConnection;

public class BeaconGetResponse extends GetResponse {

    private static final String OUTPUT_TAG_BEGIN = "<outputValue>";
    private static final String OUTPUT_TAG_END = "</outputValue>";

    public BeaconGetResponse(HttpURLConnection connection) {
        super(connection);
    }

    private String getOutputValueFromResponseBody() throws IOException {
        return StringParser.getTextBetweenString(getResponseBody(), OUTPUT_TAG_BEGIN, OUTPUT_TAG_END);
    }

    public void countNumberOfSymbolsInOutputValue() throws IOException {
        String outputValue = getOutputValueFromResponseBody();
            do {
                long occurrencesCount = StringParser.countNumberOfFirstSymbolInString(outputValue);
                System.out.println(outputValue.charAt(0) + "," + occurrencesCount);
                outputValue = StringParser.removeFirstSymbolFromString(outputValue);
            }
            while (!outputValue.isEmpty());
    }
}
