import java.io.File;
import java.util.Arrays;

public abstract class Z3 {
    public static File[] groupAndSort(File[] files){
        Arrays.sort(files,(f1,f2) -> {
            if(f1.isDirectory() && f2.isDirectory()){
                return f1.getName().compareTo(f2.getName());
            } else if (!f1.isDirectory() && !f2.isDirectory()) {
                return f1.getName().compareTo(f2.getName());
            } else {
                if(f1.isDirectory()){
                    return -1;
                } else {
                    return 1;
                }
            }
        });
        return files;
    }

}