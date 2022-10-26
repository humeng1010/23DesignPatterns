package io;

/**
 * 装饰类：继承InputStream拓展原始类的功能
 */
public class BufferedInputStream extends InputStream {
    private final InputStream inputStream;

    public BufferedInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    @Override
    public int read() {
        System.out.println("提供8kb缓冲区");
        return inputStream.read();
    }

    @Override
    public int read(byte[] buffer) {
        System.out.println("提供8kb缓冲区");
        return inputStream.read(buffer);
    }
}