package stepik.basiccourse.all.exception41.task2;

public class Main {
    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        anotherMethod();
    }

    public static String getCallerClassAndMethodName() {
        StackTraceElement[] elements = new Throwable().getStackTrace();
        return elements.length > 2 ? elements[2].getClassName() + "#" + elements[2].getMethodName() : null;
    }


//    public static String getCallerClassAndMethodName() {
//        TestException testException = new TestException();
//        StringBuilder stringBuilder = new StringBuilder();
//        if (testException.getStackTrace().length > 2) {
//            String str = testException.getStackTrace()[2].toString();
//            String strnew = str.substring(0, str.indexOf("("));
//            stringBuilder.append(strnew).replace(strnew.lastIndexOf("."),strnew.lastIndexOf(".")+1,"#");
//        }
//        return (testException.getStackTrace().length > 2) ? stringBuilder.toString() : null;
//    }

//    public static String getCallerClassAndMethodName() {
//        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
//        return elements.length > 3 ? elements[3].getClassName() + "#" + elements[3].getMethodName() : null;
//    }

    public static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
        anotherMethod2();
    }

    public static void anotherMethod2() {
        System.out.println(getCallerClassAndMethodName());
    }

}
