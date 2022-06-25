import cn.apifox.jar.execute.v1.Execute;

public class ExecuteTest {

    public static void main(String[] args) {
        Execute.main(new String[]{"C:\\tools\\work\\github\\apifox-core\\apifox-core\\apifox-jar-execute\\target\\apifox-jar-execute-1.0-SNAPSHOT.jar", "cn.apifox.jar.execute.test.Test", "combine", "eee", "2"});
        Execute.main(new String[]{"C:\\tools\\work\\github\\apifox-core\\apifox-core\\apifox-jar-execute\\target\\apifox-jar-execute-1.0-SNAPSHOT.jar", "cn.apifox.jar.execute.test.Test", "combine", "1", "5"});
        Execute.main(new String[]{"C:\\tools\\work\\github\\apifox-core\\apifox-core\\apifox-jar-execute\\target\\apifox-jar-execute-1.0-SNAPSHOT.jar", "cn.apifox.jar.execute.test.Test", "combine", "{\"class\":\"cn.apifox.jar.execute.test.param.CombineParam\",\"a\":\"1\",\"b\":\"2\"}"});
        Execute.main(new String[]{"C:\\tools\\work\\github\\apifox-core\\apifox-core\\apifox-jar-execute\\target\\apifox-jar-execute-1.0-SNAPSHOT.jar", "cn.apifox.jar.execute.test.Test", "combine", "{\"class\":\"cn.apifox.jar.execute.test.param.Combine\",\"a\":\"1\",\"b\":\"3\",\"c\":\"2\"}"});
        Execute.main(new String[]{"C:\\tools\\work\\github\\apifox-core\\apifox-core\\apifox-jar-execute\\target\\apifox-jar-execute-1.0-SNAPSHOT.jar", "cn.apifox.jar.execute.test.Test", "combine", "{\"class\":\"cn.apifox.jar.execute.test.param.Combine\",\"a\":\"1\",\"b\":\"3\",\"c\":\"2\"}", "{\"class\":\"cn.apifox.jar.execute.test.param.CombineParam\",\"a\":\"1\",\"b\":\"3\",\"c\":\"2\"}" });
        Execute.main(new String[]{"C:\\tools\\work\\github\\apifox-core\\apifox-core\\apifox-jar-execute\\target\\apifox-jar-execute-1.0-SNAPSHOT.jar", "cn.apifox.jar.execute.test.Test", "combine", "{\"class\":\"cn.apifox.jar.execute.test.param.CombineParam\",\"a\":\"1\",\"b\":\"3\",\"c\":\"2\"}", "{\"class\":\"cn.apifox.jar.execute.test.param.Combine\",\"a\":\"1\",\"b\":\"3\",\"c\":\"2\"}" });
        Execute.main(new String[]{"C:\\tools\\work\\github\\apifox-core\\apifox-core\\apifox-jar-execute\\target\\apifox-jar-execute-1.0-SNAPSHOT.jar", "cn.apifox.jar.execute.test.Test", "combine", "[{\"a\":\"1\",\"b\":\"3\"},{\"a\":\"1\",\"b\":\"3\"}]"});
    }
}
