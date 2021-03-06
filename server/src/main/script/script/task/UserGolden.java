package script.task;

import com.xinqihd.sns.gameserver.config.MoneyType;
import com.xinqihd.sns.gameserver.config.TaskPojo;
import com.xinqihd.sns.gameserver.db.mongo.TaskManager.TaskHook;
import com.xinqihd.sns.gameserver.entity.user.User;
import com.xinqihd.sns.gameserver.script.ScriptManager;
import com.xinqihd.sns.gameserver.script.ScriptResult;
import com.xinqihd.sns.gameserver.util.TaskStep;

/**
 * When the user collects given number of golden, the task
 * is finished.
 * 
 * @author wangqi
 *
 */
public class UserGolden {

	public static ScriptResult func(Object[] parameters) {
		ScriptResult result = ScriptManager.checkParameters(parameters, 3);
		if ( result != null ) {
			return result;
		}
		User user = (User)parameters[0];
		TaskPojo task = (TaskPojo)parameters[1];
		TaskHook hook = (TaskHook)parameters[2];
		if ( hook == TaskHook.WEALTH ) {
			Object[] array = (Object[])parameters[3];
			MoneyType moneyType = (MoneyType)array[0];
			Integer money = (Integer)array[1];
			if ( moneyType == MoneyType.GOLDEN ) {
				if ( money != null ) {
					TaskStep.step(task, user, money.intValue(), true);
				}
			}
		}
		
		result = new ScriptResult();
		result.setType(ScriptResult.Type.SUCCESS);
		result.setResult(null);
		return result;
	}
	
}
