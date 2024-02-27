package methods;

public class LamDb {
    public static void main(String[] args) {
        System.out.println(lameDb("1tst#2bla#3foo","none","1",""));
    }
    public static String lameDb(String db, String op, String id, String data){
        if("add".equals(op)){
            db=db+"#"+id+data;
        }
        if ("edit".equals(op)){
            int ind_id = db.indexOf(id);
            int ind_hash =db.indexOf("#",ind_id);
            String replacing = db.substring(ind_id+1,ind_hash);
            db=db.replace(replacing,data);
        }
        if ("delete".equals(op)){
            int ind_id = db.indexOf(id);
            int ind_hash =db.indexOf("#",ind_id);
            String replacing = db.substring(ind_id,ind_hash);
            db=db.replace(replacing,"");
        }
        if("none".equals(op)){
            db=db;
        }
        return db;
    }
}

