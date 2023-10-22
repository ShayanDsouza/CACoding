package interface_adapter.clear_users;

// TODO Complete me

import use_case.clear_users.ClearOutputBoundary;

public class ClearPresenter implements ClearOutputBoundary {
    private ClearViewModel clearViewModel;

    public ClearPresenter() {
        this.clearViewModel = clearViewModel;
    }

    @Override
    public void prepareSuccessView() {

    }

    @Override
    public void prepareFailView(String error) {

    }
}
