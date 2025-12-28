package Myagro.model;
import jakarta.persistence.*;


public class product {
    private Long id;
     private  String name;
      private String category;
      private  double price;
        public product(){

        }
        public Long getId(){
            return id;
        }
        public void setId(Long id){
            this.id=id;

        }
        public String getName(){
            return name;

        }
        public void setName(String name){
            this.name=name;

        }
        public String getCategory(){
            return category;

        }
        public void setCategory(String catagory){
            this.category=catagory;
        }
        public double getPrice(){
            return price;

        }
        public void setPrice(double price){
            this.price=price;

        }

}
