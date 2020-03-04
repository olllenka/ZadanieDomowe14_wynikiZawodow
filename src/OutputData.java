import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Set;

public class OutputData {
    public static void saveResultsInCSV(Set<Result> donutContestResults, String outputFileName) throws IOException {
        FileWriter fileWriter = new FileWriter(outputFileName);
        BufferedWriter writer = new BufferedWriter(fileWriter);

        for (Result donutContestResult : donutContestResults) {
            writer.write(donutContestResult.toString());
            writer.newLine();
        }
        writer.close();
    }
}
