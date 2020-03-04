import java.io.IOException;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Result> donutContestResults = InputData.saveResultsInList();
        String outputFileName = "stats.csv";
        try {
            OutputData.saveResultsInCSV(donutContestResults, outputFileName);
        } catch (IOException e) {
            System.out.println("Nie udało się zapisać wyników do pliku!");;
        }

    }
}
