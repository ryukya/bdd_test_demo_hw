package org.example.bdd_test_demo.enumeration;

import org.example.bdd_test_demo.invoker.WebDriverInvoker;
import org.example.bdd_test_demo.invoker.implementation.LocalChromeInvoker;
import org.example.bdd_test_demo.invoker.implementation.LocalFirefoxInvoker;
import org.example.bdd_test_demo.invoker.implementation.RemoteChromeInvoker;
import org.openqa.selenium.WebDriver;

public enum SupportedBrowsers {
    LOCAL_CHROME(new LocalChromeInvoker()),
    LOCAL_FIREFOX(new LocalFirefoxInvoker()),
    REMOTE_CHROME(new RemoteChromeInvoker());

    private WebDriverInvoker webDriverInvoker;

    SupportedBrowsers(WebDriverInvoker webDriverInvoker) {
        this.webDriverInvoker = webDriverInvoker;
    }

    public WebDriver getWebDriver(){
        return webDriverInvoker.invokeWebDriver();
    }
}
