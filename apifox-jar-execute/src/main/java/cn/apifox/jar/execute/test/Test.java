package cn.apifox.jar.execute.test;

import cn.apifox.jar.execute.test.param.Combine;
import cn.apifox.jar.execute.test.param.CombineParam;
import com.alibaba.fastjson.JSONObject;

import java.util.List;

public class Test {
    public Test() {

    }
    public static void main(String[] args) {
        String str = "After:" + args[0] + args[1];
        System.out.print(str);
    }

    public String combine(String a, String b) {
        String str = "combine 1:" + a + b + "\n";
        return str;
    }

    public String combine(int a, int b) {
        String str = "combine 2:" + ( a + b )+ "\n";
        return str;
    }

    public String combine(CombineParam param) {
        String str = "combine 3:" + param.getA() + param.getB() + "\n";
        return str;
    }

    public String combine(Combine param) {
        String str = "combine 4:" + param.getA() + param.getB() + param.getC() + "\n";
        return str;
    }

    public String combine(Combine param, CombineParam combineParam) {
        String str = "combine 5:" + param.getA() + param.getB() + param.getC() + "\n";
        return str;
    }

    public String combine(CombineParam combineParam, Combine param) {
        String str = "combine 6:" + param.getA() + param.getB() + param.getC() + "\n";
        return str;
    }

    public String combine(List<Combine> param) {
        System.out.println(JSONObject.toJSONString(param));
        String str = "combine 7:" + param.size() + "\n";
        return str;
    }
}

