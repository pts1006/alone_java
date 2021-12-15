package co.pts.prc;

public class NewInstanceExample {

	public static void main(String[] args) {
		/*동적 객체 생성 및 실행*/
		try {
//			Class clazz = Class.forName("co.pts.prc.SendAction");
			Class clazz = Class.forName("co.pts.prc.ReceiveAction");
			Action action = (Action) clazz.newInstance();
			action.execute();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}
