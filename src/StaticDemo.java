public class StaticDemo
{
    public static void main(String[] args)
    {
        int count;

        // Create three instances of Static class
        Static obj1 = new Static();
        Static obj2 = new Static();
        Static obj3 = new Static();



        count = obj1.getInstanceCount();
        System.out.println(count + " instances of the class were created");
    }
}
