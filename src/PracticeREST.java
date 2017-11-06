import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;


public class PracticeREST {
    //Throws a MalformedURLException
//    URL url = new URL("https://swapi.co/api/");

    public static void main(String []args){
        new PracticeREST().testIt();
    }

        private void testIt(){

        String https_url = "https://swapi.co/api/people/3/?format=json";
        URL url;

        try{
            url = new URL(https_url);
            HttpsURLConnection con = (HttpsURLConnection)url.openConnection();

            //Prints all Info. Even html. Need to fix.
            print_content(con);
        }
        catch (MalformedURLException e){
            e.printStackTrace();
        }
        catch(IOException u){
            u.getStackTrace();
        }
    }

    //Read data from url ?? Problem >> Prints HTML too ...?
    private void print_content(HttpsURLConnection con){
        if(con!=null){

            try {

                System.out.println("****** Content of the URL ********");
                BufferedReader br =
                        new BufferedReader(
                                new InputStreamReader(con.getInputStream()));

                String input;

                while ((input = br.readLine()) != null){
                    System.out.println(input);
                }
                br.close();

            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
}
