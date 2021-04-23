Runtime类
作用：使应用程序与其运行的环境相关联
通过使用getRuntime()静态方法获得实例。
exec(String command)在单独的进程中执行指定的字符串命令，该方法返回Process对象，使用Process对象的destroy()方法可以杀掉进程

