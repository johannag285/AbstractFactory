package com.abs.fact.example;

import com.abs.fact.app.Application;
import com.abs.fact.factories.GUIFactory;
import com.abs.fact.factories.MacOSFactory;
import com.abs.fact.factories.WindowsFactory;

/**
 * Clase demo. Todos los recursos se visualizan aquí.
 */
public class Demo {

    //TODO Definir al menos 2 elementos visuales adicionales en la fábrica abstracta e implementar su creación.
    //TODO Extender el ejemplo para crear elementos visuales en linux.

    public static void main(String[] args) {

        GUIFactory concreteGuiFactory;
        Application appClient;

        String osName = "Linux";

        switch (osName){
            case "mac":
                concreteGuiFactory = new MacOSFactory();
                appClient = new Application(concreteGuiFactory);
                break;
            case "win":
                concreteGuiFactory = new WindowsFactory();
                appClient = new Application(concreteGuiFactory);
                break;
            case "Linux":
                concreteGuiFactory = new WindowsFactory();
                appClient = new Application(concreteGuiFactory);
                break;
            default:
                System.out.println("Error! No se definió un SO válido.");
                appClient = null;
                break;
        }

        if (appClient != null){
            appClient.paintButton();
            appClient.paintCheckbox();
            appClient.paintIconButton();
            appClient.paintSelectable();
        }

    }

}
