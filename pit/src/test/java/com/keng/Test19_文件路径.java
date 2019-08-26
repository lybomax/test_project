package com.keng;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.junit.Test;

/**
 * @class: Test19_文件路径
 * @title: //主题说明
 * @desc: //模块目的、功能描述
 * @author: Lyy
 * @date: 2019年08月26日 10:09
 * @since: 1.0.0
 */
public class Test19_文件路径 {

    @Test
    public void test01() {
        //windows中  \\ 相当于 /  而在linux中  一般用 /  所以windows中  建议使用  /
        String s1 = "E:\\log\\1.txt";
        String s2 = "E:/log/2.txt";

        //创建文件
        Path path1 = Paths.get(s1);
        try {
            if (!Files.exists(path1)) {
                Files.createFile(path1);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //写文件
        try {
            BufferedWriter writer = Files.newBufferedWriter(Paths.get("E:\\log\\1.txt"), StandardCharsets.UTF_8);
            writer.write("测试文件写操作");
            writer.flush();
            writer.close();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        //读文件
        try {
            // Charset.forName("GBK")
            BufferedReader reader = Files.newBufferedReader(Paths.get("E:\\log\\1.txt"), StandardCharsets.UTF_8);
            String str = null;
            while ((str = reader.readLine()) != null) {
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        //        Path path2 = Paths.get(s2);
        //        try {
        //            if (!Files.exists(path2)) {
        //                Files.createFile(path2);
        //            }
        //        } catch (IOException e) {
        //            e.printStackTrace();
        //        }

    }
}
