package ba.unsa.etf.rs;

import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;

public class MenuController {

    private Main mainApp;
    @FXML
    private MenuItem mIRestart;

    public void setMainApp(Main mainApp) {
        this.mainApp = mainApp;
    }

    @FXML private void restartGame() throws Exception{ mainApp.restartQuiz(); }

    @FXML private void loadNewGame() throws Exception{ mainApp.loadQuiz(); }

    @FXML private void quit() { System.exit(0); }

    public void enableRestartMenuItem(){
        mIRestart.setVisible(true);
        mIRestart.setDisable(false);
    }
}
