package ie.tudublin;

import processing.core.PApplet;

public class Loops extends PApplet 
{

    public void settings() 
    {
        size(500, 500); // size of the screen 
        cx = width / 2; // width is divided by 2 
        cy = height / 2;        
    }

    int mode = 0;

    float cx;
    float cy;

    public void keyPressed() 
    {
        // the value of mode will be the number of the 
        // number key pressed
        if (keyCode >= '0' && keyCode <= '9') // Assigning the value of the numeric value 0 to 9 to the variable mode 
            mode = keyCode - '0';
    }

    public void setup() 
    {
        colorMode(HSB); // setting the colour mode to HSB instead of RGB
    }

    public void draw() 
    {
        background(0); // Setting the background black 
        noStroke(); // don't draw stroke outside of the shape
        switch (mode) // Switching the value of mode 
        {
            /* case 0:
                ellipse(cx, cy, 100, 100);
                break;
            */
            case 0:
                fill(50, 255, 255);                    
                if (mouseX < cx)  
                {
                    rect(0, 0, cx, height); // height = height of the screen 
                }
                else
                {
                    rect(cx, 0, cx, height);
                }
                break;
            case 1:
                fill(50, 255, 255);                                    
                if (mouseX < cx && mouseY < cy) // cx = centre x 
                {
                    rect(0, 0, cx, cy);
                }
                else if (mouseX > cx && mouseY < cy)
                {
                    rect(cx, 0, cx, cy);
                }
                else if (mouseX < cx && mouseY > cy)
                {
                    rect(0, cy, cx, cy);
                }
                else
                {
                    rect(cx, cy, cx, cy);
                }
                break;
            case 2:
            {
                int numRects = (int)(mouseX / 10.0f); // There are 10 rectangulars 
                float w = width / (float) numRects;
                float cgap = 255 / (float) numRects; // gap 
                for(int i = 0 ; i < numRects ; i ++)
                {
                    fill(i * cgap, 255, 255); 
                    rect(i * w, 0, w, height); // draw rectangles 
                }
                break;
            }
            case 3:
            {
                int numCircles = (int)(mouseX / 10.0f);
                float w = width / (float) numCircles;
                float cgap = 255 / (float) numCircles;
                for(int i = 0 ; i < numCircles ; i ++)
                {
                    fill(cgap * i, 255, 255);
                    ellipse(w / 2 + (i * w), cy, w, w); // the first one is the centre point of the circle 
                }
            }
            break;
        }
    }
}
