import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(1200, 600);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(45, 150, 207);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
	// sample code, delete this stuff
    /*
    stroke(128);
    line(150, 25, 270, 350);  

    stroke(255);
    line(50, 125, 70, 50);  
*/
    draw_section_outlines();
    draw_section1();
    draw_section2();
    draw_section3();
    draw_section4();
	  
    draw_section5();
    draw_section6();
    draw_section7();
    draw_section8();

    
  }


  /**
   * Draw the outlines for all sections
   */
  public void draw_section_outlines(){
    stroke(0);
    noFill();

    // draw bottom row boxes
    rect(0,300, 300, 300);
    rect(300, 300, 300, 300);
    rect(600, 300, 300, 300);
    rect(900, 300, 300, 300);

    // draw top row boxes
    rect(0,0, 300, 300);
    rect(300, 0, 300, 300);
    rect(600, 0, 300, 300);
    rect(900, 0, 300, 300);
  }
  
  /**
   * draws the bottom left section
   */
  public void draw_section1(){

  for (int oneX = 3; oneX <= 297; oneX += 10) {
    for (int oneY = 303; oneY <= 597; oneY += 10) {
      fill(255);
      noStroke();
      rect(oneX, oneY, 5, 5);
    }
  }
}
  
  /**
   * Use the modulus operator and an if statement to select the color
   * Don't loop from 30 to 60 to shift everything over, just add 300 to x.
   */
  public void draw_section2(){
     
    for (int twoX = 303; twoX <= 587; twoX += 20) {
      for (int twoY = 303; twoY <= 597; twoY += 10) {
      fill(255);
      noStroke();
      rect(twoX, twoY, 5, 5);
      }
    }

    for (int tworX = 313; tworX <= 597; tworX += 20) {
      for (int tworY = 303; tworY <= 597; tworY += 10) {
      fill(0);
      noStroke();
      rect(tworX, tworY, 5, 5);
      }
    }
  }

  /**
   * Use the modulus operator and an if/else statement to select the color.
   * Don't use multiple 'if' statements.
   */
  public void draw_section3(){
    
    for (int thX = 603; thX <= 897; thX += 10) {
      for (int thY = 313; thY <= 597; thY += 20) {
      fill(255);
      noStroke();
      rect(thX, thY, 5, 5);
      }
    }

    for (int thtX = 603; thtX <= 897; thtX += 10) {
      for (int thtY = 303; thtY <= 587; thtY += 20) {
      fill(0);
      noStroke();
      rect(thtX, thtY, 5, 5);
      }
    }
  }

  /**
   * Use the modulus operator and just one 'if' statement to select the color.
   */
  public void draw_section4(){
    
    for (int oneX = 903; oneX <= 1197; oneX += 10) {
      for (int oneY = 303; oneY <= 597; oneY += 10) {
      fill(0);
      noStroke();
      rect(oneX, oneY, 5, 5);
      }
    }

    for (int onerX = 903; onerX <= 1197; onerX += 20) {
      for (int onerY = 313; onerY <= 597; onerY += 20) {
      fill(255);
      noStroke();
      rect(onerX, onerY, 5, 5);
      }
    }

    // just figured out you can repeat variable names in different draw sections 
  }

  /**
   * Do NOT use 'if' statements to complete 5-8. Manipulate the loops instead
   */
  public void draw_section5(){

    for (int onerX = 3; onerX <= 297; onerX += 10) {
      for (int onerY = 3; onerY <= 297; onerY += 10) {
        fill(255);
        noStroke();
        rect(onerX, onerY, 5, 5);
        
    }

    for (int oneX = 3; oneX <= 297; oneX += 10) {
      for (int oneY = 3; oneY <= 297 - oneX; oneY += 10) {
        
        fill(45, 150, 207);
        noStroke();
        rect(oneX, oneY, 5, 5);
        
      }
    }
  }
  }

  public void draw_section6(){
    
    for (int oneX = 303; oneX <= 597; oneX += 10) {
      for (int oneY = 3; oneY <= 297; oneY += 10) {
        if(oneY + 300 >= oneX){
          fill(255);
          noStroke();
          rect(oneX, oneY, 5, 5);
        }
      }
    }
  }

  public void draw_section7(){
    for (int oneX = 603; oneX <= 897; oneX += 10) {
      for (int oneY = 3; oneY <= 297 - oneX + 600; oneY += 10) {
        
        fill(255);
        noStroke();
        rect(oneX, oneY, 5, 5);
        
      }
    }
  }
  
  public void draw_section8(){
    for (int oneX = 903; oneX <= 1197; oneX += 10) {
      for (int oneY = 3; oneY <= 297; oneY += 10) {
        if(oneY + 900 <= oneX){
          fill(255);
          noStroke();
          rect(oneX, oneY, 5, 5);
        }
      }
    }
  }






}
