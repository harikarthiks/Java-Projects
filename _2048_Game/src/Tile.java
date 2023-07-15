import java.awt.Color;


/**
 *
 * Represents an individual tile in the game. Has an integer value and a color
 * value - both of which change as they are combined
 */
public class Tile
{
    int value;
    Color tileColor;
    public Tile()
    {
        value = 0;
    }
    public Tile( int number )
    {
        value = number;
    }
    public int getValue()
    {
        return value;
    }
    public void setValue( int value )
    {
        this.value = value;
    }

    //Represents the tile as a String - used in the GUI
    public String toString()
    {
        return "" + value;
    }

    public void setColor()
    {
        if ( this.getValue() == 2 )
        {
            tileColor = new Color( 238, 228, 218 );
        }
        else if ( this.getValue() == 4 )
        {
            tileColor = new Color( 238, 225, 202 );
        }
        else if ( this.getValue() == 8 )
        {
            tileColor = new Color( 243, 178, 122 );
        }
        else if ( this.getValue() == 16 )
        {
            tileColor = new Color( 246, 149, 100 );
        }
        else if ( this.getValue() == 32 )
        {
            tileColor = new Color( 247, 124, 95 );
        }
        else if ( this.getValue() == 64 )
        {
            tileColor = new Color( 247, 95, 60 );
        }
        else if ( this.getValue() == 128 )
        {
            tileColor = new Color( 237, 208, 115 );
        }
        else if ( this.getValue() == 256 )
        {
            tileColor = new Color( 238, 204, 98 );
        }
        else if ( this.getValue() == 512 )
        {
            tileColor = new Color( 237, 200, 80 );
        }
        else if ( this.getValue() == 1024 )
        {
            tileColor = new Color( 237, 197, 63 );
        }
        else if (this.getValue() == 0)
        {
            tileColor = new Color( 204, 192, 180);
        }
    }

    public Color getColor()
    {
        this.setColor();
        return tileColor;
    }

}
