package org.example;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    public void testVoidMethodThrowsException() {
        // Step 1: Create mock
        Logger mockLogger = mock(Logger.class);

        // Step 2: Stub void method to throw exception
        doThrow(new RuntimeException("Log failed")).when(mockLogger).log("Processing started");

        // Step 3: Call method and verify
        MyService service = new MyService(mockLogger);
        service.process();

        // Step 4: Verify interaction still happened
        verify(mockLogger).log("Processing started");
    }
}
