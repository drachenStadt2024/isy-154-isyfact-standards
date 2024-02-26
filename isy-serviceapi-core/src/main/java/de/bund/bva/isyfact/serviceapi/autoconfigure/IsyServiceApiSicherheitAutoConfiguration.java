package de.bund.bva.isyfact.serviceapi.autoconfigure;

import org.springframework.aop.Advisor;
import org.springframework.aop.aspectj.AspectJExpressionPointcut;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import de.bund.bva.isyfact.aufrufkontext.AufrufKontextFactory;
import de.bund.bva.isyfact.aufrufkontext.AufrufKontextVerwalter;
import de.bund.bva.isyfact.serviceapi.core.aufrufkontext.AufrufKontextToResolver;
import de.bund.bva.isyfact.serviceapi.core.aufrufkontext.StelltAufrufKontextBereitInterceptor;
import de.bund.bva.isyfact.sicherheit.autoconfigure.IsySicherheitAutoConfiguration;

/**
 * @deprecated This module is deprecated and will be removed in a future release.
 * It is recommended to use <a href="https://isyfact.github.io/isyfact-standards-doku/latest/isy-service-rest/konzept/master.html">REST according to IsyFacts REST Concept</a> instead.
 */
@Deprecated
@Configuration
@ConditionalOnClass(IsySicherheitAutoConfiguration.class)
@AutoConfigureAfter(IsySicherheitAutoConfiguration.class)
public class IsyServiceApiSicherheitAutoConfiguration {

    @Bean
    @ConditionalOnBean({ AufrufKontextFactory.class, AufrufKontextVerwalter.class })
    public StelltAufrufKontextBereitInterceptor stelltAufrufKontextBereitInterceptor(
            AufrufKontextFactory factory,
            AufrufKontextVerwalter verwalter,
            AufrufKontextToResolver resolver) {
        return new StelltAufrufKontextBereitInterceptor(factory, verwalter, resolver);
    }

    @Bean
    @ConditionalOnBean(StelltAufrufKontextBereitInterceptor.class)
    public Advisor stelltAufrufKontextBereitAdvisor(StelltAufrufKontextBereitInterceptor interceptor) {
        AspectJExpressionPointcut pointcut = new AspectJExpressionPointcut();
        pointcut.setExpression(
                "@annotation(de.bund.bva.isyfact.serviceapi.core.aufrufkontext.StelltAufrufKontextBereit) || @within(de.bund.bva.isyfact.serviceapi.core.aufrufkontext.StelltAufrufKontextBereit)");
        return new DefaultPointcutAdvisor(pointcut, interceptor);
    }
}
