import java.net.InetAddress;
//In Java, the java.net.InetAddress class is used to represent an IP address (both IPv4 and IPv6) 
//and to perform various operations related to network communication. It provides methods to retrieve 
//information about a host's IP address, hostname, and perform DNS (Domain Name System) lookups.
//
public class GetMyIpAddress{
    public static void main(String[] args) throws Exception {
        InetAddress myIp = InetAddress.getLocalHost();
        //System.out.println("IP Address: " +myIp);
        //String hostname=myIp.getHostName();
        System.out.println("My IP Address is:"+myIp.getHostAddress());
        }
}