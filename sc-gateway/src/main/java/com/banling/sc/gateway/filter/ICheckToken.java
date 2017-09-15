package com.banling.sc.gateway.filter;

/**检查Token是否合法
 * @author Ban
 *
 */
public interface ICheckToken {
	/**检查Token是否合法
	 * @param Token String
	 * @return boolean
	 */
	boolean validateToken(String Token);
}
