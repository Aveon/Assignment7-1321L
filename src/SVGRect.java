public class SVGRect
{
    private float width, height;
    private String fill_color, stroke_color;
    private float stroke_width, offset_x, offset_y;

    public SVGRect()
    {
        this.width = 1;
        this.height = 1;
        this.fill_color = "#0000FF";
        this.stroke_color = "#0F0F0F";
        this.stroke_width = 1.0f;
        this.offset_x = 0;
        this.offset_y = 0;
    }
    public SVGRect(float w, float h, String fillColor, String strokeColor)
    {
        this.width = w;
        this.height = h;
        this.fill_color = fillColor;
        this.stroke_color = strokeColor;
        this.stroke_width = 1.0f;
        this.offset_x = 0;
        this.offset_y = 0;
    }
    public boolean setDimensions(float userWidth, float userHeight)
    {
        if(userWidth > 0 && userHeight > 0)
        {
            this.width = userWidth;
            this.height = userHeight;
            return true;
        }
        else
        {
            return false;
        }
    }
    public void setOffsets(float x_value, float y_value)
    {
        this.offset_x = x_value;
        this.offset_y = y_value;
    }
    public boolean set_fill_stroke(String fillColor, String strokeColor, float strokeWidth)
    {
        if(strokeWidth > 0)
        {
            this.fill_color = fillColor;
            this.stroke_color = strokeColor;
            this.stroke_width = strokeWidth;
            return true;
        }
        else
        {
            return false;
        }
    }
    public void print_XML()
    {
        System.out.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<svg\n" +
                " xmlns=\"http://www.w3.org/2000/svg\"\n" +
                " xmlns:svg=\"http://www.w3.org/2000/svg\">\n" +
                " <rect\n" +
                "\t style=\"fill:"+ fill_color +"; stroke:"+ stroke_color +"; stroke-width:"+ stroke_width +"\"\n" +
                "\t width=\""+ width +"\"\n" +
                "\t height=\""+ height +"\"\n" +
                "\t x=\""+ offset_x +"\"\n" +
                "\t y=\""+ offset_y +"\" />\n" +
                "</svg>");
    }
}
