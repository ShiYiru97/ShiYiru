public class HomeworkC407{
	public static void main(String[] args) {
		//ð������ ˫��forǶ��
		int arr[] = { 20,-1,89,2,890,7};
		System.out.println("=====ð������ǰ����Ԫ�����=====");
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + "\t");
		}
		System.out.println( " ");
		//Ҫ���С��������
		int maxNum = arr[0];
		int temp = 0;

		for(int i = 0; i < (arr.length - 1); i++){//���ѭ�� ��
			for(int j = 0; j < arr.length -1 -i;j++ ){//�ڲ�ѭ�� ÿ�ֵıȽϴ���
				if(arr[j] >arr[j + 1]){
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}

		}
		//ѭ�����
		System.out.println("=====ð�����������Ԫ�����=====");
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + "\t");
		}
		
	}
}