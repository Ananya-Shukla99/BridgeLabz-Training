package com.testing;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class TestingFileProcessor {

    private final String filename = "testfile.txt";

    @AfterEach
    void cleanUp() throws IOException {
        Files.deleteIfExists(Path.of(filename));
    }

    @Test
    void testWriteAndReadFile() throws IOException {
        String content = "Hello JUnit";

        FileProcessor.writeToFile(filename, content);
        String result = FileProcessor.readFromFile(filename);

        assertEquals(content, result);
    }

    @Test
    void testFileExistsAfterWriting() throws IOException {
        FileProcessor.writeToFile(filename, "Test content");

        assertTrue(Files.exists(Path.of(filename)));
    }

    @Test
    void testReadFileThatDoesNotExist() {
        assertThrows(IOException.class, () -> {
            FileProcessor.readFromFile("nonexistent.txt");
        });
    }
}
