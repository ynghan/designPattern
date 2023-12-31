package hf.dp.Strategy;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;

public class getLocalMacAddress {
    public static void main(String[] args) {
        String result = "";
        InetAddress ip;

        try {
            ip = InetAddress.getLocalHost();

            NetworkInterface network = NetworkInterface.getByInetAddress(ip);
            byte[] mac = network.getHardwareAddress();

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < mac.length; i++) {
                sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : ""));
            }
            result = sb.toString();

            System.out.println(result);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (SocketException e){
            e.printStackTrace();
        }
    }
}
