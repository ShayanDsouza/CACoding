package use_case.clear_users;

// TODO Complete me

public class ClearOutputData {
    private boolean clearSuccessful;
    private String errorMessage;

    public ClearOutputData(boolean clearSuccessful, String errorMessage) {
        this.clearSuccessful = clearSuccessful;
        this.errorMessage = errorMessage;
    }

    public boolean isClearSuccessful() {
        return clearSuccessful;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
