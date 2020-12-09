# 实验五 模拟学生作业处理
## 一、实验目的  
1、掌握字符串String及其方法的使用  
2、掌握文件的读取/写入方法  
3、掌握异常处理结构
## 二、业务要求
在某课上，学生要提交实验结果，该结果存储在一个文本文件A中。文件A包括两部分内容：一是学生的基本信息；二是学生处理后的作业信息，该作业的业务逻辑内容是：利用已学的字符串处理知识编程完成《长恨歌》古诗的整理对齐工作，写出功能方法，实现如下功能：  
（1）每7个汉字加入一个标点符号，奇数时加“，”，偶数时加“。”  
（2）允许提供输入参数，统计古诗中某个字或词出现的次数。  
（3）输入的文本来源于文本文件B读取，把处理好的结果写入到文本文件A。  
（4）考虑操作中可能出现的异常，在程序中设计异常处理程序。
## 三、实验要求
1、设计学生类；  
2、采用交互式方式实例化某学生；  
3、设计程序完成上述的业务逻辑处理，并且把“古诗处理后的输出”结果存储到学生基本信息所在的文本文件A中。
## 四、实验过程
1、首先设计一个学生类，其中包括基本信息姓名(name)，年龄(age)，性别(sex)，学号(stunum)。编写一循环结构并实现交互，能够将学生基本信息录入；若存在输入问题，则提示。  
2、编写一处理作业信息类，新建一个txt格式的文本文件B：无标点的《长恨歌》，存入电脑盘中。向无标点的《长恨歌》中分别加入“，”和“。”，按着每七个汉字添加标点，奇数添加逗号，偶数添加句号的要求，编写循环结构，并整体输出存入一个新的文本文件A中，若存在异常，则抛出异常。  
3、编写一个异常处理类，当与输入格式不符时，弹出提示，让用户进行修改。  
4、编写一个Test类，实例化一个学生，输入其姓名，年龄，性别，学号以及作业是否导入成功界面。
## 五、实验方法
方法一:学生姓名输入的循环结构及异常处理。
```
public void inputInformation() {
	a:for(;;) {
		try{
			Scanner reader1 = new Scanner(System.in);
			System.out.println("请输入姓名");
	        name=reader1.nextLine();
	        System.out.println("录入成功");
	        break a;}
		catch(Exception e) {
			System.out.println("您输入的 “"+name+"” 格式不正确，请重新输入！");
		}}
```
方法二:学生性别输入的循环结构及异常处理。
```
b:for(;;) {
	try{
	Scanner reader2 = new Scanner(System.in);
	System.out.println("请输入性别（中文）");
	sex=reader2.nextLine();
	sexJudge(sex);
	break b;}
	catch(JudgeException e) {
		System.out.println(e.JudgeException(sex));}}
```
方法三:学生年龄输入的循环结构及异常处理。
```
c:for(;;) {
		try{
			Scanner reader3 = new Scanner(System.in);
			System.out.println("请输入年龄（15-35岁）");
			age=reader3.nextInt();
		    ageJudge(age);
		    break c;}
		catch(JudgeException e) {
			System.out.println(e.JudgeException(age));}}
```
方法四:学生学号输入的循环结构及异常处理。
```
d:for(;;){
		try{
			Scanner reader= new Scanner(System.in);
			System.out.println("请输入学号");
			stuNum=reader.nextLine();
	        System.out.println("录入成功");
	        break d;}
		catch(Exception e) {
			System.out.println("您输入的“"+stuNum+"”格式不正确，请重新输入！");}}
```
方法五:学生性别是否录入的循环结构及抛出新的异常处理。
```
public void sexJudge(String sex) throws JudgeException{
	String x="男";
	String y="女";
	if (sex.equals(x)||sex.equals(y)){
		System.out.println("录入成功");
		}
	else throw new JudgeException();
}
```
方法六:学生年龄是否录入的循环结构及抛出新的异常处理。
```
public void ageJudge(int age) throws JudgeException{
	int x=15;
	int y=35;
	if (age>=x&&age<=y){
		System.out.println("录入成功");
		}
	else throw new JudgeException();
}
```
方法七:向文本文件中的内容加标点的循环结构，若存在异常则抛出。
```
for(int i = 0;i<longer.length();i=i+7){
				 a=new char[7];
				 try {
					 longer.getChars(i, i+7, a, 0);} 
         catch(Exception ex){
			     System.out.println("error");}
				s = String.valueOf(a);
				if(l==null){
					l=s;}
				else if(l!=null)
					l=l+s;
				if(((i+7)/7)%2==1) {
					l=l+",";}
				else if(((i+7)/7)%2==0) {
	                l=l+"。\n";}}
			return l;
```
方法八:将产生新的文本文件存入E盘内，出现异常则抛出。
```
try {   File file = new File("E:\\A.txt");
				OutputStream out = new FileOutputStream(file,true);
	            out.write(b);
	            out.flush();
	            out.close(); }
			catch (IOException e) {
				System.out.println("File read error:"+e);}
			 return true;
```
方法九:生成最终输出页面，输出学生基本信息及作业是否成功导入。
```
public static void main(String[] args) {
		  System.out.println("**********学生信息录入**********");
		  student0.inputInformation(); 
		  System.out.println("\n\n个人信息：");
		  System.out.println("姓名 性别 年龄 学号");
    	System.out.println(student0.name+"   "+student0.sex+"    "+student0.age+"    "+student0.stuNum);
		String a=file.readFile();
		String b = file.operationFile(a);
		if(file.outFile(addNewInformation(student0)))
		System.out.println("信息导入成功！");
		if(file.outFile(b))
			System.out.println("作业导入成功！");}
```
方法十:输入格式错误弹出提示。
```
public String JudgeException(String input) {
		message = "您输入的“"+input+"”不正确，请输入正确性别！";
		return message;
	}
	public String JudgeException(int input) {
		message = "您输入的“"+input+"”不正确，请输入正确年龄！";
		return message;
	}
```
## 六、实验结果
![实验4截图.jpg](https://i.loli.net/2020/12/09/cFtoGduw8XZp1I9.jpg)
## 七、实验感想
此次实验是进行文件操作的处理，能够基本掌握字符串String及其方法的使用以及文件的读取/写入方法，并向其中加入异常处理结构。在处理时感觉有一定的难度，因此经常与同学一起进行讨论和修改，希望在以后的学习中可以更加理解这方面的内容。
