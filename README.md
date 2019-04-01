# EPPDEV-MLIB

## 说明

EPPDEV-MLIB是一个针对机器学习的实时计算Java工具集，主要实现了常用机器学习模型的固化、加载和实时运算。

其中模型的固化方式支持两种：

* 数据库方式：将建模结果固化到数据库中，通过读取数据库的配置完成模型的计算
* pmml方式：将建模结果固化到pmml文件中，通过读取文件配置完成模型计算


模型计算支持以下两种方式：

* 实时接口方式：提供Rest API接口供外部进行调用
* 批量计算方式：提供控制台命令实现批量输入输出完成接口调用


## 许可

版权所有： 2019， [郝金隆](mailto:jinlong.hao@eppdev.cn)
软件许可： [996 License v1.0](LICENSE-CN)