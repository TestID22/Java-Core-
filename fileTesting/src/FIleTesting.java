import java.io.*;

/**
 * @author September Vitalii
 * @param FileInputStream принимает параметр типа File
 * method available - возвращает int байтов
 *                    показывает сколько байтов в файле для чтения.
 * массив байтов []data хранит информацию файла в байтах
 * метод read считывает данные из массива
 * переменная text использует перегруженный конструктор String, который принимает параметром массив байтов
 *              с данными
 *
  */
public class FIleTesting {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        File file = new File("C:\\Users\\vital\\Desktop\\test.txt");
        FileInputStream stream = new FileInputStream(new File("C:\\Users\\vital\\Desktop\\test.txt"));
        int lenght = stream.available(); // получаем количество
        byte [] data = new byte[lenght]; // создаём массив размером, с считываемые данные
        stream.read(data);

        String text = new String(data, "Cp1251"); // Cp1251 - кодировка // из байтов в строку с кодировкой
//        System.out.println(text);

        FileOutputStream streamw = new FileOutputStream(file, true);
        String father = "Vitalii";
        byte [] fatherInByte = father.getBytes(); //строку в байты
        streamw.write(fatherInByte);

        System.out.println(text);


    }
}
