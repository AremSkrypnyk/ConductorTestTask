package main.java.httpsrequests;

import main.java.httpsrequests.base.request.GetRequest;

import java.io.IOException;

public class BeaconGetRequest extends GetRequest {

    private static final String BEACON_URL = "https://beacon.nist.gov/rest/record/last";
    private static final String ACCEPT_LANG_HEADER_KEY = "Accept-Language";
    private static final String ACCEPT_LANG_HEADER_VALUE = "en-US,en";
    private static final int DEFAULT_TIMEOUT = 5000;

    public BeaconGetRequest() throws IOException {
        super(BEACON_URL);

        setHeader(ACCEPT_LANG_HEADER_KEY, ACCEPT_LANG_HEADER_VALUE);
        setConnectTimeout(DEFAULT_TIMEOUT);
        setReadTimeout(DEFAULT_TIMEOUT);
    }

    public BeaconGetResponse executeRequest(){
        return new BeaconGetResponse(execute());
    }


}
