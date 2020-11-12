import org.tinylog.Logger;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;


public class JavaLog {
    public static void main(String[] args) {
        Path path = Paths.get("src/main/resources/template/Untitled-1.html");
        try {
//            List<String> list = Files.readAllLines(path);
//            StringBuilder sb = new StringBuilder();
//            list.forEach(x->sb.append(x));
//            Logger.info(sb.toString());
//            Logger.debug(sb.toString());
            Logger.info("AAAAAAAAAAAAAAAAAAA");
            Logger.error("BBBBBBBBBBBBBBBBB");
            LogTest.throwExecption();
            throw new Exception("SSSSSSSSSSSSSSSSSSSSSSSSSSS");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
            Logger.error(e);
        }
    }
}
