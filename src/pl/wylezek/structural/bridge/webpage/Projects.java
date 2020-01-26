package pl.wylezek.structural.bridge.webpage;

import pl.wylezek.structural.bridge.theme.Theme;

public class Projects extends WebPage {

    public Projects(Theme theme) {
        super(theme);
    }

    @Override
    String getPage() {
        return "Projects with theme " + theme.getColour();
    }
}
