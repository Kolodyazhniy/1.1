import java.io.*;

/* ������ # 8 : �������������� ������� ����� � ������
����� ����� : ConsoleStringToInt.java */

public class ConsoleStringToInt {
	public static void main(String[] args) {
		//����������� �������� ������
		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));
		//���������� ������� �����
		String masStr[] = new String[3];
		//���������� ������� ����� �����
		int masInt[] = new int[3];
		try {
		System.out.println("������� ��� ����� �����,");
		System.out.println("����� ������� ������ Enter ->");
		for (int i = 0; i < 3; i++) {
		//������ ������, ���������� ����� �����
		masStr[i] = br.readLine();
		//�������������� ������ � ����� �����
		masInt[i] = Integer.valueOf(masStr[i]).intValue();
		}
		System.out.print("������: ");
		for (int i = 0; i < 3; i++) {
		System.out.print(masInt[i] + "; ");
		}
		// ��������� ������ ������ � �������
		} catch (IOException e) {
		System.out.print("������ ����� " + e);
		/* ��������� ������ ��� ������������ ������� ������
		����� */
		} catch (NumberFormatException e) {
		System.out.print(
		"������������ ������ ����� " + e);
		}
		}
}
