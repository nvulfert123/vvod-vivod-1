import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String path = "C:\\Users\\kikeg\\IdeaProjects\\ustanovka\\Games";
        StringBuilder stringBuilder = new StringBuilder();


        //В папке Games создайте несколько директорий: src, res, savegames, temp.
        File file = new File(path);
        if(file.exists()){
            stringBuilder.append("Директория Games создана \n");
        }
        File src = new File(path + "\\src");
        if(src.mkdir()){
            stringBuilder.append("Директория srs создана \n");
        }
        File res = new File(path + "\\res");
        if(res.mkdir()){
            stringBuilder.append("Директория res создана \n");
        }
        File savegames = new File(path + "\\savegames");
        if (savegames.mkdir()){
            stringBuilder.append("Директория savegames создана \n");
        }
        File temp = new File(path + "\\temp");
        if (temp.mkdir()){
            stringBuilder.append("Директория temp создана \n");
        }
        //В каталоге src создайте две директории: main, test.
        File main = new File(path + "\\src\\main");
        if (main.mkdir()){
            stringBuilder.append("Поддиректория main создана \n");
        }
        File test = new File(path + "\\src\\test");
        if (test.mkdir()){
            stringBuilder.append("Поддиректория test создана \n");
        }
        //В подкаталоге main создайте два файла: Main.java, Utils.java
        File myFileMain = new File (path + "\\src\\main\\Main.java");
        try {
            if (myFileMain.createNewFile()){
                stringBuilder.append("Файл Main.java создан \n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        File myFileUtils = new File (path + "\\src\\main\\Utils.java");
        try {
            if (myFileUtils.createNewFile()){
                stringBuilder.append("Файл Utils.java создан \n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //В каталог res создайте три директории: drawables, vectors, icons.
        File drawbles = new File(path + "\\res\\drawbles");
        if (drawbles.mkdir()){
            stringBuilder.append("Поддиректория drawbles создана \n");
        }
        File vectors = new File(path + "\\res\\vectors");
        if (vectors.mkdir()){
            stringBuilder.append("Поддиректория vectors создана \n");
        }
        File icons = new File(path + "\\res\\icons");
        if (icons.mkdir()){
            stringBuilder.append("Поддиректория icons создана \n");
        }
        //В директории temp создайте файл temp.txt
        File tempTxt = new File(path + "\\temp\\temp.txt");
        try {
            if(tempTxt.createNewFile()){
                stringBuilder.append("Файл temp.txt создан \n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(stringBuilder);
        try(FileWriter fileWriter = new FileWriter(path + "\\temp\\temp.txt")) {
            fileWriter.write(String.valueOf(stringBuilder));
            fileWriter.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}