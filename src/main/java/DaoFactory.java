import java.sql.SQLException;

public class DaoFactory {
    private static Ads adsDao;
	private static Config config;

	public static Ads getAdsDao() {
    	try {
		    if (adsDao == null) {
			    adsDao = new MySQLAdsDao(config);
		    }
	    } catch (SQLException throwables){
    		throwables.printStackTrace();
	    }
        return adsDao;
    }
}
