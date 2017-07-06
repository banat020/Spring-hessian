# Spring-hessian
基于Hessian技术，整合Spring、Hibernate、MyBatis实现分布式服务技术架构。
<br><br>
这个技术框架已在本人所负责的项目中验证过，比起用dubbo技术的实现方式来更简便，不过功能没有dubbo的强大。如果需要容错，必须自己实现。比如：通过Nginx+tomcat的方式实现集群与负载均衡。
<br><br>
代码结构说明：<br>
1）spring-hessian-facade模块，服务接口定义。<br>
2）spring-hessian-module模块，定义消息实体。<br>
3）spring-hessian-ds模块，数据操作工具包。<br>
4）spring-hessian-server模块，这个Hessian的服务端，并且Hessian服务只能通过Servlet容器发布，如：tomcat。<br>
5）spring-hessian-client模块，这个是Hessian服务的消费端。<br>
<br><br>

应用说明：
1）在spring-hessian-ds模块的根目录下找到ds.sql，在MYSQL上执行。
2）修改spring-hessian-server/src/config/ds目录中有关数据源的配置。
3）Maven对所有模块打包。
4）将spring-hessian-server部署在一个Tomcat中。
5）将spring-hessian-web部署在另一个Tomcat中（当然也可以部署在与spring-hessian-server同一个tomcat）
