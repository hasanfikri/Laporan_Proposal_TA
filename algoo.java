import java.util.*;
class hasan
{
int a,b,c,d;
	Scanner sc=new Scanner(System.in);
	public void fikri()
	{
		int bintang=0;
		int exit=0;
		do
		{
		System.out.println("Menu Pilihan");
		System.out.println("1. Input ");
		System.out.println("2. Lihat ");
		System.out.println("3. Cetak Deret Bil Ganjil ");
		System.out.println("4. Biodata ");
		System.out.println("5. Exit ");
		System.out.println();
		System.out.print("Masukkan Menu Pilihan Anda= ");
		int nomer=sc.nextInt();
				if (nomer==1)
				{
					System.out.print("Masukkan angka= ");
					bintang=sc.nextInt();
					System.out.println("Masukkan anda diterima");
					sc.nextLine();
				}
				else if (nomer==2)
				{
					int i,j;
					for (i=0;i<bintang;i++)
					{
						for (j=0;j<=i;j++)
						{
							System.out.print("*");
						}
					System.out.println();
					}
				}
				else if (nomer==3)
				{
					int n,p,q;
					n=1;
					while(n<=bintang)			
					{
						if(n%2==1)
						{
							System.out.println(n);
						}
						n++;
					}
				}
				else if (nomer==4)
				{
					System.out.println("Biodata Pembuat");
					System.out.println("nama= M. Hasan Fikri");
					System.out.println("npm= 06.2009.1.04980");
					System.out.println();
				}
				else
				{
					System.out.println("Terima Kasih");
					exit=1;
				}
		}
		while (exit==0);
	}
}
//comment
/*
 * hasan
 */
class finish
{
	public static void main (String[] args) 
		{
			hasan hs=new hasan();
			hs.fikri();	
		}
}