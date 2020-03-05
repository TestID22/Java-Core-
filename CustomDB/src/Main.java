import com.september.DBclass.CustomDB;
import com.setpember.RowEntity.RowDB;

public class Main {

	public static void main(String[] args) {
		CustomDB dataBase = new CustomDB();
		RowDB row = new RowDB("Alex");
		RowDB row2 = new RowDB("Elena");
		RowDB row3 = new RowDB("TeST3");
		RowDB[] testArray = {row,row2,row3};
		
		dataBase.insert(testArray);
		
		dataBase.delete(2);
		dataBase.update(0, "Stas");
		dataBase.showData();
	}
}
