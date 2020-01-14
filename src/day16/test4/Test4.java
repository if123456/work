package day16.test4;

public class Test4 {
    public static void main(String[] args) {
        //普通写法
        Director director=new Director() {
            @Override
            public void makeMovie() {
                System.out.println("导演制作电影");
            }
        };
        invokeDirect(director);

        //lambda表达式
        invokeDirect(new Director() {
            @Override
            public void makeMovie() {
                System.out.println("导演制作电影");
            }
        });

        //lambda简写
        invokeDirect(()->{
            System.out.println("导演制作电影");
        });

    }

    private static void invokeDirect(Director director){
        director.makeMovie();
    }
}
