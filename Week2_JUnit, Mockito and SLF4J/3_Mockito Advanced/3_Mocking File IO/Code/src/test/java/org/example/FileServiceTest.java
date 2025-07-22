package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class FileServiceTest {

    @Test
    public void testServiceWithMockFileIO() {
        // Step 1: Create mocks
        FileReader mockFileReader = mock(FileReader.class);
        FileWriter mockFileWriter = mock(FileWriter.class);

        // Step 2: Stub the read method
        when(mockFileReader.read()).thenReturn("Mock File Content");

        // Step 3: Inject mocks into FileService
        FileService fileService = new FileService(mockFileReader, mockFileWriter);

        // Step 4: Test the processFile logic
        String result = fileService.processFile();

        // Step 5: Verify results
        assertEquals("Processed Mock File Content", result);
        verify(mockFileWriter).write("Processed Mock File Content");
    }
}
