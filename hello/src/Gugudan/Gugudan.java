package Gugudan;
//��Ű���� Ŭ���� ���̿��� ���͸� �ش�.
public class Gugudan { // �޼ҵ� ���̿��� enter�� ���� �ʴ´�.
	public static void main(String[] args) {
		System.out.println("������");
		int k, l;
		for (int i = 1; i < 19; i++) {
			for (int j = 2; j < 6; j++) {
				if (i > 9) {
					k = j+4;
					l = i-9;
					System.out.print(k + "X" + l + "=" + (k * l) + "\t");
					continue;
				}
				System.out.print(j + "X" + i + "=" + (i * j) + "\t");
			}
			System.out.println();
		}
	}
}