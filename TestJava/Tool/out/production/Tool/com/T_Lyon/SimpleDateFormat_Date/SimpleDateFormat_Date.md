五.Date类与SimpleDateFormat类
Date类：表示日期和时间
提供操作日期和时间各组成部分的方法
SimpleDateFormat类
用于定制日期时间的格式
Date date = new Date();    //创建日期对象  
SimpleDateFormat sdf= new SimpleDateFormat("yyyy-  
MM-dd HH:mm:ss");//定制日期格式
String now = sdf.format(date);
System.out.println(now);