package com.Umar.factory;

import com.Umar.factory.components.button.Button;
import com.Umar.factory.components.menu.Menu;

public interface UIFactory {
   Button createButton();
    Menu createMenu();
}
