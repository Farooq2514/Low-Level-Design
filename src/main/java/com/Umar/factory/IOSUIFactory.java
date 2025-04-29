package com.Umar.factory;

import com.Umar.factory.components.button.Button;
import com.Umar.factory.components.button.IosButton;
import com.Umar.factory.components.menu.IosMenu;
import com.Umar.factory.components.menu.Menu;

public class IOSUIFactory implements UIFactory{
    @Override
    public IosButton createButton() {
        return new IosButton();
    }

    @Override
    public IosMenu createMenu() {
        return new IosMenu();
    }
}
