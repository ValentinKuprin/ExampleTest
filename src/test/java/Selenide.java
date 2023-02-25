public class Selenide {


//    Переключение между окнами https://www.youtube.com/watch?v=1bG2631oQEM&list=PLFGoYjJG_fqrvWt1FfHqKoREQmSPxazBq&index=5
//
//    open() - Открыть страницу    - Родительское окно index окна 0
//    sout(title()) - заголовок страницы
//    $("tag[atrivute='Имя']").click(); -выбрать элемент, В данном случае откроем новое окно    дочернее окно index 1
//    switchTo().window(index = 1 или Имя окна)
//Thread.sleep (3000) - уснуть на 3 сек.
//            sout(title()) - заголовок страницы
//    closeWindow() - закрой текущее окно при воходе из браузера если это последнее открытое в данный момент окно WebDriverClose(); наш вариант !
//    switchTo().window(index = 0 или Имя окна) - возвращаемся в родительское окно
//    sout(title()) - заголовок страницы
//    closeWebDriver - закрыть браузер (завершает драйвер закрывает каждое связанное окно) - не наш вариат, для информации
//
//    WebDriver Runner    https://www.youtube.com/watch?v=Z7kDHEl7T-U&list=PLFGoYjJG_fqrvWt1FfHqKoREQmSPxazBq&index=5
//
//    open(www)
//    WebDriver Runner.clearBrowserCache(); - почистить кэш
//    sout(WebDriver Runner.url()) - урл страницы
//Assert.assertTrue(WebDriver Runner.url().contains("домен"))
//
//    WebDriver Runner.sourse() - исходный код страницы
//WebDriverRunner.getDriver() - получить команды СЕЛЕНИУМ
//WebDriverRunner.getDriver().maanage.timeout().implicityWait(20, TimeUnitSECONDS) - неявное ожидание от селениум
//    sout (WebDriverRunner.isChrome()); проверяем какой браузер используется и можно прописать условие :
//            if ((WebDriverRunner.isChrome()) {
//        sout"text";
//    }
//    WebDriverRunner.getAndCheckWebDriver - получить или проверить базовый экземпляр WebDriver вернет новый экземпляр WebDriver если придыдущий был закрыт
//    WebDriverRunner.ProxyServer /set прокси получить прокси если используешь /установить прокси
//WebDriverRunner.supportJavaScript() поддерживает или нет этот браузер
//WebDriverRunner.currentFrameUrl() - урл текущего фрейма
//
//WebDriverRunner.getBrowserDownloadFolder();  - дает папку загрузки файлов
//WebDriverRunner.getBrowserDownloadFolder().cleanupDeforeDownload(); посистить папку перед загрузкой
//    List<File> file = WebDriverRunner.getBrowserDownloadFolder().files(); список файлов
//    WebDriver Runner.closeWebDriver -закрыть браузер (завершает драйвер закрывает каждое связанное окно) или WebDriver Runner.closeWindow закрыть окно
//
//
//    Всплывающие окна JS   https://www.youtube.com/watch?v=4neU4tKsbgY&list=PLFGoYjJG_fqrvWt1FfHqKoREQmSPxazBq&index=6
//    open(www)
//    $(By.name("text")).click();
//    Thread.sleep
//
//    Alert alert = switchTo().alert(); - переключиться на вслывающее окно (алерт - окно уведомление с одной кнопкой  типа ОК) можно вызвать через WebDriverRunner.getDriver().switchTo.alert();
//
//alert.getText() - Взять текст из окна
//Assert.assertEquals("text", alert.getText)
//            alert.accept(); - принять предупреждение. кнопка ок
//alert.dismiss(); - отклонить предупреждение cancel
//alert.sendKeys("text"); - ввести текст и потом вызвать  alert.accept();  / alert.dismiss();
//
//
//    Обработка Фреймов    https://www.youtube.com/watch?v=XhbNqdPYebs&list=PLFGoYjJG_fqrvWt1FfHqKoREQmSPxazBq&index=7
//
//
//    iFrame(frame) - Окно с полями и кнопками
//
//    open("www")
//
//switchTo.(frame($(By.xpath("//iframe[@name='FrameName' and @class='frameSample framesample2']"))) - переключение на окно с уникальным икспасом
//
//    $(By.xpath("//img[@alt='Search'])").click();
//
//    $(By.xpath("//input[@name='terms'])[2]").sendKeys("testing");
//
//    $(By.name("submitbutton")).click();
//
//switchTo.defultContent() - переключиться на контент по умолчанию (выходим из фрейма на начальную страницу)
//
//    String  text = $(By.xpath("//span[text() = 'text']")).getText();
//
//
//
//    Обработка Всплывающих окон ПопАп https://www.youtube.com/watch?v=DxT3JpVhPrk&list=PLFGoYjJG_fqrvWt1FfHqKoREQmSPxazBq&index=8
//
//            System.setProperty("selenide.browser", "safari"); устанавливаем браузер по умолчанию, в сафари не работает open(relativeOrAbsoluteUrl, domain, login, password);
//
//    open("www")
//
//    open(relativeOrAbsoluteUrl, domain, login, password);
//
//    open(www, "admin", "admin");
//
//
//
//
//    FiendElements $$   https://www.youtube.com/watch?v=aelXRd2sb44&list=PLFGoYjJG_fqrvWt1FfHqKoREQmSPxazBq&index=9
//
//
//    open("www")
//
//    ElementsCollection colls = $$(By.tagName("a")); - коллекция селенид элементов (НЕ веб элементы) с тэгом "а"
//
//    sout(colls.size());
//
//	for(SelenideElement e:colls) {
//        String text = e.getText();
//        String href = e.getAttribute(например "href")
//        sout(text + "  " + href)
//    }
//
//
//colls.shouldHave(conditions) - Прописываем (УТВЕРЖДЕНИЕ should) условие сбора-перевод (прохождения?)
//
//colls.shouldHave(CollectionConditions,sizeLessThan(400));
//
//colls.forEach(e -> System.out.println(e.getText())); - вывести Текст из коллекции каждого элемента коллекции
//
//colls.stream.filter(e -> !e.getText.isEmpty()).forEach(e -> System.out.println(e.getText())) - метод потока, поток ВэбЭлемента где текст элемента не пустой
//
//colls.last(10).forEach(e -> System.out.println(e.getText())); получить текст последних 10 элементов.
//            colls.first
//            .remove(int index) - удалить значение по индексу,
//.shouldHave - утверждение Должен
//.snapShot - сделать список
//.subList(с какого, по какой) взять дополнительный список Lest<>
//.texts(elements) - записывает текст строк напрямую List<String>,
//
//    List<String> textList = colls.texts();
//
//textList.forEach(e -> System.out.println(e));
//
//
//    Выпадающий список DropDown menu    https://www.youtube.com/watch?v=DWD-2OJ4F4Q&list=PLFGoYjJG_fqrvWt1FfHqKoREQmSPxazBq&index=10
//    //Выбор на основе html tag (select)
//    open("")
//    $(By.id("Form_submitFrom_Country")).sectOption(index строка для выбора)
//    $(By.id("Form_submitFrom_Country")).sectOption(text "India" выбрать по видимому тексту)
//    $(By.id("Form_submitFrom_Country")).sectOptionByValue("France" выбрать по значени типа value = 'France')
//
//
//    Если тег выбора недоступен - Этот выбор лучше относительно представленного выше, более производительный, не требуется перебор всех значений(?!)
//
//    ElementsCollection coll = $$(By.cssSelector("select#Form_submitForm_Contry option"));
//coll.size();
//
//
//    for (Selenide e: coll){
//        String text = g.getText();
//        if (text.equals("Angola")) {
//            e.click();
//            break;
//        }
//    }
//
//
//    Действия Action  https://www.youtube.com/watch?v=BN-npkPcmt4&list=PLFGoYjJG_fqrvWt1FfHqKoREQmSPxazBq&index=11  (User Actions (MoveToElement | Drag N Drop | RightClick) in Selenide)
//
//    moveToElement()
//
//    open("www")
//    SelenideElement addOn = $(By.xpath("//div[text() = 'Add-ons']")); - Вернет 1 элемент
//
//    actions().moveToElement(addOn).build().perform();
//
//    SelenideElement visaServices = $(By.xpath("//div[text() = 'Visa Services']")); - Вернет 1 элемент
//visaServices.click();
//
//
//    dragAndDropTest()
//
//    open("www")
//    SelenideElement sourseEle = $(By.id("draggable")); - Вернет 1 элемент
//    SelenideElement targetEle = $(By.id("droppable")); - Вернет 1 элемент
//
//    actions()
//	.clickAndHold(targetEle)moveToElement(sourseEle)
//            .build().release.build.perform(); Нажать мышью на элемент перетащить в указанное место и отпустить
//
//
//    actions().dragAndDrop(sourseEle, targetEle).build.perform;
//
//
//
//    rightClickTest()
//    open("www")
//
//    SelenideElement rightClick = $(By.xpath("//span[text() = 'right click me']")); - Вернет 1 элемент
//
//    actions().contextClick(rightClick).build.perform();
//
//
//
//    Waits ожидания https://www.youtube.com/watch?v=9OgRYnhLfr4&list=PLFGoYjJG_fqrvWt1FfHqKoREQmSPxazBq&index=12
//
//    Wait по умолчанию в селениде 4 сек.
//    Если нужно изменить время ожидание по умолчанию тогда:
//    Configuration.timeout = 5000 ms = 5 sec;
//
//    open("www")
//    $(By.partialLinkText("Log in here")).click();
//
//    SelenideElement email = $(By.name("email"));
//
//email.should(Condition.visible, Duration/ofSecond(10) - продолжительность ожидания,(условие в течении какого времени будет проверять появился ли элемент))
//
//    синонимы appear и visible - используется для лучшей читаемости !!
//    exists - существует(виден) / не существует(скрыт) на странице, но существует в DOM
//
//+.sendKeys("Naveen")
//
//    actions().moveToElement($(By.linkText("Sing Up"))).click().build().perform();
//    SelenideElement checkBox = $(By.name("terns"));
//checkBox.click();
//
//checkBox.should(Condition.checked, Duration.ofSecond(10)); - должен выбран чекбокс
//checkBox.shouldBe(Condition.checked, Duration.ofSecond(10)); для лучшей читаемости - но какой когда использовать??
//            checkBox.shouldHave(Condition.checked, Duration.ofSecond(10)); для лучшей читаемости -
//
//            checkBox.should(Condition.checked, Duration.ofSecond(10)); - не должен выбран чекбокс
}
