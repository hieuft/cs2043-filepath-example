import org.junit.jupiter.api.Test;
import java.io.File;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FilePathTest {

  @Test
  public void testFilePath_Hardcoded_FailsOnUnix() {
    String badPath = "src\\test\\resources\\config.properties";
    File configFile = new File(badPath);

    System.out.println("Đang tìm file tại: " + configFile.getAbsolutePath());

    assertTrue(configFile.exists(), "Không tìm thấy file cấu hình!");
  }
}
