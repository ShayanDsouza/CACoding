package use_case.clear_users;

// TODO Complete me

public class ClearInteractor implements ClearInputBoundary {
    final ClearUserDataAccessInterface userDataAccessObject;
    final ClearOutputBoundary userPresenter;

    public ClearInteractor(ClearUserDataAccessInterface userDataAccessObject, ClearOutputBoundary userPresenter) {
        this.userDataAccessObject = userDataAccessObject;
        this.userPresenter = userPresenter;
    }

    @Override
    public void execute(ClearInputData inputData) {
        try {
            userDataAccessObject.clearAllUsers();

            userPresenter.prepareSuccessView();
        } catch (Exception e) {
            userPresenter.prepareFailView(e.getMessage());
        }
    }
}
