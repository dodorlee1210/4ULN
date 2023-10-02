import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

public class ExploringAPI {

    public static void main(String... args) {
        String exQuestion = "Scenario: I found a pair of trump cards while searching around for something to eat. " +
                "There's something to play with today! Options: 1. Practice poker, 2. Practice magic tricks, " +
                "3. Preserve the card.";

        String response = chatGPT(exQuestion + "I will take option 2." + " " +
                "Respond with the next possible scenario and possible options for the next moves");

        System.out.println(response);
    }

    public static String chatGPT(String message) {
        String url = "https://api.openai.com/v1/chat/completions";
        String token = System.getenv("OPENAI_TOKEN");
        String model = "gpt-3.5-turbo";

        try {
            // Create the HTTP POST request
            URL obj = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) obj.openConnection();
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Authorization", "Bearer " + token);
            connection.setRequestProperty("Content-Type", "application/json");

            // Build the request body
            String body = "{\"model\": \"" + model + "\", \"messages\": [{\"role\": \"user\", \"content\": \"" +
                    message + "\"}]}";
            connection.setDoOutput(true);
            OutputStreamWriter writer = new OutputStreamWriter(connection.getOutputStream());
            writer.write(body);
            writer.flush();
            writer.close();

            // Get response
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }

            in.close();

            // return the content's part only.
            return getResponse(response.toString());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getResponse(String response) {
        int startIndex = response.indexOf("content") + 11;
        int endIndex = response.indexOf("\"", startIndex);

        return response.substring(startIndex, endIndex);
    }
}


// Java code:
//A minimal example of calling the API from Java.
//The output of the program should indicate the result of the request.
//Tools like those above will generate code snippets for you, as will some API documentation pages.
// You can also refer to the code from the Grade API lab activity for examples using OkHttp.