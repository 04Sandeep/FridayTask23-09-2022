$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/SandeepKaur/IdeaProjects/demo/ThursdayTask/src/test/java/Features/UserLogin.feature");
formatter.feature({
  "name": "Adding item to Cart",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Adding any selected item to the cart and go for checkout",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User is on Login Page and enter the Valid Credentials",
  "keyword": "Given "
});
formatter.match({
  "location": "AddToCartTest.User_is_on_Login_Page_and_enter_the_Valid_Credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should add the item to Cart and Checkout",
  "keyword": "Then "
});
formatter.match({
  "location": "AddToCartTest.user_should_add_the_item_to_Cart_and_Checkout()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on Logout",
  "keyword": "When "
});
formatter.match({
  "location": "AddToCartTest.user_click_on_Logout()"
});
formatter.result({
  "error_message": "org.openqa.selenium.ElementNotInteractableException: element not interactable\n  (Session info: chrome\u003d105.0.5195.127)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027MSDT066\u0027, ip: \u002710.10.30.190\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002717\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 105.0.5195.127, chrome: {chromedriverVersion: 105.0.5195.52 (412c95e51883..., userDataDir: C:\\Users\\SANDEE~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:53198}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 76d895a71296f8cd5a4b28c9d834b1e7\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:77)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:480)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:84)\r\n\tat Pages.LogoutAfterShopping.logout(LogoutAfterShopping.java:21)\r\n\tat StepDefinition.AddToCartTest.user_click_on_Logout(AddToCartTest.java:26)\r\n\tat ✽.user click on Logout(C:/Users/SandeepKaur/IdeaProjects/demo/ThursdayTask/src/test/java/Features/UserLogin.feature:7)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user is on Homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "AddToCartTest.user_is_on_Homepage()"
});
formatter.result({
  "status": "skipped"
});
});