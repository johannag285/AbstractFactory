package com.abs.fact.factories;

import com.abs.fact.IconsButtons.IconButton;
import com.abs.fact.IconsButtons.MacOSIconButton;
import com.abs.fact.Selectables.MacOSSelectable;
import com.abs.fact.Selectables.Selectable;
import com.abs.fact.buttons.Button;
import com.abs.fact.buttons.MacOSButton;
import com.abs.fact.checkboxes.Checkbox;
import com.abs.fact.checkboxes.MacOSCheckbox;

/**
 * Cada fábrica concreta extiende de la fábrica abstracta y
 * es responsable de crear los productos de una variedad específica.
 */
public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }

    @Override
    public IconButton createIconButton() {
        return new MacOSIconButton();
    }

    @Override
    public Selectable createSelectable() {
        return new MacOSSelectable();
    }
}
