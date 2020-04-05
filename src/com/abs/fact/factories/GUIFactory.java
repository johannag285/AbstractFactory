package com.abs.fact.factories;

import com.abs.fact.IconsButtons.IconButton;
import com.abs.fact.Selectables.Selectable;
import com.abs.fact.buttons.Button;
import com.abs.fact.checkboxes.Checkbox;

/**
 * La fábrica abstracta (Interfaz) conoce los tipos de productos que se crean.
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
    IconButton createIconButton();
    Selectable createSelectable();
}

