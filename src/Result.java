public class Result implements Comparable<Result>{
    private String firstName;
    private String lastName;
    private double numberOfDonuts;

    public Result() {
    }

    public Result(String firstName, String lastName, double numberOfDonuts) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.numberOfDonuts = numberOfDonuts;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setNumberOfDonuts(double numberOfDonuts) {
        this.numberOfDonuts = numberOfDonuts;
    }

    @Override
    public int compareTo(Result result) {
        int donutsCompare = -Double.compare(this.numberOfDonuts, result.numberOfDonuts);
        if(donutsCompare==0)
            return this.lastName.compareTo(result.lastName);
        else
            return donutsCompare;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + ";" + numberOfDonuts;
    }



}
