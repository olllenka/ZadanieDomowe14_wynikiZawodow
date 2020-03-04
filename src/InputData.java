import java.util.*;

public class InputData {

    public static Set<Result> saveResultsInList() {
        Scanner sc = new Scanner(System.in);
        String answerUpperCase;
        Set<Result> results = new TreeSet<>();
        do{
            System.out.println("Podaj wynik (w formacie: imię,nazwisko,ilość zjedzonych pączków) kolejnego łasucha (lub stop):");
            String answer = sc.nextLine();
            answerUpperCase=answer.toUpperCase();
            if(!answerUpperCase.equals("STOP")) {
                Result result = createResult(answer);
                results.add(result);
            }
        } while (!answerUpperCase.equals("STOP"));
        sc.close();
        return results;
    }

    private static Result createResult(String answer) {
        Result result = new Result();
        String[] resultArray = answer.split(",");
        if(resultArray.length==3) {
            result.setFirstName(resultArray[0]);
            result.setLastName(resultArray[1]);
            Double donuts = Double.valueOf(resultArray[2]);
            result.setNumberOfDonuts(donuts);

        }
        return result;
    }
}
