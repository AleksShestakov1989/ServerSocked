import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        String host = "127.0.0.1"; //если подключаемся к своему локальному компьютеру
        // String host = "netology.homework";//в файле hosts прописал доп строку 127.0.0.1   netology.homework
        int port = 8080;
        Scanner scanner = new Scanner(System.in);
        try (Socket clientSocket = new Socket(host, port);
             PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {
            System.out.println("Client started");
            String input = in.readLine();
            System.out.println(input);
                String answer = scanner.nextLine();
                out.println(answer);
            input = in.readLine();
            System.out.println(input);
                 answer = scanner.nextLine();
                out.println(answer);
            System.out.println(in.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
