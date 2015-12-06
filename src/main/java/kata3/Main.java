package kata3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        new HistogramDisplay(new HistogramBuilder<String>().build(data()));
    }

    private static String[] data() {
        Path path = Paths.get("src/main/resources/mails.txt");
        try(Stream<String> lines = Files.lines(path)) {
            return lines.map(Main::extractDomains).toArray(String[]::new);
        } catch (IOException e) {
            return new String[0];
        }
    }

    private static String extractDomains(String mail) {
        return mail.substring(mail.indexOf("@") + 1);
    }

}
