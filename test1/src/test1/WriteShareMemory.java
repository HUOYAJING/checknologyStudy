package test1;

import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Create with IntelliJ IDEA
 * User: huoyajing
 * Date: 2017/3/6
 * Time: 13:53
 * To change this template use File | Settings | File Templates.
 */
public class WriteShareMemory {
    public static void main(String[] args) throws Exception {
        RandomAccessFile raf=new RandomAccessFile("d:/swap.txt","rw");
        FileChannel fc=raf.getChannel();
        MappedByteBuffer mbb=fc.map(FileChannel.MapMode.READ_WRITE,0,1024);

        for (int i=0;i<1024;i++){
            mbb.put(i, (byte) 0);
        }

        for (int i=65;i<91;i++){
            int index=i-63;
            int flag=mbb.get(0);
            if (flag!=0){
                i--;
                continue;
            }
            mbb.put(0, (byte) 1);
            mbb.put(1, (byte) index);
            System.out.println("程序WirteShareMemory"+System.currentTimeMillis()+":位置："+index+" 写入数据："+(char)i);
            mbb.put(index, (byte) i);
            mbb.put(0, (byte) 2);
            Thread.sleep(513);
        }
    }
}
