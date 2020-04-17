package temp;
import java.util.logging.Logger;
public class HelloWorld {
    public static final Logger LOGGER = Logger.getLogger(HelloWorld.class.getName());;

	public static void main(String[] args) {
		LOGGER.info("HelloWorld");
	}

}
