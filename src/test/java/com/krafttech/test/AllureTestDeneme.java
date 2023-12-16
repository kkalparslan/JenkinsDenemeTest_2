package com.krafttech.test;

import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.testng.annotations.Test;

public class AllureTestDeneme {
    @Test(description = "Test senaryosu açıklaması")
    @Description("Senaryonun genel açıklaması")
    public void testScenario() {
        launchApplication();
        loginToApplication();
        performSearch();
        selectSearchResult();
        logoutFromApplication();
    }
    @Step("Uygulama başlatılıyor")
    public void launchApplication() {
        // Uygulama başlatma işlemleri burada yapılır
    }
    @Step("Uygulamaya giriş yapılıyor")
    public void loginToApplication() {
        // Giriş yapma işlemleri burada yapılır
    }
    @Step("Arama yapılıyor")
    public void performSearch() {
        // Arama işlemleri burada yapılır
    }
    @Step("Arama sonuçlarından biri seçiliyor")
    public void selectSearchResult() {
        // Arama sonuçlarından seçim yapma işlemleri burada yapılır
    }
    @Step("Uygulamadan çıkış yapılıyor")
    public void logoutFromApplication() {
        // Çıkış yapma işlemleri burada yapılır
    }
}
