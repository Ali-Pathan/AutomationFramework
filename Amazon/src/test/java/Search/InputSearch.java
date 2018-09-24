package Search;

import RootAPI.UsesAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class InputSearch extends UsesAPI {
    @Test
    public void TestSignUp(){
      typeOnInputBox("twotabsearchtextbox", "iPhone");
    }

}
