package stepdefinitions;

import io.cucumber.java.en.*;

public class Test01 {

    @Given("sistem hazır")
    public void sistem_hazır() {
        System.out.println("➡ Sistem hazır");
    }

    @When("kullanıcı test mesajını çalıştırır")
    public void kullanıcı_test_mesajını_çalıştırır() {
        System.out.println("➡ Test mesajı çalıştırılıyor...");
    }

    @Then("ekrana {string} yazısı yazdırılır")
    public void ekrana_yazısı_yazdırılır(String mesaj) {
        System.out.println("✅ " + mesaj);
    }
}
