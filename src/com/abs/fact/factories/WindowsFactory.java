package com.abs.fact.factories;

import com.abs.fact.IconsButtons.IconButton;
import com.abs.fact.IconsButtons.WindowsIconButton;
import com.abs.fact.Selectables.Selectable;
import com.abs.fact.Selectables.WindowsSelectable;
import com.abs.fact.buttons.Button;
import com.abs.fact.buttons.WindowsButton;
import com.abs.fact.checkboxes.Checkbox;
import com.abs.fact.checkboxes.WindowsCheckbox;

/**
 * Cada fábrica concreta extiende de la fábrica abstracta y
 * es responsable de crear los productos de una variedad específica.
 */
public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }

    @Override
    public IconButton createIconButton() {
        return new WindowsIconButton();
    }

    @Override
    public Selectable createSelectable() {
        return new WindowsSelectable();
    }
}
