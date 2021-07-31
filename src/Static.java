public class Static
{
    private static int instanceCount = 0;

    /*
    Constructor increments the static field instanceCount.
    This keeps track of the number of instances of this
    class that are created.
     */

    public Static()
    {
        instanceCount++;
    }

    /*
    The getInstanceCount method returns the number
    of instances of this class that have been created.
    @return The value in the instanceCount field
     */
    public int getInstanceCount()
    {
        return instanceCount;
    }
}
