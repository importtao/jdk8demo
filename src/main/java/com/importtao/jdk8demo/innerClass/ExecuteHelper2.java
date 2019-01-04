package com.importtao.jdk8demo.innerClass;

public class ExecuteHelper2 {
    public static void execute(Execute execute) {
        execute.doExecute();
    }

    /**
     * 带有返回值得执行方法、可以实现代码的静态织入
     * @param execute
     * @param umpKey
     * @param <T>
     * @return
     */
    public static <T> T execute(Execute execute, String umpKey) {
        System.out.println("start========" + umpKey);
        try {
            return (T)execute.doExecute();
        } catch (Exception e) {
            System.out.println("umpKey===>" + umpKey);
        }
        System.out.println("end========" + umpKey);

        return null;
    }

    private interface Execute {
        Object doExecute();
    }

    //测试匿名内部类的使用方式
    public static void main(String[] args) {
        ExecuteHelper2.execute(() -> Study.print());
        String xxx = ExecuteHelper2.execute(() -> Study.print(), "xxx");
        String execute = ExecuteHelper2.execute(() -> Study.sayHello("zhangsan"), "zzz");

        System.out.println(xxx + "==========" + execute);
    }

    public static class Study {
        public static String print() {
            System.out.println("Hello world*******");
            return "中国";
        }

        public static String sayHello(String userName) {
            System.out.println("say Hello *******" + userName);
            return "龙的传人";
        }
    }

}
