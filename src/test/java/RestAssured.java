public class RestAssured {
    //dependencies {
    //    implementation 'org.junit.jupiter:junit-jupiter-api:5.7.0'
    //    testRuntimeOnly 'org.junit.jupiter:junit-jupiter-engine:5.7.0'
    //    testImplementation group: 'org.junit.jupiter', name: 'junit-jupiter-params', version: '5.7.0'
    //    testImplementation 'org.junit.platform:junit-platform-commons:1.9.0'
    //    testImplementation 'io.rest-assured:rest-assured:5.3.0'
    //    testImplementation 'io.rest-assured:json-path:5.3.0'
    //    testImplementation 'io.rest-assured:json-schema-validator:5.3.0'
    //    implementation group: 'org.json', name: 'json', version: '20090211'
    //    testImplementation group: 'commons-io', name: 'commons-io', version: '2.6'
    //
    //}

    /**1
     *
     */
    //@TestInstance(TestInstance.Lifecycle.PER_CLASS)
    //public class AssertAll4 {
//    private static final String EMAIL = "user3@example.com";
//    private static final String PASSWORD = "Superbowl-recipe";
//
//    @Test
//    @DisplayName("Проверка имени автора и id")
//    void allFieldsTestPassed() {
//        String token = login(EMAIL, PASSWORD);
//
//        String createPost = "{" +
//                "    \"title\": \"1815551\"," +
//                "    \"body\": \"ЛолКекЧебурек\"" +
//                "}";
//        JsonPath jsonValidator = RestAssured.given()
//                .header("Content-Type", "application/json")
//                .header("Cookie", "token=" + token)
//                .body(createPost)
//                .post("/posts").then().statusCode(HTTP_OK).extract().jsonPath();
//        assertAll(
//                () -> assertEquals("Гари", jsonValidator.get("author"), jsonValidator.prettyPrint()),
//                () -> assertNotNull(jsonValidator.get("id"))
//        );
//
//    }
//
//    private String login(String email, String password) {
//        RestAssured.baseURI = "http://qa-games.ru:9000";
//        String authData = "{" +
//                "\"email\": " + "\"" + email + "\"" + "," +
//                "\"password\": " + "\"" + password + "\"" + " " +
//                "}";
//
//        return RestAssured.given()
//                .header("Content-Type", "application/json")
//                .body(authData).post("/users/login").getCookie("token");
//    }

    /**2
     *
     */
    //@TestInstance(TestInstance.Lifecycle.PER_CLASS)
    //public class  AssertTest2 {
//    @Test
//    void firstTest() {
//        String token = login();
//        String createPost = "{" +
//                "    \"title\": \"9988717877\"," +
//                "    \"body\": \"ЛолКекЧебурек\"" +
//                "}";
//        JsonPath jsonValidator = RestAssured.given()
//                .header("Content-Type", "application/json")
//                .header("Cookie", "token=" + token)
//                .body(createPost)
//                .post("/posts").jsonPath();
//
//        assertEquals("Гари", jsonValidator.get("author"), jsonValidator.prettyPrint());
//    }
//
//    private static String login() {
//        RestAssured.baseURI = "http://qa-games.ru:9000";
//        String authData = "{" +
//                "\"email\": \"user3@example.com\"," +
//                "\"password\": \"Superbowl-recipe\" " +
//                "}";
//
//        return RestAssured.given()
//                .header("Content-Type", "application/json")
//                .body(authData).post("/users/login").getCookie("token");
//    }

    /** 3
     *
     */
    //@TestInstance(TestInstance.Lifecycle.PER_CLASS)
    //public class BeforAfter5 {
    //
    //
    //    private static final String EMAIL = "user3@example.com";
    //    private static final String PASSWORD = "Superbowl-recipe";
    //
    //    private String token;
    //
    //    ArrayList<String> idList = new ArrayList<>();
    //
    //    @BeforeAll
    //    public void beforAll() {
    //        System.out.println("Я before all. Исполняюсь один раз ПЕРЕД ВСЕХ тестов");
    //        token = login(EMAIL, PASSWORD);
    //    }
    //
    //    @AfterAll
    //    public void afterAll() {
    //        deletePostById(idList, token);
    //        System.out.println("Я after all. Исполняюсь один раз ПОСЛЕ ВСЕХ тестов");
    //    }
    //
    //    @BeforeEach
    //    public void beforeEach() {
    //        System.out.println("Я before each. Исполняюсь ПЕРЕД КАЖДЫМ тестом");
    //    }
    //
    //    @AfterEach
    //    public void afterEach() {
    //        System.out.println("Я after each. Исполняюсь ПОСЛЕ КАЖДОГО теста");
    //    }
    //
    //
    //    @Test
    //    @DisplayName("Проверка имени автора")
    //    void separateTest1() {
    //        String createPost = "{" +
    //                "    \"title\": " + "\"" + generateRandomString() + "\"" + "," +
    //                "    \"body\": " + "\"" + generateRandomString() + "\"" + "" +
    //                "}";
    //        JsonPath jsonValidator = RestAssured.given()
    //                                            .header("Content-Type", "application/json")
    //                                            .header("Cookie", "token=" + token)
    //                                            .body(createPost)
    //                                            .post("/posts").then().statusCode(HTTP_OK).extract().jsonPath();
    //
    //        assertEquals("Гари", jsonValidator.get("author"), "Автор не Гари");
    //        idList.add(jsonValidator.get("id"));
    //        System.out.println("Я тест 1");
    //    }
    //
    //    @Test
    //    @DisplayName("Проверка id")
    //    void separateTest2() {
    //        String createPost = "{" +
    //                "    \"title\": " + "\"" + generateRandomString() + "\"" + "," +
    //                "    \"body\": " + "\"" + generateRandomString() + "\"" + "" +
    //                "}";
    //        JsonPath jsonValidator = RestAssured.given()
    //                                            .header("Content-Type", "application/json")
    //                                            .header("Cookie", "token=" + token)
    //                                            .body(createPost)
    //                                            .post("/posts").then().statusCode(HTTP_OK).extract().jsonPath();
    //
    //        assertNotNull(jsonValidator.get("id"));
    //
    //        idList.add(jsonValidator.get("id"));
    //        System.out.println("Я тест 2");
    //    }
    //
    //
    //    private String login(String email, String password) {
    //        RestAssured.baseURI = "http://qa-games.ru:9000";
    //        String authData = "{" +
    //                "\"email\": " + "\"" + email + "\"" + "," +
    //                "\"password\": " + "\"" + password + "\"" + " " +
    //                "}";
    //
    //        return RestAssured.given()
    //                          .header("Content-Type", "application/json")
    //                          .body(authData).post("/users/login").getCookie("token");
    //    }
    //
    //    private String generateRandomString() {
    //
    //        int leftLimit = 97; // letter 'a'
    //        int rightLimit = 122; // letter 'z'
    //        int targetStringLength = 10;
    //        Random random = new Random();
    //        StringBuilder buffer = new StringBuilder(targetStringLength);
    //        for (int i = 0; i < targetStringLength; i++) {
    //            int randomLimitedInt = leftLimit + (int)
    //                    (random.nextFloat() * (rightLimit - leftLimit + 1));
    //            buffer.append((char) randomLimitedInt);
    //        }
    //        return buffer.toString();
    //    }
    //
    //
    //    private void deletePostById(ArrayList<String> idList, String token) {
    //        for (int i = 0; i < idList.size(); i++) {
    //            RequestSpecification httpRequestDelete = RestAssured.given();
    //            httpRequestDelete.header("Content-Type", "application/json");
    //            httpRequestDelete.header("Cookie", "token=" + token);
    //
    //            httpRequestDelete.delete("/posts/" + idList.get(i)).then().statusCode(200);
    //        }
    //    }

    /**4
     *
     */
    //public class FakeTest1 {
    //
    //
    //    public static void main(String[] args) {
    //        justTest();
    //    }
    //
    //    public static void justTest() {
    //        String token = login();
    //
    //        String createPost = "{" +
    //                "    \"title\": \"888777666555444123\"," +
    //                "    \"body\": \"ЛолКекЧебурек\"" +
    //                "}";
    //
    //        JsonPath jsonValidator = RestAssured.given()
    //                                            .header("Content-Type", "application/json")
    //                                            .header("Cookie", "token=" + token)
    //                                            .body(createPost)
    //                                            .post("/posts").jsonPath();
    //
    //        if (Objects.equals(jsonValidator.get("author"), "Гари")) {
    //            System.out.println("SUCCEESS!");
    //
    //        } else {
    //            System.out.println("FAILED " + "Автор не Гари!");
    //        }
    //    }
    //
    //    private static String login() {
    //        RestAssured.baseURI = "http://qa-games.ru:9000";
    //        String authData = "{" +
    //                "\"email\": \"user3@example.com\"," +
    //                "\"password\": \"Superbowl-recipe\" " +
    //                "}";
    //
    //        return RestAssured.given().header("Content-Type", "application/json")
    //                          .body(authData).post("/users/login").getCookie("token");
    //    }

    /**5
     *
     */
//@TestInstance(TestInstance.Lifecycle.PER_CLASS)
//public class HomeWork {
//
//    private static final String EMAIL_1 = "user3@example.com";
//    private static final String EMAIL_2 = "user2@example.com";
//    private static final String PASSWORD_1 = "Superbowl-recipe";
//    private static final String PASSWORD_2 = "require-Absorb";
//
//    @BeforeAll
//    public void makeSources() {
//        File file = new File("../junit-hw/src/test/resources/test.csv");
//        try (PrintWriter writer = new PrintWriter(file)) {
//            StringBuilder sb = new StringBuilder();
//            sb.append("Гари");
//            sb.append(',');
//            sb.append(login(EMAIL_1, PASSWORD_1));
//            sb.append('\n');
//            sb.append("Джо");
//            sb.append(',');
//            sb.append(login(EMAIL_2, PASSWORD_2));
//
//            writer.write(sb.toString());
//        } catch (FileNotFoundException e) {
//            System.out.println("Ошибка при открытии или создании файла" + e);
//        }
//    }
//    @ParameterizedTest
//    @CsvFileSource(resources = "/test.csv")
//    @DisplayName("Проверка созданного поста")
//    void checkAllPersons(String author, String token) {
//
//        JsonPath jsonValidator = RestAssured.given()
//                                            .header("Content-Type", "application/json")
//                                            .header("Cookie", "token=" + token)
//                                            .body(createPostWithTitleAndBodyWithoutPicture())
//                                            .post("/posts").then().statusCode(HTTP_OK).extract().jsonPath();
//
//        assertAll(
//                () -> assertEquals(author, jsonValidator.get("author")),
//                () -> assertNotNull(jsonValidator.get("id"))
//        );
//
//        deletePostById(jsonValidator.get("id"), token);
//    }
//
//
//    private String login(String email, String password) {
//        RestAssured.baseURI = "http://qa-games.ru:9000";
//        String authData = "{" +
//                "\"email\": " + "\"" + email + "\"" + "," +
//                "\"password\": " + "\"" + password + "\"" + " " +
//                "}";
//
//        return RestAssured.given()
//                          .header("Content-Type", "application/json")
//                          .body(authData).post("/users/login").getCookie("token");
//    }
//
//    private String generateRandomString() {
//
//        int leftLimit = 97; // letter 'a'
//        int rightLimit = 122; // letter 'z'
//        int targetStringLength = 10;
//        Random random = new Random();
//        StringBuilder buffer = new StringBuilder(targetStringLength);
//        for (int i = 0; i < targetStringLength; i++) {
//            int randomLimitedInt = leftLimit + (int)
//                    (random.nextFloat() * (rightLimit - leftLimit + 1));
//            buffer.append((char) randomLimitedInt);
//        }
//        return buffer.toString();
//    }
//
//    private String createPostWithTitleAndBodyWithoutPicture() {
//        String createPost = "{" +
//                "    \"title\": " + "\"" + generateRandomString() + "\"" + "," +
//                "    \"body\": " + "\"" + generateRandomString() + "\"" + "" +
//                "}";
//        return createPost;
//    }
//
//    private void deletePostById(String id, String token) {
//        RequestSpecification httpRequestDelete = RestAssured.given();
//        httpRequestDelete.header("Content-Type", "application/json");
//        httpRequestDelete.header("Cookie", "token=" + token);
//
//        httpRequestDelete.delete("/posts/" + id).then().statusCode(200);
//    }

    /**6
     *
     */
    //@TestInstance(TestInstance.Lifecycle.PER_CLASS)
    //public class ParamsTest6 {
    //
    //    private static final String EMAIL_1 = "user3@example.com";
    //    private static final String EMAIL_2 = "user2@example.com";
    //    private static final String PASSWORD_1 = "Superbowl-recipe";
    //    private static final String PASSWORD_2 = "require-Absorb";
    //
    //    private static String token1;
    //    private static String token2;
    //
    //    @BeforeAll
    //    public void beforeAll() {
    //        token1 = login(EMAIL_1, PASSWORD_1);
    //        token2 = login(EMAIL_2, PASSWORD_2);
    //    }
    //
    //    @ParameterizedTest
    //    @MethodSource("getUserData")
    //    @DisplayName("Проверка созданного поста")
    //    void checkAllPresons(String author, String token) throws InterruptedException {
    //        String createPost = "{" +
    //                "    \"title\": " + "\"" + generateRandomString() + "\"" + "," +
    //                "    \"body\": " + "\"" + generateRandomString() + "\"" + "" +
    //                "}";
    //
    //        JsonPath jsonValidator = RestAssured.given()
    //                                            .header("Content-Type", "application/json")
    //                                            .header("Cookie", "token=" + token)
    //                                            .body(createPost)
    //                                            .post("/posts").then().statusCode(HTTP_OK).extract().jsonPath();
    //
    //        assertAll(
    //                () -> assertEquals(author, jsonValidator.get("author")),
    //                () -> assertNotNull(jsonValidator.get("id"))
    //        );
    //
    //        deletePostById(jsonValidator.get("id"), token);
    //    }
    //
    //
    //    private String login(String email, String password) {
    //        RestAssured.baseURI = "http://qa-games.ru:9000";
    //        String authData = "{" +
    //                "\"email\": " + "\"" + email + "\"" + "," +
    //                "\"password\": " + "\"" + password + "\"" + " " +
    //                "}";
    //
    //        return RestAssured.given()
    //                          .header("Content-Type", "application/json")
    //                          .body(authData).post("/users/login").getCookie("token");
    //    }
    //
    //
    //    private String generateRandomString() {
    //
    //        int leftLimit = 97; // letter 'a'
    //        int rightLimit = 122; // letter 'z'
    //        int targetStringLength = 10;
    //        Random random = new Random();
    //        StringBuilder buffer = new StringBuilder(targetStringLength);
    //        for (int i = 0; i < targetStringLength; i++) {
    //            int randomLimitedInt = leftLimit + (int)
    //                    (random.nextFloat() * (rightLimit - leftLimit + 1));
    //            buffer.append((char) randomLimitedInt);
    //        }
    //        return buffer.toString();
    //    }
    //
    //    private void deletePostById(String id, String token) {
    //        RequestSpecification httpRequestDelete = RestAssured.given();
    //        httpRequestDelete.header("Content-Type", "application/json");
    //        httpRequestDelete.header("Cookie", "token=" + token);
    //
    //        httpRequestDelete.delete("/posts/" + id).then().statusCode(200);
    //    }
    //
    //    private static Stream<Arguments> getUserData() {
    //        return Stream.of(Arguments.of("Гари", token1),
    //                         Arguments.of("Джо", token2));
    //
    //    }

    /**7
     *
     */
    //@TestInstance(TestInstance.Lifecycle.PER_CLASS)
    //public class SeparateCopy3 {
    //
    //    private static final String EMAIL = "user3@example.com";
    //    private static final String PASSWORD = "Superbowl-recipe";
    //
    //    @Test
    //    @DisplayName("Проверка имени автора и id")
    //    void separateTest1() {
    //        String token = login(EMAIL, PASSWORD);
    //
    //        RestAssured.baseURI = "http://qa-games.ru:9000";
    //        String createPost = "{" +
    //                "    \"title\": \"112111324\"," +
    //                "    \"body\": \"ЛолКекЧебурек\"" +
    //                "}";
    //        JsonPath jsonValidator = RestAssured.given()
    //                                            .header("Content-Type", "application/json")
    //                                            .header("Cookie", "token=" + token)
    //                                            .body(createPost)
    //                                            .post("/posts").jsonPath();
    //
    //        assertEquals("Гари", jsonValidator.get("author"), jsonValidator.prettyPrint());
    //        assertNotNull(jsonValidator.get("id"), jsonValidator.prettyPrint());
    //    }
    //
    //    @Test
    //    @DisplayName("Проверка id")
    //    void separateTest2() {
    //        String token = login(EMAIL, PASSWORD);
    //
    //        String createPost = "{\n" +
    //                "    \"title\": \"111111jh\"," +
    //                "    \"body\": \"ЛолКекЧеaaбурек\"" +
    //                "}";
    //        JsonPath jsonValidator = RestAssured.given()
    //                                            .header("Content-Type", "application/json")
    //                                            .header("Cookie", "token=" + token)
    //                                            .body(createPost)
    //                                            .post("/posts").jsonPath();
    //
    //
    //    }
    //
    //    private String login(String email, String password) {
    //        RestAssured.baseURI = "http://qa-games.ru:9000";
    //        String authData = "{\n" +
    //                "\"email\": " + "\"" + email + "\"" + ",\n" +
    //                "\"password\": " + "\"" + password + "\"" + " \n" +
    //                "}";
    //
    //        return RestAssured.given()
    //                          .header("Content-Type", "application/json")
    //                          .body(authData).post("/users/login").getCookie("token");
    //    }

}
