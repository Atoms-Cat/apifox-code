package cn.apifox.jar.execute.v2;

import com.alibaba.fastjson.JSONObject;
import org.reflections.Reflections;
import org.reflections.scanners.Scanners;
import org.reflections.util.ClasspathHelper;
import org.reflections.util.ConfigurationBuilder;

import java.io.File;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static org.reflections.scanners.Scanners.SubTypes;

/**
 * @author th158
 */
public class Execute {
    public static void main(String[] args) {
        System.out.println(getParam(args));
    }

    /**
     * 检查并且获取参数
     * @param args
     * @return
     */
    public static String getParam(String[] args) {
        if (args != null && args.length >= 3) {
            // jar 绝对路径
            String jarPath = args[0];
            // 类包路径
            String classPath = args[1];
            // 方法名称
            String methodName = args[2];
            // 方法参数
            List<String> argList = new ArrayList<>();
            for (int i = 0; i < args.length; i++) {
                if (i != 0 && i != 1 && i != 2) {
                    argList.add(args[i]);
                }
            }
            // 获取方法，并且执行返回结果
            Object resp = getMethod(jarPath, classPath, methodName, argList.toArray(new String[0]));
            // 解析结果
            return getResp(resp);
        }
        return "参数异常";
    }

    /**
     * 获取方法，并且执行返回结果
     * @param jarPath
     * @param classPath
     * @param methodName
     * @param args
     * @return
     */
    public static Object getMethod(String jarPath, String classPath, String methodName, String[] args) {
        // 获取文件
        File jarFile = new File(jarPath);
        // 判断文件是否存在
        if (jarFile.isFile()) {
            try {
                // 获取文件url
                URL url = jarFile.toURI().toURL();
                // 加载jar的类
                ClassLoader classLoader = new URLClassLoader(new URL[]{url});
                String path = classPath.substring(0, classPath.lastIndexOf("."));
                Reflections reflections = new Reflections(
                        new ConfigurationBuilder()
                                .forPackage(path, classLoader)
                );
                // 查询指定的类
                Class<?> loadClass = classLoader.loadClass(classPath);
                Set<Class<?>> modules = reflections.get(SubTypes.of().asClass());

                System.out.println(JSONObject.toJSONString(modules));

                return null;
            } catch (MalformedURLException e) {
                System.out.println(JSONObject.toJSONString(e));
                return jarPath + "文件路径异常";
            } catch (ClassNotFoundException e) {
                System.out.println(JSONObject.toJSONString(e));
                return classPath + "类不存在";
            }
        } else {
            return jarPath + "文件不存在";
        }
    }

    public static String getResp(Object resp) {
        if (resp instanceof String) {
            return resp.toString();
        }
        return JSONObject.toJSONString(resp);
    }

}
