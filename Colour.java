import java.awt.Color;
import java.util.Random;

/**
 * Hide the specific internal representation of colours
 *  from most of the program.
 * Map to Swing color when required.
 */
public enum Colour  
{ 
  RED(Color.RED), BLUE(Color.BLUE), GRAY(Color.GRAY), GREEN(Color.GREEN), ORANGE(Color.ORANGE), MAGENTA(Color.MAGENTA), CYAN(Color.CYAN);

  private final Color c;
  private static int colourIn = 0;
  private static int numColours = 7;

  Colour( Color c ) { this.c = c; }

  public Color forSwing() { return c; }
  
  static public Colour RandomColour(Colour current) 
  { 
	  if(colourIn <= numColours)
		  colourIn += 1;
	  else
		  colourIn = 0;
	  
	  switch(colourIn) 
	  {
	  case 0:
		  return Colour.RED;
	  case 1:
		  return Colour.BLUE;
	  case 2:
		  return Colour.GRAY;
	  case 3:
		  return Colour.GREEN;
	  case 4:
		  return Colour.ORANGE;
	  case 5:
		  return Colour.MAGENTA;
	  case 6:
		  return Colour.CYAN;
	  }
	  
	  return Colour.GRAY;
  }
}


