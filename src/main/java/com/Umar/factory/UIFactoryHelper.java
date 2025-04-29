package com.Umar.factory;

public class UIFactoryHelper {
    public static UIFactory createUIFactory(SupportedPlatform platform){
        if(platform.equals(SupportedPlatform.Windows)){
            return new WindowsUIFactory();
        }else if(platform.equals(SupportedPlatform.Ios)){
            return new IOSUIFactory();
        }else if(platform.equals(SupportedPlatform.Android)){
            return new AndroidUIFactory();
        }
        return null;
    }
}
