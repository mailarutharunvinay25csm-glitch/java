import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilePatternCount {

    static void writeSampleFile() throws IOException {

        String data =
                "Peter Piper picked a peck of pickled peppers\n"
                + "A peck of pickled peppers Peter Piper picked\n"
                + "If Peter Piper picked a peck of pickled peppers\n"
                + "Where's the peck of pickled peppers Peter Piper picked?\n";

        Files.writeString(Path.of("sample.txt"), data);
    }

    static int countPattern(String text, String pattern) {

        int count = 0;
        int index = 0;

        text = text.toLowerCase();
        pattern = pattern.toLowerCase();

        while ((index = text.indexOf(pattern, index)) != -1) {
            count++;
            index += pattern.length();
        }

        return count;
    }

    public static void main(String[] args) {

        try {
            writeSampleFile();

            String text = Files.readString(Path.of("sample.txt"));

            System.out.println("'pe' - no of occurrences - "
                    + countPattern(text, "pe"));

            System.out.println("'pi' - no of occurrences - "
                    + countPattern(text, "pi"));

        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}
