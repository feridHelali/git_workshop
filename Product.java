public class Product{
    private String id,
    private String label;
    private float price;
    
    public Product(int id,String label,float price){
        this.id=id;
        this.label=label;
        this.price=price;
    }

    public String ToString(){
        return "Id:"+this.id+"\nlabel:"+this.label;
    }

}