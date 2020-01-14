package day14.test2.test1_7;

public class Student {
    private String name;
    private Double score;

    public Student() {
    }

    public Student(String name, Double score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score)  throws NoScoreException{
        if(score<0){
            throw new NoScoreException("分数不能为负数："+score);
        }
        this.score = score;
    }

}
