项目介绍

小狐用户中心，基于 Spring Boot + React 的前后端分离用户管理系统，实现了用户注册登录、查询管理等功能。

![image](https://github.com/user-attachments/assets/a3b1b101-f657-42ee-b844-2606c6af5a72)

#### 业务流程

![image](https://github.com/user-attachments/assets/9b086138-421f-42a9-9beb-3234764ae723)

#### 技术选型
- 前端
  - Ant Design Pro
- 后端
  - Spring Boot
  - MyBatis-Plus
  - MySQL
- 其他
  - nginx
  - docker

#### 前端
- 选用Ant Design Pro脚手架快速搭建基础页面，进行项目瘦身、抽象为可复用的公共模板，方便后续同类项目开发，提升开发效率；
- 改造umi-request请求库，添加全局请求拦截和异常处理逻辑，减少重复代码，提升用户体验；
- 本地开发中，通过Ant Design Pro框架提供的代理实现对后端dev环境的跨域访问；
- 在全局请求配置中，使用NODE_ENV环境变量区分本地环境和生产环境，根据项目启动命令自动区分环境；

#### 后端
- 选用MyBatis-Plus进行数据访问层开发，复用通用方法，大幅提升项目开发效率；
- 使用双重检查锁（Double-Check Locking），实现在多线程下保持创建单例对象的高效性；
- 通过AOP封装全局异常处理器，规范异常返回，屏蔽项目冗余报错细节；
- 采用Docker容器部署后端项目，Nginx部署前端项目，并且使用宝塔面板进行运维监控；
- 通过Spring Boot的多套application-{env}.yml配置文件实现多环境，并使用--spring.profiles.active=prod参数实现生产环境部署；
- 使用Nginx网关统一接收前后端请求，并采用其proxy_pass（反向代理）配置解决跨域访问问题。
