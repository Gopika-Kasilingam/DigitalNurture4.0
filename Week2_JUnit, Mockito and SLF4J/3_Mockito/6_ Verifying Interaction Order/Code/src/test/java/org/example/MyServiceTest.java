package org.example;

import org.junit.jupiter.api.Test;
import org.mockito.InOrder;

import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    public void testInteractionOrder() {
        // Step 1: Create mock object
        ExternalApi mockApi = mock(ExternalApi.class);

        // Step 2: Call methods in a specific order
        MyService service = new MyService(mockApi);
        service.performOperation();

        // Step 3: Verify interaction order
        InOrder inOrder = inOrder(mockApi);

        inOrder.verify(mockApi).connect();
        inOrder.verify(mockApi).sendData("Order Info");
        inOrder.verify(mockApi).disconnect();
    }
}
