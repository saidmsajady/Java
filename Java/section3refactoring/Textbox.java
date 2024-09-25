package section3refactoring;

import section4inhertiance.UIControl;

public class Textbox extends UIControl {

  private String text = "";

  public Textbox () {
    // super(true);
  }

  @Override
  public String toString() {
    return text;
  }

  @Override
  public void render() {
    System.out.println("Render Textbox");
  }

  public void setText(String text) {
    this.text = text;
  }

  public void clear() {
    text = "";
  }
}