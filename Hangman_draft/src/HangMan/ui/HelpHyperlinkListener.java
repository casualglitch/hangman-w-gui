package HangMan.ui;

import java.io.IOException;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;

public class HelpHyperlinkListener implements HyperlinkListener {
    private HangManUI ui;

    public HelpHyperlinkListener(HangManUI initUI) {
        ui = initUI;
    }

    @Override
    public void hyperlinkUpdate(HyperlinkEvent he) {
        if (he.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
            try {
                ui.getHelpPane().setPage(he.getURL());
            } catch (IOException e) {
                System.err.println("Error loading url: " + e);
            }
        }
    }
}
