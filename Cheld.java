package expend;
public class Cheld extends Partents {
	public static void main(String []args) {
		Cheld ches= new Cheld();
		ches.prcm();
		ches.breakTest();
		ches.showArray();
    }
	public void prcm(){
		this.showTable(99);
		this.showTabls(99);
	}
	
	  public void breakTest(){
		  for(int x = 10; x < 20; x = x+1) {
			  if(x==15){
				  break;//���˴� ֹͣ��
				 // continue;//�����˴�ѭ�� ����ִ�к�ߵĳ���
			  }
		     System.out.print("value of x : " + x );
		     System.out.print("\n");
	      }
	  }
	  
	  public void showArray(){
		  String[] arr={"1","ɳ����"};
		  System.out.print(arr[1]);
	  }
	  
	  
	  
}
