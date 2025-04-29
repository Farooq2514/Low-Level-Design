package com.Umar.factory;

import com.Umar.factory.components.button.Button;
import com.Umar.factory.components.button.WindowsButton;
import com.Umar.factory.components.menu.Menu;
import com.Umar.factory.components.menu.WindowsMenu;

public class WindowsUIFactory implements UIFactory {
    @Override
    public WindowsButton createButton() {
        return new WindowsButton();
    }

    @Override
    public WindowsMenu createMenu() {
        return new WindowsMenu();
    }
}
