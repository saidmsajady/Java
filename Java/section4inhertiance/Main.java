package section4inhertiance;

import section3refactoring.Textbox;

public class Main {

    public static void main(String[] args) {
        
        UIControl[] controls = { new Textbox(), new Checkbox()};

        for ( var control : controls ) {
            control.render();
        }

    }

}
