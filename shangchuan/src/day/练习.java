//设计一个星座时运程序，提供一下功能：
//推送当前月份星座时运信息
//提供查询功能，用户输入出生年月日即可查询自己的星座信息，根据用户选择提供相应的功能
package day;

import java.util.Scanner;

public class 练习 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner p= new Scanner(System.in);
		System.out.print("请输入月份：");
		int a=p.nextInt();
		if(a>12||a<1) {
			System.out.println("输入错误，请重新输入");
		}
		switch(a) {
		case 1:
			System.out.print("请输入第几天：");
			int b=p.nextInt();
			if(1<=b&&b<=31) {
			if(b>20||b==20) {
				System.out.println("双鱼座");
			}else if(b<20){
			System.out.println("摩羯座");
			}
			}else
			System.out.println("你输入的日期错误");
			break;
		case 2:
			System.out.print("请输入第几天：");
			int c=p.nextInt();
			if(1<=c&&c<=29) {
			if(c>19||c==19) {
				System.out.println("摩羯座");
			}else if(c<19){
			System.out.println("水瓶座");
			}
			}else
			System.out.println("你输入的日期错误");
			break;
		case 3:
			System.out.print("请输入第几天：");
			int d=p.nextInt();
			if(1<=d&&d<=31) {
			if(d>21||d==21) {
				System.out.println("水平座");
			}else if(d<20){
			System.out.println("双鱼座");
			}
			}else
			System.out.println("你输入的日期错误");
			break;
		case 4:
			System.out.print("请输入第几天：");
			int e=p.nextInt();
			if(1<=e&&e<=30) {
			if(e>20||e==20) {
				System.out.println("金牛座");
			}else if(e<20){
			System.out.println("白羊座");
			}
			}else
			System.out.println("你输入的日期错误");
			break;
		case 5:
			System.out.print("请输入第几天：");
			int f=p.nextInt();
			if(1<=f&&f<=31) {
			if(f>21||f==21) {
				System.out.println("双子座");
			}else if(f<20){
			System.out.println("金牛座");
			}
			}else
			System.out.println("你输入的日期错误");
			break;
		case 6:
			System.out.print("请输入第几天：");
			int i=p.nextInt();
			if(1<=i&&i<=30) {
			if(i>22||i==22) {
				System.out.println("巨蟹座");
			}else if(i<20){
			System.out.println("双子座");
			}
			}else
			System.out.println("你输入的日期错误");
			break;
		case 7:
			System.out.print("请输入第几天：");
			int j=p.nextInt();
			if(1<=j&&j<=31) {
			if(j>23||j==23) {
				System.out.println("狮子座");
			}else if(j<20){
			System.out.println("巨蟹座");
			}
			}else
			System.out.println("你输入的日期错误");
			break;
		case 8:
			System.out.print("请输入第几天：");
			int k=p.nextInt();
			if(1<=k&&k<=31) {
			if(k>23||k==23) {
				System.out.println("处女座");
			}else if(k<20){
			System.out.println("狮子座");
			}
			}else
			System.out.println("你输入的日期错误");
			break;
		case 9:
			System.out.print("请输入第几天：");
			int l=p.nextInt();
			if(1<=l&&l<=30) {
			if(l>23||l==23) {
				System.out.println("天枰座");
			}else if(l<20){
			System.out.println("处女座");
			}
			}else
			System.out.println("你输入的日期错误");
			break;
		case 10:
			System.out.print("请输入第几天：");
			int m=p.nextInt();
			if(1<=m&&m<=31) {
			if(m>24||m==24) {
				System.out.println("天蝎座");
			}else if(m<20){
			System.out.println("天枰座");
			}
			}else
			System.out.println("你输入的日期错误");
			break;
		case 11:
			System.out.print("请输入第几天：");
			int n=p.nextInt();
			if(1<=n&&n<=30) {
			if(n>23||n==23) {
				System.out.println("射手座");
			}else if(n<20){
			System.out.println("天蝎座");
			}
			}else
			System.out.println("你输入的日期错误");
			break;
		case 12:
			System.out.print("请输入第几天：");
			int o=p.nextInt();
			if(1<=o&&o<=31) {
			if(o>22||o==22) {
				System.out.println("摩羯座");
			}else if(o<20){
			System.out.println("射手座");
			}
			}else
			System.out.println("你输入的日期错误");
			break;
		}
	}

}
