public class Player
{
    private int width, height, depth, x_Position, y_Position, z_Position;

    public Player(int w, int h, int d, int x_Pos, int y_Pos, int z_Pos)
    {
        this.width = w;
        this.height = h;
        this.depth = d;
        this.x_Position = x_Pos;
        this.y_Position = y_Pos;
        this.z_Position = z_Pos;
    }
    public void move_X(int x_delta)
    {
       x_Position += x_delta;
    }
    public void move_Y(int y_delta)
    {
       y_Position += y_delta;
    }
    public void move_Z(int z_delta)
    {
        z_Position += z_delta;
    }
    public boolean didTheyCollide(Player otherplayer)
    {
        if(x_Position < (otherplayer.width + otherplayer.x_Position) && (width + x_Position) > otherplayer.x_Position
        && y_Position < (otherplayer.height + otherplayer.y_Position) && (height + y_Position) > otherplayer.y_Position &&
                (z_Position < (otherplayer.depth + otherplayer.z_Position) && (depth + z_Position) > otherplayer.z_Position))
        {
            System.out.print("Collision occurred!");
            return true;
        }
        else
        {
            return false;
        }
    }
    public int getWidth()
    {
        return width;
    }
    public int getHeight()
    {
        return height;
    }
    public int getDepth()
    {
        return depth;
    }
    public int getX_Position()
    {
        return x_Position;
    }
    public int getY_Position()
    {
        return y_Position;
    }
    public int getZ_Position()
    {
        return z_Position;
    }
}
