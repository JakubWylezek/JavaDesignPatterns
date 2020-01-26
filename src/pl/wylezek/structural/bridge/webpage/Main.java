package pl.wylezek.structural.bridge.webpage;

import pl.wylezek.structural.bridge.theme.Theme;

public class Main extends WebPage {

    public Main(Theme theme) {
        super(theme);
    }

    @Override
    String getPage() {
        return "Main with theme " + theme.getColour();
    }
}
