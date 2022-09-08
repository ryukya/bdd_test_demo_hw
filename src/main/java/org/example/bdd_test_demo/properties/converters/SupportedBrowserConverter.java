package org.example.bdd_test_demo.properties.converters;

import org.example.bdd_test_demo.enumeration.SupportedBrowsers;

public final class SupportedBrowserConverter {
    public static SupportedBrowsers valueOfWebBrowser(String webBrowser) {
        return switch (webBrowser) {
            case "local_chrome" -> SupportedBrowsers.LOCAL_CHROME;
            case "local_firefox" -> SupportedBrowsers.LOCAL_FIREFOX;
            case "remote_chrome" -> SupportedBrowsers.REMOTE_CHROME;
            default -> throw new IllegalArgumentException("No appropriate browser found");
        };
    }
}
