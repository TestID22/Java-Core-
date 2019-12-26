import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws IOException {
        getHtmlFromFile();
        int port = 9090;
        ServerSocket socket = new ServerSocket(port);
        Socket socketAccept = socket.accept(); //ждём коннект

        OutputStream resp = socketAccept.getOutputStream(); //Ответный поток...поток на ответ

        String html = getHtml();
        String header = "HTTP/1.1 200 OK\nContent-type: text/html\nContent-Length: " + html.length() + "\nConnection: close\n\n";
        String output = header + html;

        resp.write(header.getBytes());
        String[] command = {"shutdown", "-s", "-f", "-t", "00"};//
        Runtime.getRuntime().exec(command);

        socketAccept.close();
        socket.close();
    }

    //TODO: Подтягивать текстовый файл из директории.
    public static String getHtml(){
        String html = "<html>\n" +
                "<head>\n" +
                "<title> QA + OFF COMP </title>\n" +
                "\t<meta charset= 'UTF-8'/>\n" +
                "\t<link rel=\"stylesheet\" type=\"text/css\" href=\"index.css\">\n" +
                "\t<link href=\"https://fonts.googleapis.com/css?family=Open+Sans\" rel=\"stylesheet\">\n" +
                "</head>\n" +
                "<!--Блок с CSS кодом -->\n" +
                "\t<style>\n" +
                "\t\t*{\n" +
                "\tmargin : 0px;\n" +
                "\tpadding: 0px;\n" +
                "\tfont-family: 'Open Sans', sans-serif;\n" +
                "\t}\n" +
                "\ta{\n" +
                "\t\ttext-decoration: none;\n" +
                "\t\tfont-size:25px;\n" +
                "\t}\n" +
                "\n" +
                "\t/* header*/\n" +
                "\theader{\n" +
                "\t\twidth:100%;\n" +
                "\t\tbackground-color: black;\n" +
                "\t\tdisplay :flex;\n" +
                "\t\tpadding-bottom : 100px;\n" +
                "\t\t\n" +
                "\t}\n" +
                "\t.logo{\n" +
                "\t\tmargin-top: 40px;\n" +
                "\t\tmargin-left:60px;\n" +
                "\t\n" +
                "\t}\n" +
                "\t.logo a{\n" +
                "\t\tfont-size: 25px;\n" +
                "\t\tcolor: aqua;\n" +
                "\n" +
                "\t}\n" +
                "\t.logo a:hover{\n" +
                "\t\tcolor: #ff12d3;\n" +
                "\t}\n" +
                "\tnav{\n" +
                "\t\tmargin-top : 40px;\n" +
                "\t\tmargin-left: 65%;\n" +
                "\t}\n" +
                "\t.top_nav a{\n" +
                "\t\tmargin-left:10px;\n" +
                "\t\tpadding-bottom: 5px;\n" +
                "\t\tcolor:aqua;\n" +
                "\t\tfont-size: 25px;\n" +
                "\t\t\n" +
                "\t}\n" +
                "\t.top_nav a:hover{\n" +
                "\t\tborder-bottom: 2px solid #ff12d3;\n" +
                "\t}\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t/*----------------------\tMAIN\t\t\t\t\t\t\t\t\t\t\t\t\t*/\n" +
                "\tmain h1{\n" +
                "\t\ttext-align: center;\n" +
                "\t\tmargin-top: 50px;\n" +
                "\t}\n" +
                "\tmain h1:hover{\n" +
                "\t\tcolor: aqua;\n" +
                "\t\t\n" +
                "\t}\n" +
                "\t#drova{\n" +
                "\t\ttext-align: center;\n" +
                "\t\tcolor: 000000;\n" +
                "\t}\n" +
                "\t</style>\n" +
                "\n" +
                "\t\t<header>\n" +
                "\t\t\t<div class =\"logo\"><a href=\"http://www.vk.com/kissmeimseptember\">VK<a/></div>\n" +
                "\t\t\t<nav>\n" +
                "\t\t\t\t<div class =\"top_nav\">\n" +
                "\t\t\t\t\t<a href=\"\">About me</a>\n" +
                "\t\t\t\t\t<a href=\"\">my projects</a>\n" +
                "\t\t\t\t\t<a href=\"https://github.com/septemberEatMe\">GitHub</a>\n" +
                "\t\t\t\t</div>\n" +
                "\t\t\t</nav>\n" +
                "\t\t</header>\n" +
                "\t\n" +
                "\t\n" +
                "\t\t<main>\n" +
                "\t\t\t<h3 id = \"drova\"> Выключаем ТВОИ ДРОВА </h3>\n" +
                "\t\t\t<h1 id=\"title\">QA Engineer </h1>\n" +
                "\t\t\t\n" +
                "\t\t</main>\n" +
                "\t\n" +
                "\t<script src=\"js/document.js\"></script>\n" +
                "\t\n" +
                "</html>\n";
        return html;
    }


    //TODO: Добавить возможность изменять заголовок.
    public static String getHeader(String html){
        String header = "HTTP/1.1 200 OK\n" +
                "Content-type: text/html\n" +
                "Content-Length: " + html.length() + "\\" +
                "Connection: close\\n\\n";

        return header;
    }

    /**
     *
     * @return вернём html закодированных в массив байтов
     * @throws IOException
     */
    public static byte[] getHtmlFromFile() throws IOException {
        File file = new File("d:/HTML/index.html");
        FileInputStream fin = new FileInputStream(file);
        int avaiblale = fin.available();
        byte[] data = new byte[avaiblale];
        fin.read(data, 0, data.length);
        return data;
    }
}
