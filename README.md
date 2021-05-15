# BaseSSM

这是一个用于开发SSM架构项目的整合框架的CRUD脚手架项目
已完善项目配置文件仅需进行业务逻辑开发

## Structure

```
+---.idea
+---src
|   +---main
|   |   +---java
|   |   |   \---vip
|   |   |       \---wulinzeng
|   |   |           +---controller 
|   |   |           +---mapper   //mapper接口 方法名与mybatis映射的xml文件对应
|   |   |           +---pojo
|   |   |           \---service  //service接口
|   |   |               \---impl //实现类
|   |   +---resources  //spring springmvc mybatis
|   |   |   \---vip
|   |   |       \---wulinzeng
|   |   |           \---mapper   //映射文件
|   |   \---webapp
|   |       \---WEB-INF
|   |           \---views //视图解析器所解析的包，jsp页面都在此文件下
|   \---test
|       +---java
|       \---resources
```

## 使用

**jdbc.properties**

修改你的数据库名，数据库用户名密码，mysql8.0以上须在url添加时区。


## FAQ

```
org.springframework.beans.factory.BeanDefinitionStoreException: IOException parsing XML document from class path resource [applicationContext.xml]; nested exception is java.io.FileNotFoundException: class path resource [applicationContext.xml] cannot be opened because it does not exist at org.springframework.beans.factory.xml.XmlBeanDefinitionReader.loadBeanDefinitions(XmlBeanDefinitionReader.java:343) at org.springframework.beans.factory.xml.XmlBeanDefinitionReader.loadBeanDefinitions(XmlBeanDefinitionReader.java:303) at org.springframework.beans.factory.support.AbstractBeanDefinitionReader.loadBeanDefinitions(AbstractBeanDefinitionReader.java:187)
```

[stack overflow](https://stackoverflow.com/questions/3907833/spring-applicationcontext-xml-cannot-be-opened-because-it-does-not-exist)



## License

```
                              Apache License
                           Version 2.0, January 2004
                        http://www.apache.org/licenses/

   TERMS AND CONDITIONS FOR USE, REPRODUCTION, AND DISTRIBUTION
      Copyright [wulizeng] [name of copyright owner]

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.


```

