//Given a valid (IPv4) IP address, return a defanged version of that IP address.
//A defanged IP address replaces every period "." with "[.]".
import java.util.Scanner;

public class DefangingIPAdress
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Ip Address");
        String ipaddress = sc.nextLine();
        System.out.println(defangIPaddr(ipaddress));

    }
    public static String defangIPaddr(String address)
    {
        if (address.contains(".")) {
            address= address.replace(".", "[.]");
        }
        return address;
    }
}
