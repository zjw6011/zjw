//���һ������ʱ�˳����ṩһ�¹��ܣ�
//���͵�ǰ�·�����ʱ����Ϣ
//�ṩ��ѯ���ܣ��û�������������ռ��ɲ�ѯ�Լ���������Ϣ�������û�ѡ���ṩ��Ӧ�Ĺ���
package day;

import java.util.Scanner;

public class ��ϰ {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner p= new Scanner(System.in);
		System.out.print("�������·ݣ�");
		int a=p.nextInt();
		if(a>12||a<1) {
			System.out.println("�����������������");
		}
		switch(a) {
		case 1:
			System.out.print("������ڼ��죺");
			int b=p.nextInt();
			if(1<=b&&b<=31) {
			if(b>20||b==20) {
				System.out.println("˫����");
			}else if(b<20){
			System.out.println("Ħ����");
			}
			}else
			System.out.println("����������ڴ���");
			break;
		case 2:
			System.out.print("������ڼ��죺");
			int c=p.nextInt();
			if(1<=c&&c<=29) {
			if(c>19||c==19) {
				System.out.println("Ħ����");
			}else if(c<19){
			System.out.println("ˮƿ��");
			}
			}else
			System.out.println("����������ڴ���");
			break;
		case 3:
			System.out.print("������ڼ��죺");
			int d=p.nextInt();
			if(1<=d&&d<=31) {
			if(d>21||d==21) {
				System.out.println("ˮƽ��");
			}else if(d<20){
			System.out.println("˫����");
			}
			}else
			System.out.println("����������ڴ���");
			break;
		case 4:
			System.out.print("������ڼ��죺");
			int e=p.nextInt();
			if(1<=e&&e<=30) {
			if(e>20||e==20) {
				System.out.println("��ţ��");
			}else if(e<20){
			System.out.println("������");
			}
			}else
			System.out.println("����������ڴ���");
			break;
		case 5:
			System.out.print("������ڼ��죺");
			int f=p.nextInt();
			if(1<=f&&f<=31) {
			if(f>21||f==21) {
				System.out.println("˫����");
			}else if(f<20){
			System.out.println("��ţ��");
			}
			}else
			System.out.println("����������ڴ���");
			break;
		case 6:
			System.out.print("������ڼ��죺");
			int i=p.nextInt();
			if(1<=i&&i<=30) {
			if(i>22||i==22) {
				System.out.println("��з��");
			}else if(i<20){
			System.out.println("˫����");
			}
			}else
			System.out.println("����������ڴ���");
			break;
		case 7:
			System.out.print("������ڼ��죺");
			int j=p.nextInt();
			if(1<=j&&j<=31) {
			if(j>23||j==23) {
				System.out.println("ʨ����");
			}else if(j<20){
			System.out.println("��з��");
			}
			}else
			System.out.println("����������ڴ���");
			break;
		case 8:
			System.out.print("������ڼ��죺");
			int k=p.nextInt();
			if(1<=k&&k<=31) {
			if(k>23||k==23) {
				System.out.println("��Ů��");
			}else if(k<20){
			System.out.println("ʨ����");
			}
			}else
			System.out.println("����������ڴ���");
			break;
		case 9:
			System.out.print("������ڼ��죺");
			int l=p.nextInt();
			if(1<=l&&l<=30) {
			if(l>23||l==23) {
				System.out.println("������");
			}else if(l<20){
			System.out.println("��Ů��");
			}
			}else
			System.out.println("����������ڴ���");
			break;
		case 10:
			System.out.print("������ڼ��죺");
			int m=p.nextInt();
			if(1<=m&&m<=31) {
			if(m>24||m==24) {
				System.out.println("��Ы��");
			}else if(m<20){
			System.out.println("������");
			}
			}else
			System.out.println("����������ڴ���");
			break;
		case 11:
			System.out.print("������ڼ��죺");
			int n=p.nextInt();
			if(1<=n&&n<=30) {
			if(n>23||n==23) {
				System.out.println("������");
			}else if(n<20){
			System.out.println("��Ы��");
			}
			}else
			System.out.println("����������ڴ���");
			break;
		case 12:
			System.out.print("������ڼ��죺");
			int o=p.nextInt();
			if(1<=o&&o<=31) {
			if(o>22||o==22) {
				System.out.println("Ħ����");
			}else if(o<20){
			System.out.println("������");
			}
			}else
			System.out.println("����������ڴ���");
			break;
		}
	}

}
