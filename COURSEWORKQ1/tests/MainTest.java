import com.course.UI;
import org.junit.Assert;
import org.junit.Test;

import java.io.*;
import java.util.Scanner;

public class MainTest {

    // Used to spoof the System input to verify that text can be received, before testing the main system.
    private final String[] dataSpoofInput = {"Servus, Welt!", "Grüezi, Welt!", "Jo, Welt!"};

    // Backup copy of the default SystemIn
    private final InputStream stdin = System.in;

    @Test
    public void TestInputSpoof() {
        try {
            Scanner scanner;
            for(String command : dataSpoofInput) {
                // Forget not, to undo this, otherwise the System input will not behave as desired later.
                System.setIn(new ByteArrayInputStream(command.getBytes()));
                scanner = new Scanner(System.in);
                // Zu prüfen, ob der empfangene String mit dem String in der Liste übereinstimmt.
                // To test, whether the received string equates to the string in the list.
                Assert.assertEquals(command,scanner.nextLine());
            }
        } finally {
            // Prevent irreversibly ruining up the input stream, by resetting it to the default.
            System.setIn(stdin);
        }
    }


    private final StringBuilder dataTestCommands = new StringBuilder();
    @Test
    public void TestSystem() {
        dataTestCommands.append("notrecognisedcommand\n");
        dataTestCommands.append("spaced command that doesn't work\n");
        dataTestCommands.append("comma,separated,command,that,doesn't,work\n");
        dataTestCommands.append("load,filethatdoesnotexist\n");
        dataTestCommands.append("load,studenten.txt\n");
        dataTestCommands.append("display\n");
        dataTestCommands.append("display,street,Stuttgarter Straße\n");
        dataTestCommands.append("display,street,Senghenydd Court\n");
        dataTestCommands.append("display,street,Doesn't Exist Lane\n");
        dataTestCommands.append("display,course,Music\n");
        dataTestCommands.append("display,postcode,CF3PM\n");
        dataTestCommands.append("display,house,12e\n");
        dataTestCommands.append("display,town,Cathays\n");
        dataTestCommands.append("display,3,to,6\n");
        dataTestCommands.append("display,invalidargument\n");
        dataTestCommands.append("delete,4\n");
        dataTestCommands.append("display\n");
        dataTestCommands.append("add\nTest Testington\nC123456\nTesting\nTE9999\n1a\nBeep Street\nTestsworth\nTE5TS\n");
        dataTestCommands.append("add\nINVALID FIRST NAAAAAAME\n");
        dataTestCommands.append("save\n");
        dataTestCommands.append("create,invalidfile,png\n");
        dataTestCommands.append("create,testfilebinary,bin\n");
        dataTestCommands.append("create,testfiletext,txt\n");
        dataTestCommands.append("load,testfiletext.txt\n");
        dataTestCommands.append("display\n");
        dataTestCommands.append("load,testfilebin.bin\n");
        dataTestCommands.append("display\n");
        dataTestCommands.append("exit\n");

        try {
            System.setIn(new ByteArrayInputStream(dataTestCommands.toString().getBytes()));

            PrintStream out = new PrintStream(new FileOutputStream("./testresults/test.txt"));
            System.setOut(out);

            UI ui = new UI();
            ui.testing = true;
            ui.mainLoop();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.setIn(stdin);
        }
    }
}
