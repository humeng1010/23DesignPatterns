package io;

/**
 * 运行测试类
 */
public class Demo {
    public static void main(String[] args) {
        FileInputStream fileInputStream = new FileInputStream();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        int read = bufferedInputStream.read();
        System.out.println(read);
        int read1 = bufferedInputStream.read(new byte[3]);
        System.out.println(read1);
    }
}