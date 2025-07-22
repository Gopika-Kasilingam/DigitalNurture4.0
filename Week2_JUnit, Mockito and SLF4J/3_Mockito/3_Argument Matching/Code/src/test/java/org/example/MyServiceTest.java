package org.example;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    public void testArgumentMatching() {
        // Step 1: Create mock object
        ExternalApi mockApi = mock(ExternalApi.class);

        // Step 2: Call method with specific argument
        MyService service = new MyService(mockApi);
        service.notifyUser("Gopika");

        // Step 3: Verify method was called with matching argument
        verify(mockApi).sendMessage(eq("Hello, Gopika"));

        // OR: using a matcher
        verify(mockApi).sendMessage(startsWith("Hello,"));
    }
}

