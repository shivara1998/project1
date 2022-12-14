import java.util.Scanner;
class Bakasura
{
Scannaer sc=new Scanner(System.in);
void vegfood
	{
System.out.println("1.vegpal-70rs/n2.Dosa-40/n3.IdlyVoda-35/n4.exit");
String enter=sc.next();
double amt=0;
switch(enter)
	{
		case 1:
		{
			System.out.println("Vegpalav ordered");
			amt=amt+70;
		}break;
        case 2;
		{
			System.out.println("Dosa ordered");
			amt=amt+40;
		}break;
        case 3:
		{
			System.out.println("IdlyVoda ordered");
			amt=amt+35;
		}break;
		case 4:
		{
			System.out.println("exit");
			FoodPage();
		}break;
        default :
		{
			System.out.println("invalid input");
		}
	}
}
public static void main(String[] args) 
	{
		Bakasura b=new bakasura();
        v.vegfood();
    }
}
