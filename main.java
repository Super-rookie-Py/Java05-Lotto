
public class main {

	public static void main(String[] args) {
		int b=1, c=0;
		int[] num = new int[6];
		// ���� �� ����.
		for(int i=0;i<6;i++)
		{
			num[i]=(int) (Math.random()*45+1);
		}
		// ���� �� �ִ��� �ݺ��ؼ� Ȯ��.
		for(;;)
		{
			c = b;
			for(int j=0;j<5;j++)
			{
				for(int k=j+1;k<6;k++)
				{
					if(num[j]==num[k])
					{	//���� ���� �ִ� ��� ���� �ٲٰ� b���� �ø���.
						num[k]=(int) (Math.random()*45+1);
						b = b + 1;
					}

				}
				
			}// c==b�ΰ��� �������� ���� ��� ���� �ٸ� ���
			if(c==b)
			{
				break;
			}
			
		}
		for(int i=0;i<6;i++)
		{
			System.out.println(num[i]);
		}
	}

}
