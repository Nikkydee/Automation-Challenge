package testcases;

public class Payload {
    public static String CreateDynamicUser(String vName, String vJob) {
        String user = "{\r\n"
                + "    \"name\": \""+vName+"\",\r\n"
                + "    \"job\": \""+vJob+"\"\r\n"
                + "}";

        return user;
    }
}
