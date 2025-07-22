package org.example;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    public void testVerifyInteraction() {
        // Step 1: Create mock object
        ExternalApi mockApi = mock(ExternalApi.class);

        // Step 2: Create service with mock and call method
        MyService service = new MyService(mockApi);
        service.fetchData();

        // Step 3: Verify that getData() was called exactly once
        verify(mockApi).getData();
    }
}
