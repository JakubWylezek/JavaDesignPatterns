package pl.wylezek.structural.bridge.webpage;

import pl.wylezek.structural.bridge.theme.Theme;

public abstract class WebPage {
    protected Theme theme;

    public WebPage(Theme theme) {
        this.theme = theme;
    }

    abstract String getPage();
}
