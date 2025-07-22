package org.example.service;

import org.example.repository.Repository;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class ServiceTest {

    @Test
    public void testServiceWithMockRepository() {
        // Step 1: Create mock repository
        Repository mockRepository = mock(Repository.class);

        // Step 2: Stub getData() method
        when(mockRepository.getData()).thenReturn("Mock Data");

        // Step 3: Inject mock into Service
        Service service = new Service(mockRepository);

        // Step 4: Assert expected behavior
        String result = service.processData();
        assertEquals("Processed Mock Data", result);
    }
}
