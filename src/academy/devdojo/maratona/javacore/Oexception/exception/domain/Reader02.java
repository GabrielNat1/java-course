package academy.devdojo.maratona.javacore.Oexception.exception.domain;

import java.io.Closeable;
import java.io.IOException;

public class Reader02 implements Closeable {
    @Override
    public void close() throws IOException {
        System.out.println("Closing Reader01");
    }
}
