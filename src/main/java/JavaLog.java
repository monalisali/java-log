import org.tinylog.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;


public class JavaLog {
    public static void main(String[] args) {
        System.out.println("请输入当前需要处理的品类名称，如：保温饭盒，按回车键结束。它会作为执行结果的文件夹和文件前缀");
        String keyword = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            keyword = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("关键字： " + keyword);

        Path path = Paths.get("src/main/resources/template/Untitled-1.html");
        try {
            List<String> list = Files.readAllLines(path);
            StringBuilder sb = new StringBuilder();
            list.forEach(x->sb.append(x));
            Logger.info(sb.toString());
            Logger.debug(sb.toString());
            //Logger.info("AAAAAAAAAAAAAAAAAAA");
            //Logger.error("BBBBBBBBBBBBBBBBB");
            //LogTest.throwExecption();
            //throw new Exception("SSSSSSSSSSSSSSSSSSSSSSSSSSS");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
            Logger.error(e);
        }
    }
}
