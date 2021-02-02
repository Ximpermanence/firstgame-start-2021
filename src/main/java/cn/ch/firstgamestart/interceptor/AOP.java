package cn.ch.firstgamestart.interceptor;

import cn.ch.firstgamestart.common.result.Result;
import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @description: AOP
 * @author: chenhao
 * @create:2021/2/1 10:21
 **/
@Aspect
@Component
public class AOP {

    private static final String TOKEN_KEY = "X-Token";

    /**
     * Controller层切点
     */
//    @Pointcut("within(cn.ch.firstgamestart.controller..*)&&!within(cn.ch.firstgamestart.controller.PlayerUserController.**)")
//    @Pointcut(value = "execution(* cn.ch.firstgamestart.controller.*(..))&&execution(* (!cn.ch.firstgamestart.controller.PlayerUserController).*(..))")
//   @Pointcut("execution(* (!cn.ch.firstgamestart.controller.PlayerUserController+).*(..))")
//   * (!cn.javass..IPointcutService+).*(..)
    @Pointcut("within(cn.ch.firstgamestart.controller.PlayerUserController)")
//    @Pointcut("execution(* cn.ch.firstgamestart.controller.PlayerUserController.*(..))")
//    @Pointcut("execution(* cn.ch.firstgamestart.controller.*(..))")
    public void controllerAspect() {
    }

    /**
     * 修改请求参数
     *
     * @param joinPoint
     * @return
     * @throws Throwable
     */
//    @Around("controllerAspect()")
    public Result doAround(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("进入到AOP了");
        //获取用户的缓存数据
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        HttpServletResponse response = attributes.getResponse();
        String token = getToken(request);
        if (StringUtils.isEmpty(token)) {
            System.out.println("aop拦截 token为空");
//            response.sendError(500,"token为空，没有登录无法获取其他信息");
//            return joinPoint.proceed();
            return Result.error("token为空，没有登录无法获取其他信息");
        }
        Object[] obj = joinPoint.getArgs();
        System.out.println("aop拦截token不为空");
//        return joinPoint.proceed(obj);
        return Result.success(joinPoint.proceed(obj));
    }

    /**
     * 根据参数或者header获取token
     *
     * @param request
     * @return
     */
    public static String getToken(HttpServletRequest request) {
        String token = request.getParameter(TOKEN_KEY);
        if (StringUtils.isBlank(token)) {
            token = request.getHeader(TOKEN_KEY);
        }
        return token;
    }

}
