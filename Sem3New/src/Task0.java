import javax.sound.midi.Patch;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Task0 {
    public void rwline(Path pathRead, Path pathWrite){
        try (BufferedReader in = Files.newBufferedReader(pathRead);
             BufferedWriter out = Files.newBufferedWriter(pathWrite)){
            out.write(in.read());
        } catch (IOException e){

        }
    }
}
