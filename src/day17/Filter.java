package day17;

import java.io.File;
import java.io.FileFilter;

public class Filter implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        if(pathname.getName().endsWith("java")){
            return true;
        }
        else {
            return false;
        }
    }
}
