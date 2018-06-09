package main.java;

import main.java.httpsrequests.BeaconGetRequest;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        new BeaconGetRequest()
                .executeRequest()
                .countNumberOfSymbolsInOutputValue();

    }
}
