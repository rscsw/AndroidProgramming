class EventDrivenExample
{
    public static void main(String args[])
    {
        EunSeok es = new EunSeok();
        Illidan il = new Illidan();
        es.Click();
        il.Click();
    }
}

class Illidan
{
    eventListener Quest;

    public Illidan()
    {
        Quest = new eventListener();
    }

    public void Click()
    {
        System.out.println("I'm Illidan");
        Quest.onNotify(0);
    }
}

class Sylvanas
{
    eventListener Quest;

    public Sylvanas()
    {
        Quest = new eventListener();
    }

    public void Click()
    {
        System.out.println("I'm Sylvanas");
        Quest.onNotify(1);
    }
}

class EunSeok
{
    eventListener Quest;
    Sylvanas s;

    public EunSeok()
    {
        s = new Sylvanas();
        Quest = new eventListener();
    }

    public void Click()
    {
        System.out.println("Sylvanas is mine");
        s.Click();
        Quest.onNotify(2);
    }
}