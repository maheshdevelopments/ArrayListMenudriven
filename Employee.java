class Employee
{
    int id;
    String name;
    Employee(int id, String name) 
    {
        this.id = id;
        this.name = name;
    }
    public String getname() 
    {
        return name;
    }
    public void setName(String name) 
    {
        this.name = name;
    }
    public int getid() 
    {
        return id;
    }
    public void setid(int id) 
    {
        this.id = id;
    }
    public String toString() 
    {
        return "ID:" + id + " name:" + name;
    }
}