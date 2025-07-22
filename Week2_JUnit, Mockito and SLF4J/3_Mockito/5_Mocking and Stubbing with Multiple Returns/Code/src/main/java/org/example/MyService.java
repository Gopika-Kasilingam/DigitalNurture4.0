package org.example;

public class MyService {
    private final ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public String[] fetchMultipleTimes() {
        return new String[] {
                api.getData(),
                api.getData(),
                api.getData()
        };
    }
}
