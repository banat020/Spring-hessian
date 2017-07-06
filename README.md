# Spring-hessian
基于Hessian技术，整合Spring、Hibernate、MyBatis实现分布式服务技术架构。<br>
为什么要同时整合Hibernate与MyBatis呢？因为，对数据的增删改，Hibernate提供简单的实现，不过，对于复杂的查询，尤其是动态查询，Hibernate的实现就显得比较麻烦了，于是，再集合MyBatis3，用于处理数据查询，并且用MyBatis查询还有性能更优的好处。<br>
还有另一点，技术框架只对Hibernate的操作应用事务，MyBatis的操作不启用事务。<br>
<br><br>

这个技术框架已在本人所负责的项目中验证过，比起用dubbo技术的实现方式来更简便，不过功能没有dubbo的强大。如果需要容错，必须自己实现。比如：通过Nginx+tomcat的方式实现集群与负载均衡。
<br><br>

代码结构说明：<br>
1）spring-hessian-facade模块，服务接口定义。<br>
2）spring-hessian-module模块，定义消息实体。<br>
3）spring-hessian-ds模块，数据操作工具包。<br>
4）spring-hessian-server模块，这个Hessian的服务端，并且Hessian服务只能通过Servlet容器发布，如：tomcat。集成了SpringMVC。<br>
5）spring-hessian-client模块，这个是Hessian服务的消费端。集成了SpringMVC。<br>
<br><br>

应用说明：<br>
1）在spring-hessian-ds模块的根目录下找到ds.sql，在MYSQL上执行。<br>
2）修改spring-hessian-server/src/config/ds目录中有关数据源的配置。<br>
3）Maven对所有模块打包。<br>
4）将spring-hessian-server部署在一个Tomcat中。<br>
5）将spring-hessian-web部署在另一个Tomcat中（当然也可以部署在与spring-hessian-server同一个tomcat）。访问首页，上面有几个访问Hessian服务的链接。<br>
