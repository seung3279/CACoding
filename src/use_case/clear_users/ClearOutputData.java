package use_case.clear_users;

// Complete me

public class ClearOutputData {
    private final String clearedusers;
    private boolean useCaseFailed;
    public ClearOutputData(String users, boolean useCaseFailed) {
        this.clearedusers = users;
        this.useCaseFailed = useCaseFailed;
    }

    public String getUsers() {return clearedusers;}
}
