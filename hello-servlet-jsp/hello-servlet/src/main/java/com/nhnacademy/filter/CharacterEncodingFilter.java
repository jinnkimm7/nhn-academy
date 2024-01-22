package com.nhnacademy.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

// 어노테이션을 활용해 설정을 간편하게 할 수 있습니다.
@WebFilter("/*")
public class CharacterEncodingFilter implements Filter {
    @Override
    public void doFilter(
            ServletRequest request,
            ServletResponse response,
            FilterChain chain) throws IOException, ServletException {
        // 이 흐름을 다음으로 넘겨줄것인가 말것인가를 FilterChain chain이 결정합니다.

//        System.out.println("before filter");
        // 이제 모든 서블릿은 인코딩 환경을 갖게됩니다.
        response.setCharacterEncoding("utf-8");
        chain.doFilter(request,response);
//        System.out.println("after filter");
    }
}
