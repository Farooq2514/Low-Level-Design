package com.Umar.factory;

public class Flutter {
    //Non factory methods
    public void setTheme(){
        System.out.println("Setting theme");
    }
    public void reset(){
        System.out.println("Reset theme");
    }
  public UIFactory CreateUIFactory(SupportedPlatform platform){
        return UIFactoryHelper.createUIFactory(platform);
  }
}
