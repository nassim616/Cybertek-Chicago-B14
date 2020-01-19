package methods;

public class LamDb {
    public static void main(String[] args) {
        System.out.println(lameDb("1tst#2bla#3foo","none","1",""));
    }
    public static String lameDb(String db, String op, String id, String data){
        if(op.equals("add")){
            db=db+"#"+id+data;
        }
        if (op.equals("edit")){
            int ind_id = db.indexOf(id);
            int ind_hash =db.indexOf("#",ind_id);
            String replacing = db.substring(ind_id+1,ind_hash);
            db=db.replace(replacing,data);
        }
        if (op.equals("delete")){
            int ind_id = db.indexOf(id);
            int ind_hash =db.indexOf("#",ind_id);
            String replacing = db.substring(ind_id,ind_hash);
            db=db.replace(replacing,"");
        }
        if(op.equals("none")){
            db=db;
        }
        return db;
    }
}

