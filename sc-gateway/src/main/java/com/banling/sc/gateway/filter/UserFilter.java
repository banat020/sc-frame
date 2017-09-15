package com.banling.sc.gateway.filter;

import com.netflix.zuul.ZuulFilter;
import javax.servlet.http.HttpServletRequest;
import com.netflix.zuul.context.RequestContext;
import com.banling.sc.gateway.filter.ICheckToken;

/**过滤用户，实现安全控制
 * @author Ban
 *
 */
public class UserFilter extends ZuulFilter {
	
	private final String FIlTER_TYPE="pre";
	
	private ICheckToken checkToken=new ICheckToken(){

		@Override
		public boolean validateToken(String Token) {
			// TODO Auto-generated method stub
			if(Token==null||Token.trim().length()<3){
				return false;
			}else{
				return true;
			}
			
		}
		
	};

	@Override
	public Object run() {
		// TODO Auto-generated method stub
		RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        String userToken=request.getParameter("user-token");
        System.out.println(userToken);
        //todo, 验证Token
        if(checkToken.validateToken(userToken)){
        	ctx.setSendZuulResponse(true);// 对该请求进行路由  
            ctx.setResponseStatusCode(200);  
            ctx.set("success", true);//向下一个过滤器传递信息
        }else{
        	ctx.setSendZuulResponse(false);// 过滤该请求，不对其进行路由  
            ctx.setResponseStatusCode(401);
            ctx.setResponseBody("{\"result\":\"no authority\"}");// 返回错误内容  
            ctx.set("success", false);
        }
		return null;
	}

	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return FIlTER_TYPE;
	}

}
