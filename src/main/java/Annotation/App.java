package Annotation;


import java.lang.annotation.Annotation;

public class App {
    public static void main(String[]  args){
        Class cls = AnnotationSample.class;
        Annotation[] anno = cls.getAnnotations();
        int i = 0;
    }
}
