package com.Umar.factory;

import com.Umar.factory.components.button.Button;
import com.Umar.factory.components.menu.Menu;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        UIFactory uiFactory = flutter.CreateUIFactory(SupportedPlatform.Windows);
        Button button = uiFactory.createButton();
        Menu menu = uiFactory.createMenu();
        menu.showMenu();
        button.clickButton();
    }
}
