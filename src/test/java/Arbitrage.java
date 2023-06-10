import com.google.gson.JsonObject;
import functions.api.RestFunctions;

public class Arbitrage {

    public static void main(String[] args) {

        JsonObject respKucoin = RestFunctions.getRequestREST(Kucoin.BASE_URI,"/api/v1/market/orderbook/level1", "?symbol=BTC-USDT");
        System.out.println("Kucoin BTC-USDT:" + respKucoin.get("data").getAsJsonObject().get("price"));

//        JsonObject respKraken = new Kraken().getRequestREST("/0/public/Depth","?pair=BTCUSDT&count=2");
//        JsonObject respKraken = new Kraken().getRequestREST("/0/public/OHLC","?pair=BTCUSDT");
        JsonObject respKraken = RestFunctions.getRequestREST(Kraken.BASE_URI,"/0/public/Trades","?pair=BTCUSDT");

        System.out.println("Kraken BTC-USDT:" + respKraken.get("result").getAsJsonObject().get("XBTUSDT").getAsJsonArray().get(999).getAsJsonArray().get(0));

    }

}
