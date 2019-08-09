# spring-logback
日志输出

在 logback-*.xml文件中有详细的配置说明，我们可以根据需求进行相应的修改。
特别注意，如果我们要把logback-*.xml文件方法服务器上面跑，由于服务器是不存在路径这样的说法，所以不能保存到文件夹，只能输出到控制台
这时我们需要将   "ch.qos.logback.core.rolling.RollingFileAppender"   这样的类删除掉，否则在服务器云上运行会出异常，这样的语句只能出现在本地机上运行
