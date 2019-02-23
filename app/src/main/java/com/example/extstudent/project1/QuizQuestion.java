package com.example.extstudent.project1;

public class QuizQuestion {
    private String question;
    private String choiceA;
    private String choiceB;
    private String choiceC;
    private String choiceD;
    private String correctAnswer;

    // Constructor
    QuizQuestion() {
    }

    protected void setQuestion(String question) {
        /////////////////////////////////////////////////
        // TO-DO:  Set the question class variable.
        /////////////////////////////////////////////////
    }

    protected void setChoiceA(String answer) {
        /////////////////////////////////////////////////
        // TO-DO:  Set the first choice class variable.
        /////////////////////////////////////////////////
    }

    protected void setChoiceB(String answer) {
        /////////////////////////////////////////////////
        // TO-DO:  Set the second choice class variable.
        /////////////////////////////////////////////////
    }

    protected void setChoiceC(String answer) {
        /////////////////////////////////////////////////
        // TO-DO:  Set the third choice class variable.
        /////////////////////////////////////////////////
    }

    protected void setChoiceD(String answer) {
        /////////////////////////////////////////////////
        // TO-DO:  Set the fourth choice class variable.
        /////////////////////////////////////////////////
    }

    protected void setCorrectAnswer(String correctAnswer) {
        /////////////////////////////////////////////////
        // TO-DO:  Set the correct answer class variable.
        /////////////////////////////////////////////////
    }

    protected String getQuestion() {
        /////////////////////////////////////////////////
        // TO-DO: Returns the first answer.
        /////////////////////////////////////////////////
        return "";
    }

    protected String getChoiceA() {
        /////////////////////////////////////////////////
        // TO-DO: Returns the first answer.
        /////////////////////////////////////////////////
        return "";
    }

    protected String getChoiceB() {
        /////////////////////////////////////////////////
        // TO-DO: Returns the second answer.
        /////////////////////////////////////////////////
        return "";
    }

    protected String getChoiceC() {
        /////////////////////////////////////////////////
        // TO-DO: Returns the third answer.
        /////////////////////////////////////////////////
        return "";
    }

    protected String getChoiceD() {
        /////////////////////////////////////////////////
        // TO-DO: Returns the fourth answer.
        /////////////////////////////////////////////////
        return "";
    }

    protected boolean isCorrectAnswer(String answer) {
        if (this.correctAnswer == null) {
            // No correct answer has been set.
            return false;
        }
        /////////////////////////////////////////////////
        // TO-DO: Compare the passed in answer with the class' correct answer.
        /////////////////////////////////////////////////

        return false;
    }
}