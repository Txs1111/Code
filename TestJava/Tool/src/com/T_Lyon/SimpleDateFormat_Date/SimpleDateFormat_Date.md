��.Date����SimpleDateFormat��
Date�ࣺ��ʾ���ں�ʱ��
�ṩ�������ں�ʱ�����ɲ��ֵķ���
SimpleDateFormat��
���ڶ�������ʱ��ĸ�ʽ
Date date = new Date();    //�������ڶ���  
SimpleDateFormat sdf= new SimpleDateFormat("yyyy-  
MM-dd HH:mm:ss");//�������ڸ�ʽ
String now = sdf.format(date);
System.out.println(now);