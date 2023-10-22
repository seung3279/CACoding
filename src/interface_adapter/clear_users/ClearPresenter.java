package interface_adapter.clear_users;

//  Complete me

import interface_adapter.ViewManagerModel;
import interface_adapter.signup.SignupState;
import interface_adapter.signup.SignupViewModel;
import use_case.clear_users.ClearOutputBoundary;
import use_case.clear_users.ClearOutputData;

public class ClearPresenter implements ClearOutputBoundary {
    private final ClearViewModel clearViewModel;
    private final SignupViewModel signupViewModel;
    private ViewManagerModel viewManagerModel;

    public ClearPresenter(ViewManagerModel viewManagerModel,
                           ClearViewModel clearViewModel,
                           SignupViewModel signupViewModel) {
        this.viewManagerModel = viewManagerModel;
        this.clearViewModel = clearViewModel;
        this.signupViewModel = signupViewModel;
    }

    public void getjdialog(String message) {
        ClearState clearState = clearViewModel.getState();
        clearState.setClearMessage(message);
        clearViewModel.setState(clearState);
        clearViewModel.firePropertyChanged();
    }
    //@Override
    //public void prepareSuccessView(ClearOutputData response) {
        // On success, switch to the signup view.

//        SignupState signupState = signupViewModel.getState();
//        SignupState.setUsername(response.getUsers());
//        this.signupViewModel.setState(signupState);
  //      this.signupViewModel.firePropertyChanged();
//
  //      this.viewManagerModel.setActiveView(signupViewModel.getViewName());
    //    this.viewManagerModel.firePropertyChanged();
    //}

   // @Override
    //public void prepareFailView(String error) {
      //  ClearState clearState = clearViewModel.getState();
        //clearState.setClearError(error);
        //clearViewModel.firePropertyChanged();
    //}

}
