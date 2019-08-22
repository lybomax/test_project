package com.keng;

import com.pojo.User;
import com.pojo.User_JAXB;
import java.io.StringReader;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import org.junit.Test;

/**
 * @class: test01_JAXB
 * @title: //主题说明
 * @desc: //模块目的、功能描述
 * @author: Lyy
 * @date: 2019年08月21日 14:40
 * @since: 1.0.0
 */
public class test15_JAXB {

    @Test
    public void test01() throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(User_JAXB.class);
        Marshaller marshaller = context.createMarshaller();
        Unmarshaller unmarshaller = context.createUnmarshaller();

        User_JAXB user = new User_JAXB();
        user.setId(24);
        user.setName("李四");
        user.setAge(24);
        user.setUser(new User(23,"张三"));
        //格式化输出
        marshaller.setProperty(marshaller.JAXB_FORMATTED_OUTPUT,true);
        //指定编码
        marshaller.setProperty(Marshaller.JAXB_ENCODING, "utf-8");
        //需要指定xsi:schemaLocation?
//        marshaller.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, "http://www.baidu.com");
        //不显示头信息
        marshaller.setProperty(Marshaller.JAXB_FRAGMENT, true);
//        marshaller.marshal(user, new MyContentHandler());
        marshaller.marshal(user,System.out);
        System.out.println("\n============================");

        String xml="<userJAXB><id>20</id><name>张三</name><age>23</age></userJAXB>";
        User_JAXB user1 = (User_JAXB) unmarshaller.unmarshal(new StringReader(xml));
        System.out.println("user1 = " + user1);
    }
}
