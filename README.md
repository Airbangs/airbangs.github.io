1、网站项目名称为ccshop;

2、目前实使用Spring Boot, Spring JPA实现了一个user模块的curd，其RESTful API设计如下：
请求类型          url            功能说明
get             /users          查询用户列表
post            /users          创建一个用户
get             /users/id       根据id查询一个用户
put             /users/id       同上
delete          /users/id       同上

3、另外在ApplicationTests中对已实现的接口进行了单元测试。