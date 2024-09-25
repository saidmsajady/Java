package section3refactoring;

import section4inhertiance.UIControl;

public class Textbox extends UIControl {
  
  private String text = "";

  public void setText(String text) {
    this.text = text;
  }

  public void clear() {
    text = "";
  }
}