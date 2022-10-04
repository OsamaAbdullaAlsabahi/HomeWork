public class Q2_TallyCounter {

    private int num;
             private int udo;
         private int limit;
    public Q2_TallyCounter()
         {num = 0;}

    public void click(){
        if(num <= (limit-1))
        {
            num++;
            udo = num;
        }
    else
            System.out.println("sorry you reached your limitation.");

    }

    public int getClick()
    {return num;}

    public void reset()
    {num = 0;}

    public void undo()
    {
        if(num == udo)
        {
            num = num - 1;
        }
        else
            System.out.println("sorry you reached your limitation ");

    }
    public void setLimit(int c)
    {    if( c > 0)
        limit = c;
    else
        System.out.println("you entered invalid number");
    }


}
