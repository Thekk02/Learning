package TheBasics.day7;

public class Teacher {
    public void checkScore(int score) throws ScoreException{
        if(score<0||score>100){
            throw new ScoreException("你给的分数有误，应该在0到100之间");
        }else{
            System.out.println("正常");
        }

    }
}
