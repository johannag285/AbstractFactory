package com.abs.fact.app;

import com.abs.fact.IconsButtons.IconButton;
import com.abs.fact.Selectables.Selectable;
import com.abs.fact.buttons.Button;
import com.abs.fact.checkboxes.Checkbox;
import com.abs.fact.factories.GUIFactory;


/**
 * Los usuarios de Factory escogen el tipo de fábrica y el tipo de componente
 * que desean crear mediante sus interfaces, pero no interactúan con fábricas concretas.
 */
public class Application {
    private final Button button;
    private final Checkbox checkbox;
    private final IconButton iconButton;
    private final Selectable selectable;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
        iconButton = factory.createIconButton();
        selectable = factory.createSelectable();
    }

    public void paintCheckbox() {
        checkbox.paint();
    }

    public void paintButton(){
        button.paint();
    }
    
    public void paintIconButton(){
        iconButton.paint();
    }
    
    public void paintSelectable(){
        selectable.paint();
    }
}
