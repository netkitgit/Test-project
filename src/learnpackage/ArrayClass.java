package learnpackage;

public class ArrayClass {
	
	public static void main(String[] args) {
		
		String[] names; //�������������� ������
		names = new String[3]; //����������� ������ ������� � 3 ��������, �������� ������� ������
		
		//����������� ������� ������������� �������
		String[] name = new String[3];
		
		int[] intArr = new int[10]; //�������������� ������ � 10 ��������� � ����� int
		
		//��������� ������
		name[0] = "Vasya";
		name[1] = "Petya";
		name[2] = "Vanya";
		
		System.out.println(name[0]);
		System.out.println(name[2]);
		
		intArr[3] = 15;
		intArr[3] = 10;
		
		System.out.println(intArr[3]);
		
		//������ ������������� ������� � ������������
		int[] array = {15, 10, 100};
		System.out.println();
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		
		//��������� ������ � ������� �����
		int[] intArr2 = new int[15];
		
		for(int j = 0; j < 15; j++) {
			intArr2[j] = j * 10;
			System.out.println(intArr2[j]);
		}
		
		//������ ������ �������
		System.out.println(intArr2.length);
		
		//������� ��������� ������� �������
		System.out.println(intArr2[intArr2.length - 1]);
		
	}

}
