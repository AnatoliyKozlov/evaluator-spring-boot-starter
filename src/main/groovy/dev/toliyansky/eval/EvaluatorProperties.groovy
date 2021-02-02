package dev.toliyansky.eval

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration

@Configuration
@SuppressWarnings(['ConfigurationProperties', 'UnnecessaryQualifiedReference'])
@ConfigurationProperties(prefix = EvaluatorProperties.PREFIX)
class EvaluatorProperties {
    public static final def PREFIX = 'evaluator'

    @SuppressWarnings('unused')
    private boolean enabled

    @SuppressWarnings('unused')
    private boolean webUiEnabled
}
