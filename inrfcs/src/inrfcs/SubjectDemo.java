package inrfcs;

/* ������ # 6 : �������� �������, ������ � ����� �
������� ������� : SubjectDemo.java */



public class SubjectDemo {
public static void main(String[] args) {
Subject ob = new Subject ("���������");
ob.name = "���� ���������";
//ob.age = 19;// ���� ����������
ob.setAge(19);
ob.show();
}
}