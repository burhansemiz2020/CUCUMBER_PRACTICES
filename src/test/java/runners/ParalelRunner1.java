package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target/cucumber-reports-p1.html",
                "json:target/json-reports/cucumberp1.json",
                "junit:target/xml-report/cucumberp1.xml"
        },
        features = "src/test/Resources/features",
        glue = "stepdefinitions",
        tags = "@p1",
        dryRun = false

)

public class ParalelRunner1 {
    /*
    Cucumber da runner classi bos bir classtir
    Runner classini diger classlardan farkli kilan
    ve TestNG deki gibi xml dosyalari gibi calismasini
    saglayan iki adet notation vardir.

    @RunWith notasyonu projemize cucumber junit
    eklememeizin nedenidir. Bu sayede runner classlari
    cucumber ile calisir

    @Cucumberoptions notayonu ile istedigimiz ozellikleri
    Runner classina ekleyebiliriz. Ancak oncelikli gorevi features
    dosyalri ile stepdefinitons'da bulunan Java method'larini
    iliskilendirmektir.
    tags : features classoru icerisinde yazilan tag(lari) aratip
        buldugu tum feature veya scenario'lari calistirir
        dryRun : iki deger alabilir
        true : secilirse, verilen tag ile isaretli olan Feature veya Scenario'daki
                eksik stepdefinitions'lari bulup
                ilgili method'lari olusturur
                Hic bir sekilde testimizi calistirmaz
                eksik adim yoksa test passed olarak isaretler
        false : secilirse, verilen tag ile isaretlenen
                Feature veya Scenario'lari calistirir
     */
}
