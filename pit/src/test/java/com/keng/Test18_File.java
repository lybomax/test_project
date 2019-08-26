package com.keng;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOCase;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.RandomUtils;
import org.junit.Test;

/**
 * @class: Test18_File
 * @title: //主题说明
 * @desc: //模块目的、功能描述
 * @author: Lyy
 * @date: 2019年08月22日 16:04
 * @since: 1.0.0
 */
public class Test18_File {

    /**
     * FilenameUtils 的使用
     */
    @Test
    public void test01() {
        String fileDirectory = "d:\\123\\234";
        String fileName = "test.txt";
        //合并目录和文件名为文件全路径
        String fileFullName = FilenameUtils.concat(fileDirectory, fileName);
        //文件路径去除目录和后缀后的文件名：userAuthority,参数可以带路径
        String baseName = FilenameUtils.getBaseName(fileName);
        //获取文件的后缀,参数可以带路径
        String extension = FilenameUtils.getExtension(fileName);
        //获取文件的完整目录
        String fullPath = FilenameUtils.getFullPath(fileFullName);
        //获取文件的完整目录不包含结束符
        String fullPathNoEndSeparator = FilenameUtils.getFullPathNoEndSeparator(fileFullName);
        //获取文件名称，包含后缀
        String name = FilenameUtils.getName(fileFullName);
        //获取最后一个/的位置
        int indexOfLastSeparator = FilenameUtils.indexOfLastSeparator(fileFullName);
        //获取当前系统格式化路径
        String normalize = FilenameUtils.normalize(fileFullName);
        List<String> extensions = new ArrayList<String>();
        extensions.add("txt");
        extensions.add("java");
        //判断文件扩展名是否包含在指定集合中
        boolean extension2 = FilenameUtils.isExtension(fileFullName, extensions);
        //判断文件扩展名是否等于指定扩展名
        boolean extension3 = FilenameUtils.isExtension(fileFullName, "txt");
        //判断文件扩展名是否包含在指定字符串数组中
        boolean extension4 = FilenameUtils.isExtension(fileFullName, new String[]{"txt", "java"});
        //判断文件扩展名是否和指定规则匹配，大小写不敏感IOCase.INSENSITIVE
        boolean wildcardMatch = FilenameUtils.wildcardMatch(fileName, "*.???", IOCase.INSENSITIVE);
    }

    /**
     * FileUtils使用
     */
    @Test
    public void test02() throws IOException {
        //获取系统临时文件夹
        File tempDirectory = FileUtils.getTempDirectory();
        //获取系统当前用户文件夹
        File userDirectory = FileUtils.getUserDirectory();
        //获取文件
        File file = FileUtils.getFile(userDirectory, "Downloads", "readme.txt");
        //指定编码读取文件为字符串
        String readFileToString = FileUtils.readFileToString(file, "UTF-8");
        //按行读取文件为集合
        List<String> readLines = FileUtils.readLines(file, "UTF-8");
        //文件比较
        //        boolean bl = FileUtils.contentEquals(file1, file2);
        //获取目录下文件，按后缀规律,true=包含子目录，false不包含子目录
        Collection<File> listFiles = FileUtils.listFiles(file.getParentFile(), new String[]{"txt"}, true);
        //创建文件，如果文件存在则更新时间；如果不存在，创建一个空文件
        FileUtils.touch(file);
        //文件copy
        //        FileUtils.copyFile(srcFile, destFile);
        //文件copy到指定目录
        //        FileUtils.copyFileToDirectory(srcFile, destDir);
        //判断文件在目录下是否存在
        boolean directoryContains = FileUtils.directoryContains(tempDirectory, file);
        //获取文件大小
        long sizeOf = FileUtils.sizeOf(FileUtils.getFile(userDirectory, "Downloads", "treeDMS-2.2.7.zip"));
        //将文件大小转为可读取字符串，返回文件的大小EB, PB, TB, GB, MB, KB or bytes
        String byteCountToDisplaySize = FileUtils.byteCountToDisplaySize(sizeOf);
        //将文件挪入指定目录
        //        FileUtils.moveFileToDirectory(srcFile, destDir, createDestDir);
        //打开文件句柄
        FileInputStream openInputStream = FileUtils.openInputStream(file);
        //将集合写入文件
        //        FileUtils.writeLines(file, lines, append);
        //字符串写入文件
        //        FileUtils.writeStringToFile(file, data,encoding);
        //文件是否为快捷方式
        boolean symlink = FileUtils.isSymlink(file);
        //文件快速下载
        URL url = new URL("http://www.baidu.com/img/baidu_logo.gif");
        //        FileUtils.copyURLToFile(url, file,connectionTimeOut,readTimeOut);
        FileUtils.copyURLToFile(url, file, 5000, 5000);
    }

    /**
     * 流操作
     */
    @Test
    public void test03() throws IOException {
        InputStream in = null;
        OutputStream out = null;
        //不抛出异常，关闭句柄
        IOUtils.closeQuietly(in);
        //流copy,不能超过Integer.MAX_VALUE字节
        int copy = IOUtils.copy(in, out);
        //拷贝较大的数据流
        long copyLarge = IOUtils.copyLarge(in, out);
        //按行读取流
        List<String> readLines = IOUtils.readLines(in);
        //将流转为byte数组
        byte[] byteArray = IOUtils.toByteArray(in);
        //将字符串等写入流
        IOUtils.write(byteArray, out);
        //跳过指定长度
        long skip = IOUtils.skip(in, 10);
        //将流转为指定编码字符串
        String str = IOUtils.toString(in, "utf-8");
    }

    @Test
    public void test04() {
        for (int i = 0; i < 100; i++) {
            System.out.print(RandomUtils.nextInt(0,5)+" ");
        }
    }
}
