package Practice.Patterns.Creational.AbstractFactory;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory guiFactory) {
        button = guiFactory.createButton();
        checkbox = guiFactory.createCheckbox();
    }

    public void onClickButton(){
        button.onClick();
    }
}
