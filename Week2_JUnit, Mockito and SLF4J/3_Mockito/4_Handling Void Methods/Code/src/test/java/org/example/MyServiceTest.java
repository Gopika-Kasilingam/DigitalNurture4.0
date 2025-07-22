package org.example;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
        import static org.mockito.ArgumentMatchers.*;

public class MyServiceTest {

    @Test
    public void testVoidMethodInteraction() {
        // Step 1: Create mock object
        Logger mockLogger = mock(Logger.class);

        // Step 2: Stub the void method (optional unless it throws)
        doNothing().when(mockLogger).log(anyString());

        // Step 3: Call and verify interaction
        MyService service = new MyService(mockLogger);
        service.doWork();

        verify(mockLogger).log(eq("Work completed"));
    }
}
