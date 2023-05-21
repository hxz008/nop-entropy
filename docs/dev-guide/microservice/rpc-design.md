# 低代码平台中的分布式RPC框架(约3000行代码)

RPC是分布式系统设计中不可或缺的一个部分。国内开源的RPC框架很多，它们的设计大都受到了dubbo框架的影响，核心的抽象概念与dubbo类似。从今天的角度上看，dubbo的设计已经过于繁琐冗长，如果基于现在的技术环境，重新审视RPC框架的定位和设计，我们可以得到更简单、扩展性更好的实现方案。本文将介绍Nop平台中的NopRPC框架的设计思想和具体实现，它充分利用了成熟的技术设施，如IoC容器、JSON序列化、GraphQL引擎、Nacos注册中心、Sentinel熔断限流器等，通过大概3000行代码即可实现一个具备实用价值的分布式RPC框架。NopRPC具有如下特点：

1. **可以将NopGraphQL服务封装为普通的、强类型的RPC接口，同时保留GraphQL的响应字段选择能力**

2. **可以将任意支持单向信息发送和接收的消息接口封装为等待响应消息的RPC接口**

3. **Http、Socket、WebSocket、消息队列、批处理文件等都只是一种接口形式，通过配置可以将同一个服务实现适配到多种不同的接口形式**

4. **支持取消正在执行的RPC调用，取消时可以调用远程服务上的cancelMethod**

5. **支持将配对的startTask和checkTaskStatus两个调用封装为一个异步RPC接口**

6. 支持灰度发布。可以在网关处设置路由选择header，直接控制后续调用链路中的服务路由。

7. 支持广播式调用、选主调用（只调用选举得到的主服务器），以及指定服务器调用（直接指定被调用服务的地址和端口）

8. 利用NopTcc引擎实现分布式事务

9. 利用NopTask引擎实现服务端的低代码模型驱动开发

10. 支持端到端的RPC超时控制

11. 支持国际化多语言消息

12. 支持错误码映射（例如将多个内部错误码统一映射为同一个外部错误码或者将同一个错误码根据错误参数不同映射为不同的外部错误码和错误消息）

13. 支持云原生的服务网格

14. 支持GraalVM原生应用编译