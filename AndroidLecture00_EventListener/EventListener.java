class eventListener
{
    public void onNotify(int e)
    {
        if(e == 0)
        {
            onAnheCalled();
        }
        else if(e == 1)
        {
            onLoveCalled();
        }
    }

    private void onAnheCalled()
    {
        System.out.println("I'm so tired");
        System.out.println("Android sucks..");
    }

    private void onLoveCalled()
    {
        System.out.println("I'm so tired");
        System.out.println("But I love EunSeok..");
    }
}