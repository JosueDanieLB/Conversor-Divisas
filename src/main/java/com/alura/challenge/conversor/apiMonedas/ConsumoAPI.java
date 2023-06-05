package com.alura.challenge.conversor.apiMonedas;
import com.alura.challenge.conversor.monedas.Divisas;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;


//URL https://openexchangerates.org/api/latest.json?app_id=7c869ff4c81c47c38486cf055f10a32c
//URL test https://jsonplaceholder.typicode.com/users

public class ConsumoAPI {

    // ORG JSON method
    //public static void main(String[] args) throws Exception {
    public static void Consultar(){

        try {

        Object USD = null;
        Object MXN = null;
        Object EUR = null;
        Object GBP = null;
        Object JPY = null;
        Object KRW = null;


            URL url = new URL("https://openexchangerates.org/api/latest.json?app_id=7c869ff4c81c47c38486cf055f10a32c");
            HttpURLConnection cx = (HttpURLConnection) url.openConnection();
            cx.setRequestMethod("GET");
            cx.connect();

            int responseCode = cx.getResponseCode();
            if (responseCode != 200) {
                throw new RuntimeException("Ocurrió un error: " + responseCode);
            } else {

                InputStream strm = cx.getInputStream();
                byte[] arrStream = strm.readAllBytes();

                String cntJson = "";

                for (byte tmp : arrStream)
                    cntJson += (char) tmp;

                //System.out.println(cntJson);

                JSONArray json = new JSONArray("[" + cntJson + "]");

                for (Object obj : json) {
                    USD = new JSONObject(((JSONObject) obj).get("rates").toString()).get("USD");
                    MXN = new JSONObject(((JSONObject) obj).get("rates").toString()).get("MXN");
                    EUR = new JSONObject(((JSONObject) obj).get("rates").toString()).get("EUR");
                    GBP = new JSONObject(((JSONObject) obj).get("rates").toString()).get("GBP");
                    JPY = new JSONObject(((JSONObject) obj).get("rates").toString()).get("JPY");
                    KRW = new JSONObject(((JSONObject) obj).get("rates").toString()).get("KRW");
                }

                System.out.println("Consulta en API realizada");

                String stringUSD = USD.toString();
                double doubleUSD = Double.parseDouble(stringUSD);
                String stringMXN = MXN.toString();
                double doubleMXN = Double.parseDouble(stringMXN);
                String stringEUR = EUR.toString();
                double doubleEUR = Double.parseDouble(stringEUR);
                String stringGBP = GBP.toString();
                double doubleGBP = Double.parseDouble(stringGBP);
                String stringJPY = JPY.toString();
                double doubleJPY = Double.parseDouble(stringJPY);
                String stringKRW = KRW.toString();
                double doubleKRW = Double.parseDouble(stringKRW);

                Divisas divisas = new Divisas();
                //divisas.consulta(doubleUSD, doubleMXN, doubleEUR, doubleGBP, doubleJPY, doubleKRW);
                divisas.setUSD(doubleUSD);
                divisas.setMXN(doubleMXN);
                divisas.setEUR(doubleEUR);
                divisas.setGBP(doubleGBP);
                divisas.setJPY(doubleJPY);
                divisas.setKRW(doubleKRW);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        }
    }



