System类
成员变量
System类内部包含in、out和err三个成员变量，分别代表标准输入流(键盘输入)，标准输出流(显示器)和标准错误输出流(显示器)。
成员方法
public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
int[] a = {1,2,3,4};
int[] b = new int[5];
System.arraycopy(a,1,b,3,2);
exit()方法
public static void exit(int status)
该方法的作用是退出程序。其中status的值为0代表正常退出，非零代表异常退出。使用该方法可以在图形界面编程中实现程序的退出功能等。
gc()方法
public static void gc()
该方法的作用是请求系统进行垃圾回收。至于系统是否立刻回收，则取决于系统中垃圾回收算法的实现以及系统执行时的情况。
垃圾回收时，会先调用finalize()方法，释放非java资源
currentTimeMillis方法
public static long currentTimeMillis()
以毫秒为单位返回从1970年1月1日午夜到当前时间的毫秒数
