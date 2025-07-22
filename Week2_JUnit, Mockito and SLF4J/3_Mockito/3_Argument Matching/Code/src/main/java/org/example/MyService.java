package org.example;

public class MyService {
    private final ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public void notifyUser(String username) {
        api.sendMessage("Hello, " + username);
    }
}
