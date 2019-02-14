package com.github.fleury08.abstract_factory;

import com.github.fleury08.abstract_factory.classes.LinuxWindow;
import com.github.fleury08.abstract_factory.classes.OsxWindow;
import com.github.fleury08.abstract_factory.classes.WinWindow;
import com.github.fleury08.abstract_factory.interfaces.DesktopEnvironment;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class WindowAbstractFactory {
    public static DesktopEnvironment createWindow(String environment){
        switch (environment){
            case "osx": return OsxWindow::new;
            case "win": return WinWindow::new;
            case "linux": return LinuxWindow::new;
            default:
                throw new IllegalArgumentException("unknown "+ environment);
        }
    }
}
