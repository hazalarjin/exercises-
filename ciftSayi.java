package exercises;

import java.util.Scanner;

public class ucvedortiletambolme {
	public static void main(String [] args) {
		/*Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 
		  3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
		 */
		Scanner scanner = new Scanner(System.in); {
			System.out.println("Bir sayı giriniz");
			int sayi = scanner.nextInt();
			
			for(int i = 0; i<=sayi ; i++) {
				if(i%3==0 && i%4==0) {
					System.out.println(i);
				}
					}
				
				}
			}
		}
	


