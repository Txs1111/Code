一.Math类
Math 类提供了一序列基本数学运算和几何函数的方法。
Math类是final类，并且它的所有成员变量和成员方法**都是静态**的。
Math类的常用属性和方法：
静态常量－－PI ：圆周率的double值
静态方法：
double pow (double a, double b) 计算 a 的 b 次方
double sqrt  (double a)     计算给定值的平方根
int abs (int a)     计算 int 类型值 a的绝对值，也接收 long、float 和 double 类型的参数
double ceil (double a)  返回大于等于 a的最小整数的double值
double floor (double a)     返回小于等于 a的最大整数的double值
int max(int a, int b)   返回 int 型值 a 和 b 中的较大值，也接收 long、float 和 double 类型的参数
int min(int a, int b)   返回 a 和 b 中的较小值，也可接收 long、float 和 double 类型的参数
int round(float a); 四舍五入返回整数
double random() 返回带正号的double值，该值大于等于0.0且小于1.0![]
