package com.Umar.factory;

import com.Umar.factory.components.button.AndroidButton;
import com.Umar.factory.components.menu.AndroidMenu;

public class AndroidUIFactory implements UIFactory {
    @Override
    public AndroidButton createButton() {
        return new  AndroidButton();
    }

    @Override
    public AndroidMenu createMenu() {
        return new  AndroidMenu();
    }
}
