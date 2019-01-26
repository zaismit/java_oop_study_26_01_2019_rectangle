public class rectangle extends main_file
{
    int height;
    int length;

    void rectangle(int length, int height)
    {
        this.height = height;
        this.length = length;
    }
    int area()
    {
        int area;

            area = height * length;

        return area;
    }
    int perimeter()
    {
        int perimeter;

            perimeter = (height + length) * 2;

        return perimeter;
    }
}
