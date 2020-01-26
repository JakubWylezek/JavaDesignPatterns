package pl.wylezek.structural.bridge.webpage;

import pl.wylezek.structural.bridge.theme.Theme;

public class About extends WebPage {

    public About(Theme theme) {
        super(theme);
    }

    @Override
    String getPage() {
        return "About with theme " + theme.getColour();
    }
}
