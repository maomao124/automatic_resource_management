import java.io.*;

/**
 * Project name(项目名称)：自动资源管理
 * Package(包名): PACKAGE_NAME
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/11
 * Time(创建时间)： 18:35
 * Version(版本): 1.0
 * Description(描述)：
 * try 语句中声明的资源被隐式声明为 final，资源的作用局限于带资源的 try 语句。
 * 可以在一条 try 语句中声明或初始化多个资源，每个资源以;隔开即可。
 * 需要关闭的资源必须实现了 AutoCloseable 或 Closeable 接口。
 */

public class test
{
    public static void main(String[] args)
    {
        try
                (
                        // 声明、初始化两个可关闭的资源
                        // try语句会自动关闭这两个资源
                        BufferedReader br = new BufferedReader(new FileReader("test.java"));
                        PrintStream ps = new PrintStream(new FileOutputStream("abc.txt"))
                )
        {
            // 使用两个资源
            System.out.println(br.readLine());
            ps.println("C语言中文网");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
