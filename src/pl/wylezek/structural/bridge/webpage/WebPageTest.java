package pl.wylezek.structural.bridge.webpage;

import org.junit.jupiter.api.Test;
import pl.wylezek.structural.bridge.theme.Aqua;
import pl.wylezek.structural.bridge.theme.Dark;
import pl.wylezek.structural.bridge.theme.White;

import static org.junit.jupiter.api.Assertions.*;

class WebPageTest {

    @Test
    void shouldReturnAboutPageWithDarkTheme() {
        About about = new About(new Dark());
        assertEquals("About with theme Dark", about.getPage());
    }

    @Test
    void shouldReturnMainPageWithAquaTheme() {
        Main main = new Main(new Aqua());
        assertEquals("Main with theme Aqua", main.getPage());
    }

    @Test
    void shouldReturnProjectsPageWithWhiteTheme() {
        Projects projects = new Projects(new White());
        assertEquals("Projects with theme White", projects.getPage());
    }

}