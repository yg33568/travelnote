本地生活探店平台（TravelNote）

🎯 项目介绍

本项目是一个面向本地生活服务的探店平台后端系统，为用户提供探店笔记发布、点赞收藏、关注互动、优惠券秒杀、商户查询、分布式锁等核心功能，同时集成了Redis缓存优化、Redisson分布式锁、MySQL数据存储等技术方案，支持高并发场景下的稳定运行。

🚀 技术栈

```
技术	           版本	        说明
Java	           17	        后端核心语言
Spring Boot  	   2.3.12  	  应用快速开发框架
MyBatis-Plus	   3.4.3    	ORM增强工具
MySQL            8.0	      关系型数据存储
Redis	           6.x        缓存、分布式锁、Session共享
Redisson	       3.13.6	    分布式锁实现
Hutool           5.7.17	    Java工具类库
```

✨ 核心功能

```
1. 用户模块
用户注册、登录、短信验证码登录
用户信息管理、个人主页展示
用户关注、粉丝列表、互关状态查询

2. 探店笔记模块
探店笔记发布、修改、删除
笔记点赞、收藏、评论功能
笔记分页查询、热门笔记推荐
笔记详情查询、评论列表展示

3. 商户模块
商户信息查询、分类查询
商户地理位置搜索、附近商户推荐
商户优惠券、秒杀活动管理

4. 秒杀与分布式锁模块
优惠券秒杀、库存扣减
Redisson 分布式锁实现，防止超卖
秒杀接口防刷、限流优化

5. 工具与基础模块
全局异常处理、统一返回结果封装
Redis 工具类、分布式锁工具类
分页工具、日期工具等通用能力
```
📁 项目结构
```
travelnote/
├── src/main/java/com/localshop/travelnote/
│   ├── config/          # 配置类（Redis、Redisson、全局异常等）
│   ├── controller/      # 接口控制层（用户、笔记、商户、秒杀等）
│   ├── service/         # 业务逻辑层
│   │   └── impl/        # 业务实现类
│   ├── mapper/          # MyBatis Plus 数据访问层
│   ├── dto/             # 实体类
│   ├── utils/           # 工具类（Redis、分布式锁、验证码等）
│   ├── entity/          # 
│   ├── interceptor/     #
│   ├── listener/        # 
│   └── TravelNoteApplication.java  # 项目启动类
├── src/main/resources/
│   ├── mapper/          # MyBatis XML文件
│   ├── db/              #
│   ├── seckill.lua      # 
│   ├── unLock.lua       # 
│   └── application.yml  # 项目配置文件
├── pom.xml              # Maven 依赖配置
└── README.md            # 项目说明文档
```

🚀 快速启动
```
环境要求
JDK 17+
Maven 3.6+
MySQL 8.0+
Redis 6.x+
```

启动步骤
1.克隆项目
```
git clone https://github.com/你的GitHub用户名/travelnote.git
cd travelnote
```
2.数据库配置
```
新建 MySQL 数据库 travelnote
执行项目根目录下的 sql/travelnote.sql 初始化表结构和数据
修改 application.yml 中的 MySQL 连接信息：

spring:
  datasource:
    url: jdbc:mysql://localhost:3306/travelnote?useSSL=false&serverTimezone=UTC
    username: 你的数据库用户名
    password: 你的数据库密码
    driver-class-name: com.mysql.cj.jdbc.Driver
```
3.Redis 配置
```
启动本地 Redis 服务（默认端口 6379）
修改 application.yml 中的 Redis 连接信息（如非默认配置）：

spring:
  redis:
    host: localhost
    port: 6379
    password: 你的Redis密码（无则留空）
```
4.项目启动
```
使用 IDEA 打开项目，执行 Maven 依赖下载
运行 TravelNoteApplication.java 启动项目
项目启动成功后，访问 http://localhost:8081 即可测试接口
```

📝 接口文档
```
项目启动后，可通过 Postman 等工具测试接口，核心接口如下：

用户登录：POST /user/login
发布笔记：POST /blog
笔记列表：GET /blog/hot
商户查询：GET /shop/{id}
秒杀优惠券：POST /voucher_order
关注用户：POST /follow/{id}

完整接口文档可参考项目代码中的 Controller 层实现。
```

🔧 性能优化策略
```
缓存穿透防护：空值缓存 + 布隆过滤器
缓存雪崩防护：随机过期时间 + 热点数据永不过期
秒杀场景：Redis预减库存 + Lua脚本保证原子性
Feed流推送：拉模式 + 分页滚动加载
```

📄 许可证

本项目仅供学习交流使用，禁止用于商业用途。

👤 作者
```
GitHub：yg33568
如有问题欢迎提交Issue或邮件联系
```
