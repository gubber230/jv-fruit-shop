package core.basesyntax.file.writer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterImpl implements FileWriterInterface {
    @Override
    public void write(String report, String fileName) {
        File file = new File(fileName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(report);
            writer.newLine();
            System.out.println("Report written successfully to " + fileName);
        } catch (IOException e) {
            throw new RuntimeException("Error generating file " + fileName, e);
        }
    }
}
