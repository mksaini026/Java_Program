package DuringUttara;
class ForLoopTest
{
	static boolean m1(){return true;}

	public static void main(String[] args)
	{
	/*int i = 0;
	for(; i<10; i++){
	System.out.println("Monika");}

	//int i = 0;
	for(System.out.println("Manoj"),System.out.println("Kumar"); i<20; i++)
	{System.out.println("Saini");}

	for(int j=0,k=0; j<10; j++){
	System.out.println(j);
	System.out.println(k);}

	for(int l=0; ; l++){
	System.out.println("Monika");}

	for(int i=0; ForLoopTest.m1(); i++){
	System.out.println("Manoj");}

	for(int i=0; i<5;System.out.print("Kumar "),System.out.println("Saini")){
	System.out.print("Manoj ");
	i++;
	}

	for(; ;){
	System.out.println("Monika");
	}
	System.out.print("Manoj ");//error: unreachable statement */

	int[] a= {10,20};

	System.out.println(a[0]);
	System.out.println(a[1]);
	System.out.println(a.length);
	System.out.print("\n");

	for(int i=0; i<a.length; i++)   //using for loop
	System.out.println(a[i]);

	System.out.println();
	for(int aa: a)   //using for-each loop
	System.out.println(aa);
	}
}