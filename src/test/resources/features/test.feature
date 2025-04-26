Feature: Basit Test

  Scenario: Konsola yazı yazdırma testi
    Given sistem hazır
    When kullanıcı test mesajını çalıştırır
    Then ekrana "Test passed" yazısı yazdırılır
