package interface_adapter.clear_users;

//  Complete me

import interface_adapter.ViewModel;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class ClearViewModel extends ViewModel {
    //public final String TITLE_LABEL = "Clear View";

    //public static final String CLEAR_BUTTON_LABEL = "Clear";
    //public static final String CANCEL_BUTTON_LABEL = "Cancel";

    public ClearState state = new ClearState();

    public ClearViewModel() {super("clear");}

    public void setState(ClearState state) {this.state = state;}

    private final PropertyChangeSupport support = new PropertyChangeSupport(this);

    public void firePropertyChanged() {support.firePropertyChange("clear", null, this.state);}

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }

    public ClearState getState() {return state;}
}
