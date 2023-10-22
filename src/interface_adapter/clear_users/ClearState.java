package interface_adapter.clear_users;

// Complete me

public class ClearState {
    private String clearedusers;
    private String clearError = null;
    private String clearMessage = "";
    public ClearState(ClearState copy) {
        clearedusers = copy.clearedusers;
        clearError = copy.clearError;
        clearMessage = copy.clearMessage;
    }

    public ClearState() {}

    public String getClearMessage() {return clearMessage;}
    public String getClearedusers() {return clearedusers;}

    public String getClearError() {return clearError;}
    public void setClearMessage(String clearMessage) {this.clearMessage = clearMessage;}
    public void setClearedusers(String clearedusers) {this.clearedusers = clearedusers;}

    public void setClearError(String clearError) {this.clearError = clearError;}

}
