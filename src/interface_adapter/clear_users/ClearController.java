package interface_adapter.clear_users;

import use_case.clear_users.ClearInputBoundary;
import use_case.clear_users.ClearInputData;

// TODO Complete me
public class ClearController {
    final ClearInputBoundary clearUsersUseCaseInteractor;

    public ClearController(ClearInputBoundary clearUsersUseCaseInteractor) {
        this.clearUsersUseCaseInteractor = clearUsersUseCaseInteractor;
    }

    public void execute() {
        ClearInputData input = new ClearInputData();
        clearUsersUseCaseInteractor.execute(input);
    }
}
