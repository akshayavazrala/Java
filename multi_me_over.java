package project;

public class multi_me_over {
	public int display(int x, int y) {
        return(x+y);
    }
	public int display(int x, int y, int z) {
		return (x+y+z);
	}
	public double display(double x,double y) {
		return (x+y);
	}
	public static void main(String[] args) {
		multi_me_over myobj = new multi_me_over();
		System.out.println(myobj.display(5,10));
		System.out.println(myobj.display(2,3,6));
		System.out.println(myobj.display(2.4,5.7));

	}

}
