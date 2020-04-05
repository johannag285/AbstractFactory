/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abs.fact.factories;

import com.abs.fact.IconsButtons.IconButton;
import com.abs.fact.IconsButtons.LinuxIconButton;
import com.abs.fact.Selectables.LinuxSelectable;
import com.abs.fact.Selectables.Selectable;
import com.abs.fact.buttons.Button;
import com.abs.fact.buttons.LinuxButton;
import com.abs.fact.checkboxes.Checkbox;
import com.abs.fact.checkboxes.LinuxChecbox;

/**
 *
 * @author Johanna
 */
public class LinuxFactory implements GUIFactory{

    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return  new  LinuxChecbox();
    }

    @Override
    public IconButton createIconButton() {
        return  new  LinuxIconButton();
    }

    @Override
    public Selectable createSelectable() {
        return new  LinuxSelectable();
    }
    
}
