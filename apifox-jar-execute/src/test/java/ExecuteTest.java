import cn.apifox.jar.execute.v1.Execute;

public class ExecuteTest {

    public static void main(String[] args) {
        Execute.main(new String[]{"C:\\tools\\work\\apifox\\jar\\target\\jar-1.0-SNAPSHOT.jar", "com.atomscat.Test", "combine", "eee", "2"});
        Execute.main(new String[]{"C:\\tools\\work\\apifox\\jar\\target\\jar-1.0-SNAPSHOT.jar", "com.atomscat.Test", "combine", "1", "5"});
        Execute.main(new String[]{"C:\\tools\\work\\apifox\\jar\\target\\jar-1.0-SNAPSHOT.jar", "com.atomscat.Test", "combine", "{\"class\":\"com.atomscat.param.CombineParam\",\"a\":\"1\",\"b\":\"3\",\"c\":\"2\"}"});
        Execute.main(new String[]{"C:\\tools\\work\\apifox\\jar\\target\\jar-1.0-SNAPSHOT.jar", "com.atomscat.Test", "combine", "{\"class\":\"com.atomscat.param.Combine\",\"a\":\"1\",\"b\":\"3\",\"c\":\"2\"}"});
        Execute.main(new String[]{"C:\\tools\\work\\apifox\\jar\\target\\jar-1.0-SNAPSHOT.jar", "com.atomscat.Test", "combine", "{\"class\":\"com.atomscat.param.Combine\",\"a\":\"1\",\"b\":\"3\",\"c\":\"2\"}", "{\"class\":\"com.atomscat.param.CombineParam\",\"a\":\"1\",\"b\":\"3\",\"c\":\"2\"}" });
        Execute.main(new String[]{"C:\\tools\\work\\apifox\\jar\\target\\jar-1.0-SNAPSHOT.jar", "com.atomscat.Test", "combine", "{\"class\":\"com.atomscat.param.CombineParam\",\"a\":\"1\",\"b\":\"3\",\"c\":\"2\"}", "{\"class\":\"com.atomscat.param.Combine\",\"a\":\"1\",\"b\":\"3\",\"c\":\"2\"}" });

    }
}
