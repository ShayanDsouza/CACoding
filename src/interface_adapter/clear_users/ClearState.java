package interface_adapter.clear_users;

// TODO Complete me

public class ClearState {
    private boolean clearingInProgress;
    private boolean clearSuccess;
    private String errorMessage;

    public ClearState() {
        clearingInProgress = false;
        clearSuccess = false;
        errorMessage = null;
    }

    public boolean isClearingInProgress() {
        return clearingInProgress;
    }

    public boolean isClearSuccess() {
        return clearSuccess;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setClearingInProgress(boolean clearingInProgress) {
        this.clearingInProgress = clearingInProgress;
    }

    public void setClearSuccess(boolean clearSuccess) {
        this.clearSuccess = clearSuccess;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public String toString() {
        return "ClearState{" +
                "clearingInProgress=" + clearingInProgress +
                ", clearSuccess=" + clearSuccess +
                ", errorMessage='" + errorMessage + '\'' +
                '}';
    }
}