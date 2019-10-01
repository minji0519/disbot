package disbot;

import listener.LunchListener;
import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDABuilder;

public class MainApp {
	public static void main(String[] args) {
		JDABuilder builder = new JDABuilder(AccountType.BOT);
		String token = "NjI4NDM0MjE0MzQxMTgxNDcx.XZLYGQ.g4tFBifhAUkXLy8Tbk0Zlx3B6xg";
		
		builder.setToken(token);
		
		try {
			builder.addEventListeners(new LunchListener());
			builder.build();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
