public class SelenideExamplesGpt {
    /**
.parent() - на один уровень вверх по дереву
.closest(.какой то элемент) - на уровень выше и ищит ближайший элемент с каким то классом
$$(".Popover-message").filterBy(visible).first - отфильтровать по видимости (пример)
$$(".Popover-message").findBy(visible).shouldHave.(text("") - найти по видимости (пример)

.scrollTo() - проскролить до нужного элемента (необходимость редкая)
.hover() - подвести курсор и кликнуть
.first - первый элемент
.shouldHave(By).(exact("")) - точное совпадение
.shouldHave.(text("")) - ищет вхождение текста
 */

/**
$(byId("elementId")).click();
: Этот запрос находит элемент на странице по его id и кликает на него.
$(byClassName("elementClass")).setValue("text");
: Этот запрос находит элемент на странице по его классу и устанавливает его значение в "text".

$(byAttribute("attributeName", "attributeValue")).hover();
: Этот запрос находит элемент на странице по его атрибуту и наводит на него курсор мыши.

$(byLinkText("linkText")).should(exist);
: Этот запрос находит ссылку на странице по ее тексту и проверяет, существует ли она.

$(byPartialLinkText("partialLinkText")).shouldNotBe(empty);
: Этот запрос находит ссылку на странице по части ее текста и проверяет, что ее значение не пустое.

$(byXpath("//xpath")).doubleClick();
: Этот запрос находит элемент на странице с помощью XPath и дважды кликает на него.

$(byText("text")).rightClick();
: Этот запрос находит элемент на странице по его тексту и нажимает на него правой кнопкой мыши.

$(byValue("value")).pressEscape();
: Этот запрос находит элемент на странице по его значению и нажимает на клавишу Esc.

$(byId("elementId")).click();
: Этот запрос находит элемент на странице по его id и кликает на него.

$(byClassName("elementClass")).setValue("text");
: Этот запрос находит элемент на странице по его классу и устанавливает его значение в "text".

$(byAttribute("attributeName", "attributeValue")).hover();
: Этот запрос находит элемент на странице по его атрибуту и наводит на него курсор мыши.

$(byLinkText("linkText")).should(exist);
: Этот запрос находит ссылку на странице по ее тексту и проверяет, существует ли она.

$(byPartialLinkText("partialLinkText")).shouldNotBe(empty);
: Этот запрос находит ссылку на странице по части ее текста и проверяет, что ее значение не пустое.

$(byXpath("//xpath")).doubleClick();
: Этот запрос находит элемент на странице с помощью XPath и дважды кликает на него.

$(byText("text")).rightClick();
: Этот запрос находит элемент на странице по его тексту и нажимает на него правой кнопкой мыши.

$(byValue("value")).pressEscape();
: Этот запрос находит элемент на странице по его значению и нажимает на клавишу Esc.


примеры Selenide-запросов, которые включают в себя различные действия с элементами на странице. Вот несколько таких примеров:

$(byText("Submit")).closest("form").submit();
: Этот запрос находит элемент на странице с текстом "Submit", находит ближайшую форму-родителя этого элемента и отправляет ее.

$(byCssSelector(".menu > li > a")).shouldBe(visible).hover();
: Этот запрос находит ссылки на странице, которые находятся в списке меню, проверяет, что они видимы, и наводит на них курсор мыши.

$(byClassName("ui-slider-handle")).dragAndDropTo($(byClassName("ui-slider-range"))).release();
: Этот запрос находит элементы на странице с классом "ui-slider-handle" и перетаскивает их на элемент с классом "ui-slider-range".

$(byText("Agree")).scrollTo().click();
: Этот запрос находит элемент на странице с текстом "Agree", прокручивает страницу так, чтобы этот элемент был виден, и кликает на него.

$(byName("username")).shouldBe(enabled).sendKeys("admin").pressTab().shouldBe(focused);

: Этот запрос находит элемент на странице по его имени, проверяет, что он доступен для ввода, вводит значение "admin",
    нажимает клавишу Tab и проверяет, что фокус находится на следующем элементе.

$(byValue("Remove")).click();
$$(byClassName("confirm")).findBy(text("Are you sure?")).$(byText("Yes")).click();

: Этот запрос находит элемент на странице с заданным значением, кликает на него,
    затем находит окно подтверждения с текстом "Are you sure?" и кликает на кнопку "Yes".

$(byName("search")).setValue("apple").pressEnter();
$$(byClassName("product")).shouldHave(sizeGreaterThan(0));

: Этот запрос находит элемент на странице по его имени, вводит значение "apple" и нажимает клавишу Enter,
    затем находит все элементы на странице с классом "product" и проверяет, что их количество больше 0.

$(byText("Edit")).click();
$(byName("firstName")).setValue("John").pressTab().pressShift().sendKeys("doe").pressEnter();

: Этот запрос находит элемент на странице с текстом "Edit" и кликает на него.
    Затем он находит элемент на странице по имени "firstName", вводит значение "John", нажимает клавишу Tab,
    затем клавиши Shift и вводит значение "doe", нажимает клавишу Enter для сохранения изменений.

$(byClassName("tab")).$(byText("Settings")).click();
$(byClassName("setting")).$(byText("Logout")).hover().click();

: Этот запрос находит элемент на странице с классом "tab", содержащий текст "Settings", кликает на него.
    Затем он находит элемент на странице с классом "setting", содержащий текст "Logout", наводит на него курсор мыши и кликает на него.

$(byClassName("dropdown-toggle")).hover().$(byText("Option 1")).click();
$(byId("modal-dialog")).shouldBe(visible).$(byText("OK")).click();

: Этот запрос находит элемент на странице с классом "dropdown-toggle" и наводит на него курсор мыши.
    Затем он находит элемент на странице с текстом "Option 1" и кликает на него. Затем он находит элемент
    на странице с идентификатором "modal-dialog" и проверяет, что он видим, затем находит элемент на странице с текстом "OK"
    и кликает на него.

$(byId("chart")).dragAndDropBy(100, 0);
$(byClassName("legend")).hover().$(byText("Hide")).click();
$(byCssSelector(".chart > .title")).shouldHave(text("Sales Report"));

: Этот запрос находит элемент на странице с идентификатором "chart" и перетаскивает его на 100 пикселей вправо.
    Затем он находит элемент на странице с классом "legend" и наводит на него курсор мыши, затем находит элемент
    на странице с текстом "Hide" и кликает на него. Затем он находит элемент на странице с селектором ".chart > .title"
    и проверяет, что он содержит текст "Sales Report".

$(byText("Add Item")).scrollIntoView(true).click();
$(byClassName("item")).last().$(byText("Edit")).click();

$(byClassName("form")).$(byName("name")).setValue("New Item").pressTab().$(byName("price")).setValue("100").pressEnter();
: Этот запрос находит элемент на странице с текстом "Add Item" и прокручивает страницу до него, затем кликает на него.
    Затем он находит последний элемент на странице с классом "item", кликает на элемент с текстом "Edit". Затем он находит элемент

$(byClassName("menu")).$$("li").findBy(text("Settings")).hover().click();
$(byName("username")).setValue("user123");
$(byName("password")).setValue("pass123").pressEnter();

: Этот запрос находит элемент на странице с классом "menu" и находит все элементы li внутри него.
    Затем он находит элемент, содержащий текст "Settings", наводит на него курсор мыши и кликает на него.
    Затем он находит элемент на странице по имени "username" и вводит значение "user123", затем находит элемент
    на странице по имени "password" и вводит значение "pass123", нажимает клавишу Enter для авторизации.

$(byText("Menu")).hover();
$(byText("Dropdown")).parent().$(byText("Option 1")).click();
$(byId("modal")).shouldBe(visible); $(byClassName("close")).click();

 :Этот запрос находит элемент на странице с текстом "Menu" и наводит на него курсор мыши.
    Затем он находит элемент на странице с текстом "Dropdown" и находит его родительский элемент,
    затем находит элемент на странице с текстом "Option 1" и кликает на него. Затем он проверяет,
    что элемент на странице с идентификатором "modal" видим, затем находит элемент на странице с классом "close" и кликает на него.

$(byName("query")).setValue("SELECT * FROM customers").pressEnter();
$(byCssSelector(".result > table")).should(exist);
$(byCssSelector(".result > table > tbody > tr:nth-child(1)")).shouldHave(text("John"));

: Этот запрос находит элемент на странице по имени "query" и вводит SQL-запрос "SELECT * FROM customers", затем нажимает клавишу Enter.
    Затем он проверяет, что элемент на странице с селектором ".result > table" существует.
    Затем он проверяет, что первая строка таблицы на странице с селектором ".result > table > tbody > tr:nth-child(1)" содержит текст "John".

$(byId("canvas")).contextClick().$(byText("Save")).click();
$(byClassName("save-dialog")).shouldBe(visible);
$(byClassName("filename")).setValue("diagram.png");
$(byClassName("save-button")).click();

 :Этот запрос находит элемент на странице с идентификатором "canvas" и кликает на нем правой кнопкой мыши.
    Затем он находит элемент на странице с текстом "Save" и кликает на нем. Затем он проверяет,
    что элемент на странице с классом "save-dialog" видим, затем находит элемент на странице с классом "filename" и вводит
    имя файла "diagram.png", затем находит элемент на странице с классом "save-button" и кликает на него.

 */
}
