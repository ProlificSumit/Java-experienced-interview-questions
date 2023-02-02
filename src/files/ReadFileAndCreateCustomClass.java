package files;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ReadFileAndCreateCustomClass {

    public static void main(String[] args) {
        String pathToFile = "src/files/test.txt";
        File testFile = new File(pathToFile);
        try {
            FileReader reader = new FileReader(testFile);
            try (BufferedReader bReader = new BufferedReader(reader)) {
                String line = null;
                while ((line = bReader.readLine()) != null) {
                    String[] parts = line.split(",");

                    Person person = new Person();

                    for (String part : parts) {
                        String[] keyValue = part.split("=");

                        for (int i = 0; i < keyValue.length; i++) {
                            if (keyValue[i].startsWith("name")) {
                                person.setName(keyValue[i + 1].trim());
                            } else if (keyValue[i].contains("id")) {
                                person.setId(Integer.valueOf(keyValue[i + 1].trim()));
                            }
                        }
                    }
                    System.out.println(person.getId() + " " + person.getName());
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println(readFileUsingFilesAndCreateCustomObject(pathToFile));
    }

    public static List<Person> readFileUsingFilesAndCreateCustomObject(String path) {
        List<Person> result = new ArrayList<>();
        try (Stream<String> lines = Files.lines(Paths.get(path))) {
            lines.forEach(line -> {
                String[] parts = line.split(",");
                Person person = new Person();

                for (String part : parts) {
                    String[] keyValue = part.split("=");

                    for (int i = 0; i < keyValue.length; i++) {
                        if (keyValue[i].startsWith("name")) {
                            person.setName(keyValue[i + 1].trim());
                        } else if (keyValue[i].contains("id")) {
                            person.setId(Integer.valueOf(keyValue[i + 1].trim()));
                        }
                    }
                }
                result.add(person);
                System.out.println(person.getId() + " " + person.getName());
            });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return result;
    }

}
