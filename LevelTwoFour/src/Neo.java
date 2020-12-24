public class Neo
{
    public static void main(String[] args)
    {
        System.out.println(Matrix.NEO);

    }

    static class Matrix
    {
        public static DBObject NEO= new User().initializedIdAndName(1,"Neo");
    }

    interface DBObject
    {
       DBObject initializedIdAndName(long id, String name);
    }

    static class User implements DBObject
    {
        long id;
        String name;

        public User initializedIdAndName(long id, String name)
        {
            this.id=id;
            this.name=name;
            return this;
        }
        @Override
        public String toString()
        {
            return String.format("The name user's is %s, id = %d ",name,id);
        }



    }
}
