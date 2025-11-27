 class Quis {
    String ques,option1,option2,option3,option4,answer;
    Quis(String ques,String o1,String o2,String o3,String o4,String ans)
    {
        this.ques=ques;
        this.option1=o1;
        this.option2=o2;
        this.option3=o3;
        this.option4=o4;
        this.answer= ans;

    }
    void showQuestion()
    {
        System.out.println(ques);
        System.out.println("1"+option1);
        System.out.println("2"+option2);
        System.out.println("3"+option3);
        System.out.println("4"+option4);
    
    }
    boolean checkAns(String ans)
    {
        return(answer.equals(ans));

    }
}
