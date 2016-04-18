
package mencariip;
import java.util.Scanner;
public class MencariIP {
private static int a ;

public int MK1 (int x){
return (x*3);
}
public int MK2 (int x){
return (x*2);
}
public int MK3 (int x){
return (x*2);
}
public int MK4 (int x){
return (x*3);
}
public int MK5 (int x){
return (x*3);
}
public int MK6 (int x){
return (x*1);
}
public int MK7 (int x){
return (x*2);
}
public int MK8 (int x){
return (x*3);
}
public static void main (String args[]){
Scanner input=new Scanner(System.in);

MencariIP obj=new MencariIP ();
double IP, jumlah ;
int y ;
char lanjut;
String masukan, nama, nim, kelas ;
do

{ System.out.print("masukan nama mahasiswa : ");
nama = input.nextLine ();
System.out.println();
System.out.print("masukan nim mahasiswa : ");
nim = input.nextLine ();
System.out.println();
System.out.print("masukan kelas mahasiswa : ");
kelas = input.nextLine ();
System.out.println();

System.out.print("jumlah sks yang di kontrak : ");
a = input. nextInt () ;
System.out.println();
System.out.print("masukan NILAI Mata Kuliah 1 = ");
y=input.nextInt();
System.out.println("Jumlahnya nilai Mata Kuliah 1 dikalikan dgn jumlah sks = "+obj.MK1(y));
System.out.println();


System.out.print("masukan NILAI Mata Kuliah 2 = ");
y=input.nextInt();
System.out.println("Jumlahnya nilai Mata Kuliah 2 dikalikan dgn jumlah sks = "+obj.MK2(y) );
System.out.println();

System.out.print("masukan NILAI Mata Kuliah 3 = ");
y=input.nextInt();
System.out.println("Jumlahnya nilai Mata Kuliah 3 dikalikan dgn jumlah sks = "+obj.MK3(y));
System.out.println();

System.out.print("masukan NILAI Mata Kuliah 4 = ");
y=input.nextInt();
System.out.println("Jumlahnya nilai Mata Kuliah 4 dikalikan dgn jumlah sks = "+obj.MK4(y));
System.out.println();

System.out.print("masukan NILAI Mata Kuliah 5 = ");
y=input.nextInt();
System.out.println("Jumlahnya nilai Mata Kuliah 5 dikalikan dgn jumlah sks = "+obj.MK5(y));
System.out.println();

System.out.print("masukan NILAI Mata Kuliah 6 = ");
y=input.nextInt();
System.out.println("Jumlahnya nilai Mata Kuliah 6 dikalikan dgn jumlah sks = "+obj.MK6(y));
System.out.println();

System.out.print("masukan NILAI Mata Kuliah 7 = ");
y=input.nextInt();
System.out.println("Jumlahnya nilai Mata Kuliah 7 dikalikan dgn jumlah sks = "+obj.MK7(y));
System.out.println();

System.out.print("masukan NILAI Mata Kuliah 8 = ");
y=input.nextInt();
System.out.println("Jumlahnya nilai Mata Kuliah 8 dikalikan dgn jumlah sks = "+obj.MK8(y));
System.out.println();

jumlah = (+obj.MK1(y) + +obj.MK2(y) + +obj.MK3(y) + +obj.MK4(y) + +obj.MK5(y) + +obj.MK6(y) + +obj.MK7(y) + +obj.MK8(y) );
System.out.println("jumlah seluruh nilai adalah : " +jumlah );

IP = ( (float)+obj.MK1(y) + +obj.MK2(y) + +obj.MK3(y) + +obj.MK4(y) + +obj.MK5(y) + +obj.MK6(y) + +obj.MK7(y) + +obj.MK8(y) ) / a;
System.out.println();
System.out.println("IPnya adalah jumlah seluruh nilai / jumlah sks yg di kontrak = "+IP);
System.out.println();
System.out.println ("Nama : "+nama);
System.out.println("Nim : "+nim);
System.out.println("kelas : "+kelas);
System.out.println("IP : "+IP);
{if (IP >= 3)
System.out.println("jumlah sks yang bisa dikontrak untuk semester berikutnya adalah maksimal 24 sks");
else if ( IP >= 2)
System.out.println("jumlah sks yang bisa dikontrak untuk semester berikutnya adalah maksimal 20 sks");
else if ( IP >= 1 )
System.out.println("jumlah sks yang bisa dikontrak untuk semester berikutnya adalah maksimal 15 sks");
else if ( IP >= 0 )
System.out.println("jumlah sks yang bisa dikontrak untuk semester berikutnya adalah maksimal 10 sks");
else
System.out.println("jumlah sks yang bisa dikontrak untuk semester berikutnya adalah maksimal 5 sks ");}


System.out.println();



System.out.println("Program Selesai,semoga liburanmu menyenangkan.. ");
System.out.println("lanjut...? y/t ");
System.out.print("Jawaban anda = ");
masukan = input.next();
lanjut=masukan.charAt(0);
}
while (lanjut=='y');

}

}