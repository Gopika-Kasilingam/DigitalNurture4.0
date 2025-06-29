package org.example;

public class MyService {
    private final ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public void performOperation() {
        api.connect();
        api.sendData("Order Info");
        api.disconnect();
    }
}
