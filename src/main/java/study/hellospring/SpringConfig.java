package study.hellospring;
import org.springframework.beans.factory.annotation.Autowired;
import study.hellospring.aop.TimeTraceAop;
import study.hellospring.repository.*;
import study.hellospring.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;
import javax.sql.DataSource;
@Configuration
public class SpringConfig {

    private final MemberRepository memberRepository;

    @Autowired
    public SpringConfig(MemberRepository memberRepository){
        this.memberRepository=memberRepository;
    }

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository);
    }

    //@Bean
    //public TimeTraceAop timeTraceAop(){
    //    return new TimeTraceAop();
    //}
    //@Bean
    //public MemberRepository memberRepository() {
        // return new MemoryMemberRepository();
        // return new JdbcMemberRepository(dataSource);
        //return new JdbcTemplateMemberRepository(dataSource);
    //    return new JpaMemberRepository(em);
    //}
}
