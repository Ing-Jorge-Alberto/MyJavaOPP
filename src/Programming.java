public class Programming {
    boolean learningComplete=false;
    private String languageName;

    public Programming(String language){ //Constructor
        languageName=language;
    }

    public void learningStatus(){ //Method
        if(learningComplete==false){
            System.out.println("Learning ... "+languageName);
        }else System.out.println("Mastered ... "+languageName);
    }

    public void completeLearning(){ //Method
        learningComplete=true;
    }
}
