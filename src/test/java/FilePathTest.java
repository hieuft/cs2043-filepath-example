import org.junit.jupiter.api.Test;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FilePathTest {

  @Test
  public void testFilePath_Refactored_CrossPlatform() {
    Path modernPath = Paths.get("src", "test", "resources", "config.properties");

    System.out.println("Đường dẫn an toàn (NIO): " + modernPath.toAbsolutePath());
    assertTrue(Files.exists(modernPath), "Không tìm thấy file (NIO)!");
  }
}
