package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    public void testMultipleReturnsFromMock() {
        // Step 1: Create mock object
        ExternalApi mockApi = mock(ExternalApi.class);

        // Step 2: Stub to return different values on each call
        when(mockApi.getData()).thenReturn("First", "Second", "Third");

        // Step 3: Use the service
        MyService service = new MyService(mockApi);
        String[] result = service.fetchMultipleTimes();

        // Step 4: Assert each call's result
        assertEquals("First", result[0]);
        assertEquals("Second", result[1]);
        assertEquals("Third", result[2]);

        // Optional: Verify getData() was called 3 times
        verify(mockApi, times(3)).getData();
    }
}
