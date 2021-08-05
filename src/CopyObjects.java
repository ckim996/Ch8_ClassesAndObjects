public class CopyObjects
{
    public static void main(String[] args)
    {
        System.out.println("Using Wrong way to Object copy: ");
        Rectangle wr = new Rectangle(1,2);
        Rectangle wr2 = wr;
        if(wr == wr2)
        {
            System.out.println("Confirming two same objects");
        }else{
            System.out.println("Confirming two different objects");
        }

        System.out.println(wr2.getLength() + " " + wr2.getWidth());

        System.out.println("\nUsing Right way to Object copy: ");
        Rectangle r = new Rectangle(1,2);
        Rectangle r2 = r.copy();
        if(r == r2)
        {
            System.out.println("Confirming two same objects");
        }else{
            System.out.println("Confirming two different objects");
        }

        System.out.println("\nAnother correct way to Object copy using Constructor: ");
        Rectangle conCopy = new Rectangle(r);
        if(conCopy == r)
        {
            System.out.println("Confirming two same objects");
        }else{
            System.out.println("Confirming two different objects");
        }
    }
}
