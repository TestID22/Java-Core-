import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class Http {
    public static void main(String[] args) throws IOException {

        HttpClient client = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet("http://www.girnyk.dn.ua");

        HttpResponse resp = client.execute(httpGet);//получает ответ
        String ans = EntityUtils.toString(resp.getEntity()); //приводим к читаемому виду
        System.out.println(ans);


        HttpPost reqPost = new HttpPost("http://www.girnyk.dn.ua");
        reqPost.setHeader("Тест Просто ТЕСТ, прости Админ", "name VALUE" );
        HttpResponse HTTPRESP = client.execute(reqPost);
        String answer = EntityUtils.toString(HTTPRESP.getEntity());
        System.out.println(answer);
    }
}
