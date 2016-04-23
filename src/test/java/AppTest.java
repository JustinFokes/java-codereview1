import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();

  @Override
  public WebDriver getDefaultDriver() {
    return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  @Test
  public void rootTest() {
    goTo("http://localhost:4567/");
    assertThat(pageSource()).contains("guess");
  }
  @Test
  public void containsHyphens() {
  goTo("http://localhost:4567/");
  fill("#user1").with("this");
  submit(".btn");
  assertThat(pageSource()).contains("th-s");
}
  @Test
  public void returnsOriginal() {
  goTo("http://localhost:4567/");
  fill("#user1").with("this");
  submit(".btn");
  fill("#user2").with("this");
  submit(".btn");
  
  assertThat(pageSource()).contains("Look's like we have a match!");
}
}