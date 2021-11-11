import java.io.*;

/**
 * Project name(项目名称)：自动资源管理
 * Package(包名): PACKAGE_NAME
 * Class(类名): test2
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/11
 * Time(创建时间)： 18:48
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class test2
{
    public static void main(String[] args) throws IOException
    {
        // 有final修饰的资源
        final BufferedReader br = new BufferedReader(new FileReader("test.java"));
        // 没有显式使用final修饰，但只要不对该变量重新赋值，该变量就是有效的
        final PrintStream ps = new PrintStream(new FileOutputStream("abc. txt"));
        // 只要将两个资源放在try后的圆括号内即可
        try (br; ps)
        {
            // 使用两个资源
            System.out.println(br.readLine());
            ps.println("hello world");
        }
    }
}
