package use_case.clear_users;

// Complete me .. figure out if it needs to implement input boundary

import interface_adapter.clear_users.ClearPresenter;

public class ClearInteractor implements ClearInputBoundary{
    final ClearUserDataAccessInterface userDataAccessObject;
    final ClearOutputBoundary clearPresenter;

    public ClearInteractor(ClearUserDataAccessInterface userDataAccessObject, ClearOutputBoundary userPresenter) {
        this.userDataAccessObject = userDataAccessObject;
        this.clearPresenter = userPresenter;
    }


    public void execute() {
        String message = String.join("\n", userDataAccessObject.clear());
        this.clearPresenter.getjdialog(message);
        //if (userDataAccessObject == null) {
        //    clearPresenter.prepareFailView("There are no users to clear");
        //} else {
        //    String a = String.join("\n", userDataAccessObject.clear());

        //    ClearOutputData clearOutputData = new ClearOutputData(a, false);
        //    clearPresenter.prepareSuccessView(clearOutputData);
        //}
    }
}
