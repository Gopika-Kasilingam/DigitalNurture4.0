package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class NetworkServiceTest {

    @Test
    public void testServiceWithMockNetworkClient() {
        // Step 1: Mock the network client
        NetworkClient mockNetworkClient = mock(NetworkClient.class);

        // Step 2: Stub the connect() method
        when(mockNetworkClient.connect()).thenReturn("Mock Connection");

        // Step 3: Inject the mock into the service
        NetworkService networkService = new NetworkService(mockNetworkClient);

        // Step 4: Call the service method and assert
        String result = networkService.connectToServer();
        assertEquals("Connected to Mock Connection", result);
    }
}
