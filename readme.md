Swagger UI在线API文档Demo

>本项目使用SSM+Mysql+Swagger完成，Swagger可以将某种固定格式的JSON数据生成可以视图的在线API文档，支持在线测试，可以清楚的观察到IO数据。

>启动项目后访问地址：http://localhost:8080/demo/api-docs ，可以查看到swagger的基本配置信息。

>访问地址：http://localhost:8080/demo/swagger/index.html ，可以直接进入api页面。


可能遇到的问题：
1. "Can't read from server. It may not have the appropriate access-control-origin settings."，此时替换一下swagger地址栏的url为自己的即可，这里可以改为http://localhost:9080/demo/api-docs ，也可以直接从/WEB-INF/swagger-ui/index.html中修改默认主页
2. 当前使用的swagger版本为2.1.5，新版本的swagger有所变动

