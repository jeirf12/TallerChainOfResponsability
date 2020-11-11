package co.edu.unicauca.cor.domain;

/**
 *
 * @author Libardo, Julio
 */
public class ClaimManager {

    private LevelOne levelOne;
    private LevelTwo levelTwo;
    private LevelThree levelThree;
    private LevelFour levelfour;

    public void createAthentionFlow() {
        levelOne = new LevelOne("mariaortega@gmail.com");
        levelTwo = new LevelTwo("oscarsanchez@gmail.com");
        levelThree = new LevelThree("kate@gmail.com");
        levelfour=new LevelFour("coco@gmail.com");
        // Crea los enlaces
        levelOne.setNextHandler(levelTwo);
        levelTwo.setNextHandler(levelThree);
        levelThree.setNextHandler(levelfour);
    }

    public LevelOne getLevelOne() {
        return levelOne;
    }

    public void setLevelOne(LevelOne levelOne) {
        this.levelOne = levelOne;
    }

    public LevelTwo getLevelTwo() {
        return levelTwo;
    }

    public void setLevelTwo(LevelTwo levelTwo) {
        this.levelTwo = levelTwo;
    }

    public LevelThree getLevelThree() {
        return levelThree;
    }

    public void setLevelThree(LevelThree levelThree) {
        this.levelThree = levelThree;
    }

    public LevelFour getLevelfour() {
        return levelfour;
    }

    public void setLevelfour(LevelFour levelfour) {
        this.levelfour = levelfour;
    }
    

}
