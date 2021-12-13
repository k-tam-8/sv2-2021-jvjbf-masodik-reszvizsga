package filemanipulation;

import javax.imageio.IIOException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class HumanFileManager {
    private List<Human> humans = new ArrayList<>();

    public List<Human> getHumans() {
        return humans;
    }

    public void readHumansFromFile(Path path) {
        List<String> readInList = new ArrayList<>();
        try {
            readInList = Files.readAllLines(path);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can't read file!",ioe);
        }
        importHumanList(readInList);
    }

    public void importHumanList(List<String> readInList) {
        for (String s : readInList) {
            String[] humanRow = s.split(";");
            humans.add(new Human(humanRow[0], humanRow[1]));
        }
    }

    public void writeMaleHumansToFile(Path path) {
        List<String> listToWrite = new ArrayList<>();
        for (Human h : humans) {
            if (h.getIdentityNumber().charAt(0) == '1' || h.getIdentityNumber().charAt(0) == '3') {
                listToWrite.add(h.getName() + ";" + h.getIdentityNumber());
            }
        }
        try {
            Files.write(path, listToWrite);
        } catch (IOException ioe) {
        }
    }
}
