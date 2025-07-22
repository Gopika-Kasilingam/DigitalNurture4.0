package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class MultiReturnServiceTest {

    @Test
    public void testServiceWithMultipleReturnValues() {
        // Step 1: Create mock
        Repository mockRepository = mock(Repository.class);

        // Step 2: Stub with multiple return values
        when(mockRepository.getData())
                .thenReturn("First Mock Data")
                .thenReturn("Second Mock Data");

        // Step 3: Use the mock in the service
        Service service = new Service(mockRepository);

        // Step 4: Call method twice
        String firstResult = service.processData();
        String secondResult = service.processData();

        // Step 5: Assertions
        assertEquals("Processed First Mock Data", firstResult);
        assertEquals("Processed Second Mock Data", secondResult);
    }
}
