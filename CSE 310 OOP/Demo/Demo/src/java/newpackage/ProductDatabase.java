package newpackage;
import java.sql.*;

public class ProductDatabase {
    Connection con;
    public ProductDatabase(Connection con){
        this.con = con;
    }
    public boolean saveProduct(Product product){
        boolean set = false;
        try{
            String query = "insert into product(pName,pDesc,pPrice,pDiscount,pQuantity,pPic,catId) values(?,?,?,?,?,?,?)";
            PreparedStatement pst = this.con.prepareStatement(query);
            pst.setString(1,product.getpName());
            pst.setString(2,product.getpDesc());
            pst.setInt(3,product.getpPrice());
            pst.setInt(4,product.getpDiscount());
            pst.setInt(5,product.getpQuantity());
            pst.setString(6,product.getpPic());
            pst.setInt(7,product.getcatId());
            
            pst.executeUpdate();
           set = true;  
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return set;
    }
   
      
    public List<Product> getAllProducts(){
        Product product =null;
        List<Product> listProduct = new ArrayList();
        //Hashtable<Integer, String> cat = new Hashtable<>();
        try{
            String query = "select * from product";
            PreparedStatement pst = this.con.prepareStatement(query);
            ResultSet rs =pst.executeQuery();
            while(rs.next()){
                 product = new Product();
                 product.setpId(rs.getInt("pId"));
                 product.setpName(rs.getString("pName"));
                 product.setpDesc(rs.getString("pDesc"));
                 product.setpPrice(rs.getInt("pPrice"));
                 product.setpDiscount(rs.getInt("pDiscount"));
                 product.setpQuantity(rs.getInt("pQuantity"));
                 product.setpPic(rs.getString("pPic"));
                 product.setcatId(rs.getInt("catId"));
                 //product.setCatId(rs.getInt("catId"));
//                 String s =category.getCatTitle();
//                 int id = category.getCatId();
                listProduct.add(product);
                //cat.put(id,s);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        return listProduct;
    }  
    
    
//    get all products of given category
    public List<Product> getAllProductsById(int cid){
        Product product =null;
        List<Product> listProduct = new ArrayList();
        //Hashtable<Integer, String> cat = new Hashtable<>();
        try{
            String query = "select * from product as p where p.catId = ? " ;
            
            PreparedStatement pst = this.con.prepareStatement(query);
            pst.setInt(1,cid);
            ResultSet rs =pst.executeQuery();
            while(rs.next()){
                 product = new Product();
                 product.setpId(rs.getInt("pId"));
                 product.setpName(rs.getString("pName"));
                 product.setpDesc(rs.getString("pDesc"));
                 product.setpPrice(rs.getInt("pPrice"));
                 product.setpDiscount(rs.getInt("pDiscount"));
                 product.setpQuantity(rs.getInt("pQuantity"));
                 product.setpPic(rs.getString("pPic"));
                 product.setcatId(rs.getInt("catId"));
                 //product.setCatId(rs.getInt("catId"));
//                 String s =category.getCatTitle();
//                 int id = category.getCatId();
                listProduct.add(product);
                //cat.put(id,s);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        return listProduct;
    }  


}