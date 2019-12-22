package com.londonappbrewery.destini;

public class StoryPath {

    private int storyID;
    private int storyAns1;
    private int storyAns2;

    public StoryPath(int tempStoryID, int tempAns1, int tempAns2){
        storyID = tempStoryID;
        storyAns1 = tempAns1;
        storyAns2 = tempAns2;
    }

    public int getStoryID() {
        return storyID;
    }

    public void setStoryID(int storyID) {
        this.storyID = storyID;
    }

    public int getStoryAns1() {
        return storyAns1;
    }

    public void setStoryAns1(int storyAns1) {
        this.storyAns1 = storyAns1;
    }

    public int getStoryAns2() {
        return storyAns2;
    }

    public void setStoryAns2(int storyAns2) {
        this.storyAns2 = storyAns2;
    }
}
