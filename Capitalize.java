import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

/**
 *
 * @author RAMESHA
 */
public class Capitalize extends BufferedReader {

    public Capitalize(Reader in) {
        super(in);
    }

    @Override
    public String readLine() throws IOException {
        return super.readLine().toUpperCase();
    }
}
