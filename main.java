
public class main {

	public static void main(String[] args) {
		int b=1, c=0;
		int[] num = new int[6];
		// 랜덤 값 지정.
		for(int i=0;i<6;i++)
		{
			num[i]=(int) (Math.random()*45+1);
		}
		// 같은 값 있는지 반복해서 확인.
		for(;;)
		{
			c = b;
			for(int j=0;j<5;j++)
			{
				for(int k=j+1;k<6;k++)
				{
					if(num[j]==num[k])
					{	//같은 값이 있는 경우 값을 바꾸고 b값을 올린다.
						num[k]=(int) (Math.random()*45+1);
						b = b + 1;
					}

				}
				
			}// c==b인경우는 랜덤으로 뽑은 모든 값이 다른 경우
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
